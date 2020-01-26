package com.stepanov.repository;

import com.stepanov.entity.EstimateDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimateDetailsRepository extends JpaRepository<EstimateDetails,Integer> {
}
