package bStat.ems.com.common.models.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 24-05-2017.
 */
@Entity
@Table(name = "deposits")
public class Deposits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "worker_id")
    private long workerId;

    @Column(name = "history")
    private String history;

    @Column(name = "net_amount")
    private int netAmount;

    @Column(name = "comments")
    private String comments;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public Deposits() {
    }

    public Deposits(long id, long workerId, String history, int netAmount, String comments, Date createdOn,
                    Date updatedOn) {
        this.id = id;
        this.workerId = workerId;
        this.history = history;
        this.netAmount = netAmount;
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

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(int netAmount) {
        this.netAmount = netAmount;
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
