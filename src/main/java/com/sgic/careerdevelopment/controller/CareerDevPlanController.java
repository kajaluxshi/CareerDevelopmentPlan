package com.sgic.careerdevelopment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.careerdevelopment.entity.CareerDevPlan;
import com.sgic.careerdevelopment.service.CareerDevPlanService;

@RestController
public class CareerDevPlanController {

  @Autowired
  CareerDevPlanService careerDevPlanService;
 
  @PostMapping("/careerdevplan")
  public HttpStatus createPlan(@RequestBody CareerDevPlan careerDevPlan) {
    boolean res=careerDevPlanService.addCareerDevPlan(careerDevPlan);
    if(res) {
        return HttpStatus.CREATED;
    }
    return HttpStatus.BAD_REQUEST;
}
  
  @GetMapping("/careerdevplan")
  public ResponseEntity<List<CareerDevPlan>> getCareerDevPlan() {
    List<CareerDevPlan> careerDevPlans = careerDevPlanService.getCareerDevPlan();
    return new ResponseEntity<>(careerDevPlans, HttpStatus.OK);  
  }
  
  @PutMapping("/careerdevplan/{id}")
  public HttpStatus updateCareerDevPlan(@RequestBody CareerDevPlan careerDevPlan, @PathVariable Integer id) {
      boolean res=careerDevPlanService.editCareerDevPlan(careerDevPlan, id);
      if(res) {
          return HttpStatus.ACCEPTED;
      }
      return HttpStatus.BAD_REQUEST;
  }
  
  @DeleteMapping("/careerdevplan/{id}")
  public HttpStatus deleteCareerDevPlan(@PathVariable Integer id) {
      boolean res=careerDevPlanService.deleteCareerDevPlan(id);
      if(res) {
          return HttpStatus.OK;
      }
      return HttpStatus.BAD_REQUEST;
  }
  
}
