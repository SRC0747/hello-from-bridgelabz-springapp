package com.bridgelabz.hellofrombridgelabzspringapp.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EmployeeBean {
    private int eid;
    private String ename;

    @Autowired
    private DepartmentBean departmentBean;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean(){}

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean){
        this.departmentBean = departmentBean;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public  DepartmentBean getDepartmentBean(){
        return departmentBean;
    }

    @Autowired
    public void setDepartmentBean(DepartmentBean departmentBean){
        this.departmentBean = departmentBean;
    }

    public void showEmployeeDetails(){
        logger.debug("Employee Id : {}",eid);
        logger.debug("Employee Name : {}",ename);
        departmentBean.setDeptName("Backend Developer");
        logger.debug("Department : {}",departmentBean.getDeptName());

    }
}
