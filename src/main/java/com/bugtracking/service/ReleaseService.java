package com.bugtracking.service;

import com.bugtracking.eniity.Release;

import java.util.List;

public interface ReleaseService {
    List<Release> listRelease();

    Release findRelease(long id);

    List<Release> finaReleaseByName(String name);

    Release save(Release release) throws Exception;

    void delete(long id);
}
