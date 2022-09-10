package com.bugtracking.service.impl;

import com.bugtracking.eniity.Release;
import com.bugtracking.repository.ReleaseRepository;
import com.bugtracking.service.ReleaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReleaseServiceImpl implements ReleaseService {
    public static final Logger LOGGER = LoggerFactory.getLogger(ReleaseServiceImpl.class);

    @Autowired
    ReleaseRepository releaseRepository;

    @Override
    public List<Release> listRelease() {
        LOGGER.info("Get all Release");
        return (List<Release>) releaseRepository.findAll();
    }

    @Override
    public Release findRelease(long id) {
        LOGGER.info("Get Release using id : ", id);
        Optional<Release> optionalRelease = releaseRepository.findById(id);
        if (optionalRelease.isPresent()) {
            Release release = optionalRelease.get();
            return release;
        }
        return null;
    }

    @Override
    public List<Release> finaReleaseByName(String name) {
        LOGGER.info("Get Release using name : ", name);
        return null;
    }

    @Override
    public Release save(Release release) throws Exception {
        LOGGER.info("Save Release :", release);
        Release release1 = null;
        release1 = releaseRepository.save(release);
        return release1;
    }

    @Override
    public void delete(long id) {
        LOGGER.info("Delete Release using id : ", id);
        releaseRepository.deleteById(id);
    }
}
