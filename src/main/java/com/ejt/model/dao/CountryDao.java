package com.ejt.model.dao;

import com.ejt.model.entity.Country;

import java.util.List;

public interface CountryDao {

    void addCountry(Country country);

    void updateCountry(Country country);

    void deleteCountry(int id);

    Country getCountryById(int id);

    List<Country> listCountry();
}
