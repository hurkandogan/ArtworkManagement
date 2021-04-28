package com.hurkan.expenseManagement.model;

import javax.persistence.*;

@Entity
@Table
public class ArtworkLocation {

    @Id
    @SequenceGenerator(
            name="artwork_location_sequence",
            sequenceName="artwork_location_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "artwork_location_sequence"
    )
    private Long id;
    private String locationName;
    private String locationShortName;
    private Boolean locationIsActive;

    public ArtworkLocation(){}

    public ArtworkLocation(String locationName, String locationShortName, Boolean locationIsActive) {
        this.locationName = locationName;
        this.locationShortName = locationShortName;
        this.locationIsActive = locationIsActive;
    }

    public ArtworkLocation(Long id, String locationName, String locationShortName, Boolean locationIsActive) {
        this.id = id;
        this.locationName = locationName;
        this.locationShortName = locationShortName;
        this.locationIsActive = locationIsActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationShortName() {
        return locationShortName;
    }

    public void setLocationShortName(String locationShortName) {
        this.locationShortName = locationShortName;
    }

    public Boolean getLocationIsActive() {
        return locationIsActive;
    }

    public void setLocationIsActive(Boolean locationIsActive) {
        this.locationIsActive = locationIsActive;
    }
}
