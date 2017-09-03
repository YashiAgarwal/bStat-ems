package bStat.ems.com.common.models.tables;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 24-05-2017.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "salary_structures")
public class SalaryStructures {

    @Id
    @Column(name = "salary_structure_id")
    private String salaryStructureId;

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

    @Column(name = "tax_deductions_id")
    private long taxDeductionsId;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;


}
