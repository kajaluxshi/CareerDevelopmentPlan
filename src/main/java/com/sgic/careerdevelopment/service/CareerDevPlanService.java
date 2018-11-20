package com.sgic.careerdevelopment.service;

import java.util.List;
import com.sgic.careerdevelopment.entity.CareerDevPlan;

public interface CareerDevPlanService {

  List<CareerDevPlan> getCareerDevPlan();

  boolean editCareerDevPlan(CareerDevPlan careerDevPlan, Integer id);

  boolean deleteCareerDevPlan(Integer id);

  boolean addCareerDevPlan(CareerDevPlan careerDevPlanAllo);
  
  CareerDevPlan getCareerDevPlanById(int id);
  
}
