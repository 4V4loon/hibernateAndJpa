package com.myproject.hibernateandJpa.DataAccess;
import com.myproject.hibernateandJpa.Entities.City;

import java.util.List;


public interface ICityDal {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);



}
