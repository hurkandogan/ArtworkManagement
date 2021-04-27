package com.hurkan.expenseManagement.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Artwork {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String location;
    private String artist;
    private String name;
    private String description;
    private String size;
    private String locationOfPurchase;
    private LocalDate dateOfPurchase;
    private Double price;
    private Double tax;
    private Double transport;
    private Double framing;
    @Transient
    private Double totalAmount;
    private String imageLink;

    public Artwork(){}

    public Artwork(Long id,
                   String location,
                   String artist,
                   String name,
                   String description,
                   String size,
                   String locationOfPurchase,
                   LocalDate dateOfPurchase,
                   Double price,
                   Double tax,
                   Double transport,
                   Double framing,
                   Double totalAmount,
                   String imageLink) {
        this.id = id;
        this.location = location;
        this.artist = artist;
        this.name = name;
        this.description = description;
        this.size = size;
        this.locationOfPurchase = locationOfPurchase;
        this.dateOfPurchase = dateOfPurchase;
        this.price = price;
        this.tax = tax;
        this.transport = transport;
        this.framing = framing;
        this.imageLink = imageLink;
    }

    public Artwork(String location,
                   String artist,
                   String name,
                   String description,
                   String size,
                   String locationOfPurchase,
                   LocalDate dateOfPurchase,
                   Double price,
                   Double tax,
                   Double transport,
                   Double framing,
                   String imageLink) {
        this.location = location;
        this.artist = artist;
        this.name = name;
        this.description = description;
        this.size = size;
        this.locationOfPurchase = locationOfPurchase;
        this.dateOfPurchase = dateOfPurchase;
        this.price = price;
        this.tax = tax;
        this.transport = transport;
        this.framing = framing;
        this.totalAmount = totalAmount;
        this.imageLink = imageLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLocationOfPurchase() {
        return locationOfPurchase;
    }

    public void setLocationOfPurchase(String locationOfPurchase) {
        this.locationOfPurchase = locationOfPurchase;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTransport() {
        return transport;
    }

    public void setTransport(Double transport) {
        this.transport = transport;
    }

    public Double getFraming() {
        return framing;
    }

    public void setFraming(Double framing) {
        this.framing = framing;
    }

    public Double getTotalAmount() {
        return this.price + this.tax + this.framing + this.transport;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", locationOfPurchase='" + locationOfPurchase + '\'' +
                ", dateOfPurchase=" + dateOfPurchase +
                ", price=" + price +
                ", tax=" + tax +
                ", transport=" + transport +
                ", framing=" + framing +
                ", totalAmount=" + totalAmount +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
