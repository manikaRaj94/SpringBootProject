package com.bugtracking.service;

import com.bugtracking.eniity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplication();

    Application findApplication(long id);

    List<Application> finaApplicationByName(String name);

    Application save(Application application) throws Exception;

    void delete(long id);
}
