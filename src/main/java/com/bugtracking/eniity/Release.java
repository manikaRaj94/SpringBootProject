package com.bugtracking.eniity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Release_tbl")
public class Release implements Serializable {
    public static final long SerialVersionUID = 100294l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "release_id")
    private long releaseId;
    private String description;

    @Column(name = "release_date")
    private String releaseDate;



}
