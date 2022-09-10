package com.bugtracking.service.impl;

import com.bugtracking.eniity.Application;
import com.bugtracking.repository.ApplicationRepository;
import com.bugtracking.service.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class ApplicationServiceImpl implements ApplicationService {

    public static final Logger LOGGER = LoggerFactory.getLogger(ApplicationServiceImpl.class);

    @Autowired
    ApplicationRepository applicationRepository;

    @Override
    public List<Application> listApplication() {
        LOGGER.info("Get all Application ");
        return (List<Application>) applicationRepository.findAll();
    }

    @Override
    public Application findApplication(long id) {
        LOGGER.info("Get Application using id : ", id);
        Optional<Application> application = applicationRepository.findById(id);
        if (application.isPresent()) {
            Application application1 = application.get();
            return application1;
        }
        return null;
    }

    @Override
    public List<Application> finaApplicationByName(String name) {
        LOGGER.info("Get Application using name : ", name);
        return null;
    }

    @Override
    public Application save(Application application) throws Exception {
        LOGGER.info("Save Application : ", application);
        Application application1 = null;
        application1 = applicationRepository.save(application);
        return application1;
    }

    @Override
    public void delete(long id) {
        LOGGER.info("Delete Application using id : ", id);
        applicationRepository.deleteById(id);
    }
}
