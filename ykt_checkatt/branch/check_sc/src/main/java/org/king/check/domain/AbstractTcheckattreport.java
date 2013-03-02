package org.king.check.domain;


/**
 * AbstractTCheckattReport generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractTCheckattReport extends org.king.framework.domain.BaseObject implements java.io.Serializable {


    // Fields     

     private TCheckattReportId id; 
     private String ifoffice;
     private Integer worktimeValue;
     private Integer factValue;
     private Integer handTimes;
     private Integer overtimeValue;
     private Integer tworestValue;
     private Integer holidayValue;
     private Integer delayValue;
     private Integer leaveEarly;
     private Integer leaveValue;
     private String leaveType;
     private Integer leaveTime;
     private Integer ext1;
     private Integer ext2;
     private Integer ext3;
     private Integer ext4;
     private Integer ext5;
     private Integer checkNum;
     private Integer delayNum;
     private Integer earlyNum;
     private Integer leaveNum;
     private Integer extcheckNum;
     private Integer worktimeNum;


    // Constructors

    /** default constructor */
    public AbstractTCheckattReport() {
    }

	/** minimal constructor */
    public AbstractTCheckattReport(TCheckattReportId id) {
        this.id = id;
    }
    
    /** full constructor */
    public AbstractTCheckattReport(TCheckattReportId id, String ifoffice, Integer worktimeValue, Integer factValue, Integer handTimes, Integer overtimeValue, Integer tworestValue, Integer holidayValue, Integer delayValue, Integer leaveEarly, Integer leaveValue, String leaveType, Integer leaveTime, Integer ext1, Integer ext2, Integer ext3, Integer ext4, Integer ext5, Integer checkNum, Integer delayNum, Integer earlyNum, Integer leaveNum, Integer extcheckNum, Integer worktimeNum) {
        this.id = id;
        this.ifoffice = ifoffice;
        this.worktimeValue = worktimeValue;
        this.factValue = factValue;
        this.handTimes = handTimes;
        this.overtimeValue = overtimeValue;
        this.tworestValue = tworestValue;
        this.holidayValue = holidayValue;
        this.delayValue = delayValue;
        this.leaveEarly = leaveEarly;
        this.leaveValue = leaveValue;
        this.leaveType = leaveType;
        this.leaveTime = leaveTime;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.ext3 = ext3;
        this.ext4 = ext4;
        this.ext5 = ext5;
        this.checkNum = checkNum;
        this.delayNum = delayNum;
        this.earlyNum = earlyNum;
        this.leaveNum = leaveNum;
        this.extcheckNum = extcheckNum;
        this.worktimeNum = worktimeNum;
    }

   
    // Property accessors

    public TCheckattReportId getId() {
        return this.id;
    }
    
    public void setId(TCheckattReportId id) {
        this.id = id;
    }

    public String getIfoffice() {
        return this.ifoffice;
    }
    
    public void setIfoffice(String ifoffice) {
        this.ifoffice = ifoffice;
    }

    public Integer getWorktimeValue() {
        return this.worktimeValue;
    }
    
    public void setWorktimeValue(Integer worktimeValue) {
        this.worktimeValue = worktimeValue;
    }

    public Integer getFactValue() {
        return this.factValue;
    }
    
    public void setFactValue(Integer factValue) {
        this.factValue = factValue;
    }

    public Integer getHandTimes() {
        return this.handTimes;
    }
    
    public void setHandTimes(Integer handTimes) {
        this.handTimes = handTimes;
    }

    public Integer getOvertimeValue() {
        return this.overtimeValue;
    }
    
    public void setOvertimeValue(Integer overtimeValue) {
        this.overtimeValue = overtimeValue;
    }

    public Integer getTworestValue() {
        return this.tworestValue;
    }
    
    public void setTworestValue(Integer tworestValue) {
        this.tworestValue = tworestValue;
    }

    public Integer getHolidayValue() {
        return this.holidayValue;
    }
    
    public void setHolidayValue(Integer holidayValue) {
        this.holidayValue = holidayValue;
    }

    public Integer getDelayValue() {
        return this.delayValue;
    }
    
    public void setDelayValue(Integer delayValue) {
        this.delayValue = delayValue;
    }

    public Integer getLeaveEarly() {
        return this.leaveEarly;
    }
    
    public void setLeaveEarly(Integer leaveEarly) {
        this.leaveEarly = leaveEarly;
    }

    public Integer getLeaveValue() {
        return this.leaveValue;
    }
    
    public void setLeaveValue(Integer leaveValue) {
        this.leaveValue = leaveValue;
    }

    public String getLeaveType() {
        return this.leaveType;
    }
    
    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public Integer getLeaveTime() {
        return this.leaveTime;
    }
    
    public void setLeaveTime(Integer leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getExt1() {
        return this.ext1;
    }
    
    public void setExt1(Integer ext1) {
        this.ext1 = ext1;
    }

    public Integer getExt2() {
        return this.ext2;
    }
    
    public void setExt2(Integer ext2) {
        this.ext2 = ext2;
    }

    public Integer getExt3() {
        return this.ext3;
    }
    
    public void setExt3(Integer ext3) {
        this.ext3 = ext3;
    }

    public Integer getExt4() {
        return this.ext4;
    }
    
    public void setExt4(Integer ext4) {
        this.ext4 = ext4;
    }

    public Integer getExt5() {
        return this.ext5;
    }
    
    public void setExt5(Integer ext5) {
        this.ext5 = ext5;
    }

    public Integer getCheckNum() {
        return this.checkNum;
    }
    
    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    public Integer getDelayNum() {
        return this.delayNum;
    }
    
    public void setDelayNum(Integer delayNum) {
        this.delayNum = delayNum;
    }

    public Integer getEarlyNum() {
        return this.earlyNum;
    }
    
    public void setEarlyNum(Integer earlyNum) {
        this.earlyNum = earlyNum;
    }

    public Integer getLeaveNum() {
        return this.leaveNum;
    }
    
    public void setLeaveNum(Integer leaveNum) {
        this.leaveNum = leaveNum;
    }

    public Integer getExtcheckNum() {
        return this.extcheckNum;
    }
    
    public void setExtcheckNum(Integer extcheckNum) {
        this.extcheckNum = extcheckNum;
    }

    public Integer getWorktimeNum() {
        return this.worktimeNum;
    }
    
    public void setWorktimeNum(Integer worktimeNum) {
        this.worktimeNum = worktimeNum;
    }
   








}