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
@Table(name = "wages")
public class Wages {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "worker_id")
    private String workerId;

    @Column(name = "work_id")
    private String workId;

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


}
