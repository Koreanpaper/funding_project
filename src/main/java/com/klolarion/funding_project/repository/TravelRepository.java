package com.klolarion.funding_project.repository;

import com.klolarion.funding_project.domain.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel, Long> {
}
