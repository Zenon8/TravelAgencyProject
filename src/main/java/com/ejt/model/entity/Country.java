package com.ejt.model.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "country", schema = "travel_agency")
public class CountryEntity {
    private int id;
    private String name;
    private Collection<TourEntity> toursById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "countryByCountryId")
    public Collection<TourEntity> getToursById() {
        return toursById;
    }

    public void setToursById(Collection<TourEntity> toursById) {
        this.toursById = toursById;
    }
}
