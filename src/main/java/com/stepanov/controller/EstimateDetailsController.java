package com.stepanov.controller;

import com.stepanov.service.EstimateDetailsService.EstimateDetailsServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstimateDetailsController {
    @Autowired
    private EstimateDetailsServiceimpl estimateDetailsServiceimpl;

    @GetMapping("/all")
    public String getEstimateDetails(){
        return "estimateAll";
    }
}
