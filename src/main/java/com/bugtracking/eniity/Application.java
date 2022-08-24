package com.bugtracking.eniity;

import org.hibernate.annotations.GeneratorType;
import org.springframework.cglib.core.KeyFactory;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Application_tbl")
public class Application implements Serializable {
    public static final long SerialVersionUID = 181194l;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private int applicationId;
    private String description;

    @Column(name = "application_name")
    private String applicationName;
    @Column
    private String owner;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationId=" + applicationId +
                ", description='" + description + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
