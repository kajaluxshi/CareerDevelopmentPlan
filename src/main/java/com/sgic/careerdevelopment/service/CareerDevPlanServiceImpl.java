package com.sgic.careerdevelopment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.careerdevelopment.entity.CareerDevPlan;
import com.sgic.careerdevelopment.repository.CareerDevPlanRepo;


@Service
public class CareerDevPlanServiceImpl implements CareerDevPlanService {

  @Autowired
  CareerDevPlanRepo careerDevPlanRepo;

  @Override
  public boolean addCareerDevPlan(CareerDevPlan careerDevPlan) {
    careerDevPlanRepo.save(careerDevPlan);
    return true;
  }

  @Override
  public List<CareerDevPlan> getCareerDevPlan() {
    return careerDevPlanRepo.findAll();
  }

  @Override
  public boolean editCareerDevPlan(CareerDevPlan careerDevPlan, Integer id) {
    boolean success = false;
    if (careerDevPlanRepo.getOne(id) != null) {
        careerDevPlan.setId(id);
        careerDevPlanRepo.save(careerDevPlan);
        success = true;
        return success;
    }
    return success;
  }

  @Override
  public boolean deleteCareerDevPlan(Integer id) {
    if (careerDevPlanRepo.getOne(id) != null) {
      careerDevPlanRepo.deleteById(id);
      return true;
  }
  return false;
  }

  @Override
  public CareerDevPlan getCareerDevPlanById(int id) {
    return null;
  }


}
