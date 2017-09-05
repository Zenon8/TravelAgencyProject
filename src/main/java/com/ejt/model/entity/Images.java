package com.ejt.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "images", schema = "travel_agency")
public class Images {
    private int id;
    private int sizeId;
    private Integer tourId;
    private String name;
    private String url;
    private ImageSize imageSizeBySizeId;
    private Tour tourByTourId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "size_id", nullable = false)
    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    @Basic
    @Column(name = "tour_id", nullable = true)
    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "url", nullable = false, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Images that = (Images) o;

        if (id != that.id) return false;
        if (sizeId != that.sizeId) return false;
        if (tourId != null ? !tourId.equals(that.tourId) : that.tourId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + sizeId;
        result = 31 * result + (tourId != null ? tourId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id", nullable = false)
    public ImageSize getImageSizeBySizeId() {
        return imageSizeBySizeId;
    }

    public void setImageSizeBySizeId(ImageSize imageSizeBySizeId) {
        this.imageSizeBySizeId = imageSizeBySizeId;
    }

    @ManyToOne
    @JoinColumn(name = "tour_id", referencedColumnName = "id")
    public Tour getTourByTourId() {
        return tourByTourId;
    }

    public void setTourByTourId(Tour tourByTourId) {
        this.tourByTourId = tourByTourId;
    }
}
