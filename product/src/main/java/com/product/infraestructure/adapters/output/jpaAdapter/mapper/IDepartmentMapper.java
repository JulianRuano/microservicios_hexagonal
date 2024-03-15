package com.product.infraestructure.adapters.output.jpaAdapter.mapper;



import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.product.domain.models.City;
import com.product.domain.models.Department;
import com.product.infraestructure.adapters.output.jpaAdapter.entity.CityEntity;
import com.product.infraestructure.adapters.output.jpaAdapter.entity.DepartmentEntity;

@Mapper
public interface IDepartmentMapper {


    @Mapping(target = "cities", qualifiedByName = "mapCities")
    DepartmentEntity toEntity(Department department);

    @Mapping(target = "cities", qualifiedByName = "mapCitiesDomain")
    Department toDomain(DepartmentEntity departmentEntity); 

    @Named("mapCities")
    default List<CityEntity> mapCities(List<City> cities) {
        if (cities == null) {
            return null;
        }
        return cities.stream()
                     .map(city -> {
                         CityEntity cityEntity = new CityEntity();
                         cityEntity.setId(city.getId());
                         cityEntity.setName(city.getName());
                         return cityEntity;
                     })
                     .collect(Collectors.toList());
    }

    @Named("mapCitiesDomain")
    default List<City> mapCitiesDomain(List<CityEntity> cities) {
        if (cities == null) {
            return null;
        }
        return cities.stream()
                     .map(cityEntity -> {
                         City city = new City();
                         city.setId(cityEntity.getId());
                         city.setName(cityEntity.getName());
                         return city;
                     })
                     .collect(Collectors.toList());
    }
}
