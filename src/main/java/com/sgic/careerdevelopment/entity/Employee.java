package com.sgic.careerdevelopment.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="careerdevelopment", name="emp")
public class Employee implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1778267316369017454L;
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer empid; //Why Integer? Why private?
  private String empName;
  private String currentPosition;
  private Date joinDate;
 
  public Integer getEmpid() {
    return empid;
  }
  public void setEmpid(Integer empid) {
    this.empid = empid;
  }
  public String getEmpName() {
    return empName;
  }
  public void setEmpName(String empName) {
    this.empName = empName;
  }
  public String getCurrentPosition() {
    return currentPosition;
  }
  public void setCurrentPosition(String currentPosition) {
    this.currentPosition = currentPosition;
  }
  public Date getJoinDate() {
    return joinDate;
  }
  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }
}
