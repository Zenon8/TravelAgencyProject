package com.ejt.model.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "tour", schema = "travel_agency")
public class TourEntity {
    private int id;
    private int countryId;
    private String name;
    private String description;
    private int price;
    private int countMin;
    private int countMax;
    private Collection<OrderEntity> ordersById;
    private Collection<ImagesEntity> imagesById;
    private CountryEntity countryByCountryId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "country_id", nullable = false)
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "count_min", nullable = false)
    public int getCountMin() {
        return countMin;
    }

    public void setCountMin(int countMin) {
        this.countMin = countMin;
    }

    @Basic
    @Column(name = "count_max", nullable = false)
    public int getCountMax() {
        return countMax;
    }

    public void setCountMax(int countMax) {
        this.countMax = countMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TourEntity that = (TourEntity) o;

        if (id != that.id) return false;
        if (countryId != that.countryId) return false;
        if (price != that.price) return false;
        if (countMin != that.countMin) return false;
        if (countMax != that.countMax) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + countryId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + countMin;
        result = 31 * result + countMax;
        return result;
    }

    @OneToMany(mappedBy = "tourByTourId")
    public Collection<OrderEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrderEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @OneToMany(mappedBy = "tourByTourId")
    public Collection<ImagesEntity> getImagesById() {
        return imagesById;
    }

    public void setImagesById(Collection<ImagesEntity> imagesById) {
        this.imagesById = imagesById;
    }

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
    public CountryEntity getCountryByCountryId() {
        return countryByCountryId;
    }

    public void setCountryByCountryId(CountryEntity countryByCountryId) {
        this.countryByCountryId = countryByCountryId;
    }
}
