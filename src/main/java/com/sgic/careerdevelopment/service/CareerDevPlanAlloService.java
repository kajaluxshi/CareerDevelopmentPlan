package com.sgic.careerdevelopment.service;

import java.util.List;
import com.sgic.careerdevelopment.entity.CareerDevPlan;
import com.sgic.careerdevelopment.entity.CareerDevelopmentPlanAllocation;

public interface CareerDevPlanAlloService {
  List<CareerDevelopmentPlanAllocation> getCareerDevPlanAllo();

  boolean editcareerDevPlanAllo(CareerDevelopmentPlanAllocation careerDevPlanAllo, Integer id);

  boolean deletecareerDevPlanAllo(Integer id);

  boolean addcareerDevPlanAllo(CareerDevelopmentPlanAllocation careerDevPlanAllo);
  
  CareerDevPlan getcareerDevPlanAlloById(int id);
  
  
  
}
