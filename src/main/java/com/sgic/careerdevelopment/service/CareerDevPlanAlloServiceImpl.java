package com.sgic.careerdevelopment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.careerdevelopment.entity.CareerDevPlan;
import com.sgic.careerdevelopment.entity.CareerDevelopmentPlanAllocation;
import com.sgic.careerdevelopment.repository.CareerDevPlanAlloRepository;

@Service
public class CareerDevPlanAlloServiceImpl implements CareerDevPlanAlloService {

  @Autowired
  CareerDevPlanAlloRepository cdpAllorepo;

  @Override
  public List<CareerDevelopmentPlanAllocation> getCareerDevPlanAllo() {
    return cdpAllorepo.findAll();
  }

  @Override
  public boolean addcareerDevPlanAllo(CareerDevelopmentPlanAllocation careerDevPlanAllo) {
    cdpAllorepo.save(careerDevPlanAllo);
    return false;
  }

  @Override
  public boolean editcareerDevPlanAllo(CareerDevelopmentPlanAllocation careerDevPlanAllo,
      Integer id) {
    boolean success = false;
    if (cdpAllorepo.getOne(id) != null) {
      careerDevPlanAllo.setId(id);
      cdpAllorepo.save(careerDevPlanAllo);
      success = true;
      return success;
    }
    return success;
  }

  @Override
  public boolean deletecareerDevPlanAllo(Integer id) {
    if (cdpAllorepo.getOne(id) != null) {
      cdpAllorepo.deleteById(id);
      return true;
  }
  return false;
  }



  @Override
  public CareerDevPlan getcareerDevPlanAlloById(int id) {
    // TODO Auto-generated method stub
    return null;
  }


}
