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
@Table(name = "wage_rates")
public class WageRates {

    @Id
    @Column(name = "id")
    private String id;

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

}
