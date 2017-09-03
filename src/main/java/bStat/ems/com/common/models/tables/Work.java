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
@Table(name = "work")
public class Work {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "worker_id")
    private String workerId;

    @Column(name = "input_type")
    private String inputType;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "id_type")
    private String idType;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;


}
