package com.product.infraestructure.adapters.config;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.product.infraestructure.adapters.input.rest.mapper.IProductRestMapper;
import com.product.infraestructure.adapters.output.jpaAdapter.mapper.IProductMapper;

@Configuration
public class MapStructConfig {
    
    @Bean
    IProductMapper mapStructProduct(){
        return Mappers.getMapper(IProductMapper.class);
    }

    @Bean
    IProductRestMapper mapStructProductRest(){
        return Mappers.getMapper(IProductRestMapper.class);
    }

}
