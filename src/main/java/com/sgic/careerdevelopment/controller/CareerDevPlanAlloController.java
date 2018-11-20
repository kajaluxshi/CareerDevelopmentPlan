package com.sgic.careerdevelopment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.careerdevelopment.entity.CareerDevelopmentPlanAllocation;
import com.sgic.careerdevelopment.service.CareerDevPlanAlloService;

@RestController
public class CareerDevPlanAlloController {
  
  @Autowired
  CareerDevPlanAlloService cdpalloService;
  
  @PostMapping("/planAllo")
  public HttpStatus createPlanAloocation(@RequestBody CareerDevelopmentPlanAllocation careerDevPlanAllo) {
    boolean res=cdpalloService.addcareerDevPlanAllo(careerDevPlanAllo);
    if(res) {
        return HttpStatus.CREATED;
    }
    return HttpStatus.BAD_REQUEST;
  }
  
  @GetMapping("/planAllo")
  public ResponseEntity<List<CareerDevelopmentPlanAllocation>> getCareerDevPlan() {
    List<CareerDevelopmentPlanAllocation> careerDevPlansAllo = cdpalloService.getCareerDevPlanAllo();
    return new ResponseEntity<>(careerDevPlansAllo, HttpStatus.OK);  
  }
}
