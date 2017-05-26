package bStat.ems.com.common.models.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 24-05-2017.
 */
@Entity
@Table(name = "salary_structures")
public class SalaryStructures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_structure_id")
    private long salaryStructureId;

    @Column(name = "employee_grade")
    private String employeeGrade;

    @Column(name = "basic_salary")
    private int basicSalary;

    @Column(name = "employee_designation")
    private String employeeDesignation;

    @Column(name = "HRA")
    private int HRA;

    @Column(name = "PF")
    private int PF;

    @Column(name = "VPF")
    private int VPF;

    @Column(name = "special_allowance")
    private int specialAllowance;

    @Column(name = "cycle")
    private int cycle;

    @Column(name = "bonus")
    private int bonus;

    @Column(name = "shares")
    private long shares;

    @Column(name = "comments")
    private String comments;

    @Column(name = "tax-deductions_id")
    private long taxDeductionsId;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public SalaryStructures() {
    }

    public SalaryStructures(long salaryStructureId, String employeeGrade, int basicSalary, String employeeDesignation,
                            int HRA, int PF, int VPF, int specialAllowance, int cycle, int bonus, long shares,
                            String comments, long taxDeductionsId, Date createdOn, Date updatedOn) {
        this.salaryStructureId = salaryStructureId;
        this.employeeGrade = employeeGrade;
        this.basicSalary = basicSalary;
        this.employeeDesignation = employeeDesignation;
        this.HRA = HRA;
        this.PF = PF;
        this.VPF = VPF;
        this.specialAllowance = specialAllowance;
        this.cycle = cycle;
        this.bonus = bonus;
        this.shares = shares;
        this.comments = comments;
        this.taxDeductionsId = taxDeductionsId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public long getSalaryStructureId() {
        return salaryStructureId;
    }

    public void setSalaryStructureId(long salaryStructureId) {
        this.salaryStructureId = salaryStructureId;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public int getHRA() {
        return HRA;
    }

    public void setHRA(int HRA) {
        this.HRA = HRA;
    }

    public int getPF() {
        return PF;
    }

    public void setPF(int PF) {
        this.PF = PF;
    }

    public int getVPF() {
        return VPF;
    }

    public void setVPF(int VPF) {
        this.VPF = VPF;
    }

    public int getSpecialAllowance() {
        return specialAllowance;
    }

    public void setSpecialAllowance(int specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public long getShares() {
        return shares;
    }

    public void setShares(long shares) {
        this.shares = shares;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public long getTaxDeductionsId() {
        return taxDeductionsId;
    }

    public void setTaxDeductionsId(long taxDeductionsId) {
        this.taxDeductionsId = taxDeductionsId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
