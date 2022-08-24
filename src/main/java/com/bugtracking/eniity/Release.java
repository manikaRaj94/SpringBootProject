package com.bugtracking.eniity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Release_tbl")
public class Release implements Serializable {
    public static final long SerialVersionUID = 100294l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "release_id")
    private int releaseId;
    private String description;

    @Column(name = "release_date")
    private String releaseDate;

    @Override
    public String toString() {
        return "Release{" +
                "releaseId=" + releaseId +
                ", description='" + description + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
