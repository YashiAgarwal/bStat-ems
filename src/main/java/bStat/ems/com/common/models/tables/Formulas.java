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
@Table(name = "formulas")
public class Formulas {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "parameter")
    private String parameter;

    @Column(name = "price_per_unit")
    private int pricePerUnit;

    @Column(name = "description")
    private String description;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;


}
