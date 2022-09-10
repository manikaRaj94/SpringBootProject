package com.bugtracking.repository;

import com.bugtracking.eniity.Release;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepository extends JpaRepository<Release,Long> {
}
