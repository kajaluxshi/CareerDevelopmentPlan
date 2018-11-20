package com.sgic.careerdevelopment.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="careerdevelopment", name="careerDevPlanAllo")
public class CareerDevelopmentPlanAllocation implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 2133312244016271878L;
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  @ManyToOne(cascade= {CascadeType.PERSIST})
  @JoinColumn(name="cdp_Id")
  private CareerDevPlan cdpId;
  
  @ManyToOne(cascade= {CascadeType.PERSIST})
  @JoinColumn(name="emp_Id")
  private Employee userId;
  
  @ManyToOne(cascade= {CascadeType.PERSIST})
  @JoinColumn(name="allocater_Id")
  private Employee allocatedBy;
  private String Status;
  
  public String getStatus() {
    return Status;
  }
  public void setStatus(String status) {
    Status = status;
  }
  
  public Employee getAllocatedBy() {
    return allocatedBy;
  }
  public void setAllocatedBy(Employee allocatedBy) {
    this.allocatedBy = allocatedBy;
  }
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public CareerDevPlan getCdpId() {
    return cdpId;
  }
  
  public void setCdpId(CareerDevPlan cdpId) {
    this.cdpId = cdpId;
  }
  
  public Employee getUserId() {
    return userId;
  }
  
  public void setUserId(Employee userId) {
    this.userId = userId;
  }
}
