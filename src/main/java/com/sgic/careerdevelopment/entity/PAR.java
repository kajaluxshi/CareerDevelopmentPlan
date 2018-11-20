package com.sgic.careerdevelopment.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="careerdevelopment", name="PAR")
public class PAR implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = -1856778510052923712L;
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer parId;
  private Integer empId;
  private Integer score; 
  private Date date;
  public Integer getParId() {
    return parId;
  }
  public void setParId(Integer parId) {
    this.parId = parId;
  }
  public Integer getEmpId() {
    return empId;
  }
  public void setEmpId(Integer empId) {
    this.empId = empId;
  }
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
}
