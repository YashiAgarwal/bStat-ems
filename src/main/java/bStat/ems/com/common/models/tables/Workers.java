package bStat.ems.com.common.models.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 24-05-2017.
 */
@Entity
@Table(name = "workers")
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary_structure_id")
    private long salaryStructureId;

    @Column(name = "score")
    private int score;

    @Column(name = "comments")
    private String comments;

    @Column(name = "salary_type")
    private String salaryType;

    @Column(name = "team")
    private String team;

    @Column(name = "manager")
    private String manager;

    @Column(name = "profile")
    private String profile;

    @Column(name = "place_of_work")
    private String placeOfWork;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "designation")
    private String designation;

    @Column(name = "date_of_joining")
    private Date dateOfJoining;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public Workers() {
    }

    public Workers(long id, String name, long salaryStructureId, int score, String comments, String salaryType,
                   String team, String manager, String profile, String placeOfWork, int phoneNumber, String designation,
                   Date dateOfJoining, Date createdOn, Date updatedOn) {
        this.id = id;
        this.name = name;
        this.salaryStructureId = salaryStructureId;
        this.score = score;
        this.comments = comments;
        this.salaryType = salaryType;
        this.team = team;
        this.manager = manager;
        this.profile = profile;
        this.placeOfWork = placeOfWork;
        this.phoneNumber = phoneNumber;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalaryStructureId() {
        return salaryStructureId;
    }

    public void setSalaryStructureId(long salaryStructureId) {
        this.salaryStructureId = salaryStructureId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
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
