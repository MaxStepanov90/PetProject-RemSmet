package com.stepanov.service.EstimateDetailsService;

import com.stepanov.repository.EstimateDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstimateDetailsServiceimpl implements EstimateDetailsService {
    @Autowired
    private EstimateDetailsRepository estimateDetailsRepository;
}
