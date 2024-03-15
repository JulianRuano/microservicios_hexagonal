package com.product.infraestructure.adapters.output.jpaAdapter.mapper;


import java.util.ArrayList;
import java.util.List;

//import org.springframework.stereotype.Component;

import com.product.domain.models.City;
import com.product.domain.models.Department;
import com.product.infraestructure.adapters.output.jpaAdapter.entity.CityEntity;
import com.product.infraestructure.adapters.output.jpaAdapter.entity.DepartmentEntity;

//@Component
public class DepartmentMapperImpl {//  implements IDepartmentMapper{

    //@Override
    public DepartmentEntity toEntity(Department department) {
        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setId(department.getId());
        departmentEntity.setName(department.getName());

        List<CityEntity> cities = new ArrayList<CityEntity>();   
        for (int i = 0; i < department.getCities().size(); i++) {
            CityEntity cityEntity = new CityEntity();
            cityEntity.setId(department.getCities().get(i).getId());
            cityEntity.setName(department.getCities().get(i).getName());
            cities.add(cityEntity);
        }
        departmentEntity.setCities(cities);

        return departmentEntity;
    }

    //@Override
    public Department toDomain(DepartmentEntity departmentEntity) {
        Department department = new Department();
        department.setId(departmentEntity.getId());
        department.setName(departmentEntity.getName());

        List<City> cities = new ArrayList<City>();   
        for (int i = 0; i < departmentEntity.getCities().size(); i++) {
            City city = new City();
            city.setId(departmentEntity.getCities().get(i).getId());
            city.setName(departmentEntity.getCities().get(i).getName());
            cities.add(city);
        }
        department.setCities(cities);
        return department;
        
    }
    
}
