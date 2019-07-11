/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ditsikts.instrunmentsapp.dao;

import com.ditsikts.instrunmentsapp.entities.Brand;
import java.util.List;

/**
 *
 * @author Dimitris
 */
public interface BrandDao {
    public List<Brand> findAllBrands();
    public Brand findById(int id);
    public void saveBrand(Brand brand);
    public void deleteBrandById(int id);
   
    
}
