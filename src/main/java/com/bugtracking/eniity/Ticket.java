package com.bugtracking.eniity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Ticket_tbl")
public class Ticket implements Serializable {
    public static final long SerialVersionUID = 250294l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private long ticketId;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    @ManyToOne
    @JoinColumn(name = "release_id")
    private Release release;
    private String description;
    private String status;
    private String title;


}
