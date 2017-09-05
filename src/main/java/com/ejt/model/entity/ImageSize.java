package com.ejt.model.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "image_size", schema = "travel_agency")
public class ImageSize {
    private int id;
    private String name;
    private int width;
    private int height;
    private Collection<Images> imagesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 2)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "width", nullable = false)
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height", nullable = false)
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageSize that = (ImageSize) o;

        if (id != that.id) return false;
        if (width != that.width) return false;
        if (height != that.height) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }

    @OneToMany(mappedBy = "imageSizeBySizeId")
    public Collection<Images> getImagesById() {
        return imagesById;
    }

    public void setImagesById(Collection<Images> imagesById) {
        this.imagesById = imagesById;
    }
}
