package bStat.ems.com.common.models.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 24-05-2017.
 */
@Entity
@Table(name = "wage_rates")
public class WageRates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "id_type")
    private String idType;

    @Column(name = "rate_per_unit")
    private int ratePerUnit;

    @Column(name = "comments")
    private String comments;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public WageRates() {
    }

    public WageRates(long id, String idType, int ratePerUnit, String comments, Date createdOn, Date updatedOn) {
        this.id = id;
        this.idType = idType;
        this.ratePerUnit = ratePerUnit;
        this.comments = comments;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public int getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(int ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
