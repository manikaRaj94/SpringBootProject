package com.bugtracking.repository;

import com.bugtracking.eniity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application,Long> {
}
