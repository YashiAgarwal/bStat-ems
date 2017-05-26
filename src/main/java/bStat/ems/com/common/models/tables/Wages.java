package bStat.ems.com.common.models.tables;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Yashi Agarwal on 24-05-2017.
 */
@Entity
@Table(name = "wages")
public class Wages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "worker_id")
    private long workerId;

    @Column(name = "work_id")
    private long workId;

    @Column(name = "wage_amount")
    private int wageAmount;

    @Column(name = "total_previous_dues")
    private int totalPreviousDues;

    @Column(name = "net_amount_to_pay")
    private int netAmountToPay;

    @Column(name = "amount_paid")
    private int amountPaid;

    @Column(name = "description_on_WA")
    private String descriptionOnWA;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    public Wages() {
    }

    public Wages(long id, long workerId, long workId, int wageAmount, int totalPreviousDues, int netAmountToPay,
                 int amountPaid, String descriptionOnWA, Date fromDate, Date toDate, Date createdOn, Date updatedOn) {
        this.id = id;
        this.workerId = workerId;
        this.workId = workId;
        this.wageAmount = wageAmount;
        this.totalPreviousDues = totalPreviousDues;
        this.netAmountToPay = netAmountToPay;
        this.amountPaid = amountPaid;
        this.descriptionOnWA = descriptionOnWA;
        this.fromDate = fromDate;
        this.toDate = toDate;
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

    public long getWorkId() {
        return workId;
    }

    public void setWorkId(long workId) {
        this.workId = workId;
    }

    public int getWageAmount() {
        return wageAmount;
    }

    public void setWageAmount(int wageAmount) {
        this.wageAmount = wageAmount;
    }

    public int getTotalPreviousDues() {
        return totalPreviousDues;
    }

    public void setTotalPreviousDues(int totalPreviousDues) {
        this.totalPreviousDues = totalPreviousDues;
    }

    public int getNetAmountToPay() {
        return netAmountToPay;
    }

    public void setNetAmountToPay(int netAmountToPay) {
        this.netAmountToPay = netAmountToPay;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getDescriptionOnWA() {
        return descriptionOnWA;
    }

    public void setDescriptionOnWA(String descriptionOnWA) {
        this.descriptionOnWA = descriptionOnWA;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
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
