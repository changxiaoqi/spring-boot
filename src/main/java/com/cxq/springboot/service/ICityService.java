package com.cxq.springboot.service;

import com.cxq.springboot.core.Service;
import com.cxq.springboot.dto.CityDto;
import com.cxq.springboot.model.City;

import java.util.List;

/**
 * Service Interface:City
 * @author duia_builder
 * @date 2018-3-8
 */
public interface ICityService extends Service<City> {

    /**
     *根据省份的名字查找下面的城市
     * @param provinceName
     * @return
     */
    List<City> findCityByProvinceName(String provinceName);

    List<CityDto> findCityAndProvinceList();

}