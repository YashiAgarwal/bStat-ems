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
@Table(name = "workers")
public class Workers {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary_structure_id")
    private String salaryStructureId;

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


}
