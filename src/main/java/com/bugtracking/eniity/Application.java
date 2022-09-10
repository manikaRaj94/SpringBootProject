package com.bugtracking.eniity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.springframework.cglib.core.KeyFactory;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Application_tbl")
public class Application implements Serializable {
    public static final long SerialVersionUID = 181194l;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private long applicationId;
    private String description;

    @Column(name = "application_name")
    private String applicationName;
    @Column
    private String owner;

}
