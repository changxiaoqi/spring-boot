package com.cxq.springboot.service.impl;

import com.cxq.springboot.annotation.CityAnno;
import com.cxq.springboot.core.AbstractService;
import com.cxq.springboot.dto.CityDto;
import com.cxq.springboot.model.City;
import com.cxq.springboot.service.ICityService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Service Implementation:City
 *
 * @author duia_builder
 * @date 2018-3-8
 */
@Service
//@Transactional
public class CityService extends AbstractService<City> implements ICityService {
    @Override
    public List<City> findCityByProvinceName(String provinceName) {
        if (StringUtils.isEmpty(provinceName)) {
            return null;
        }
        City city = new City();
        city.setName(provinceName);
        city.setLevel(1);
        List<City> cityList = this.mapper.select(city);
        if (cityList == null || cityList.isEmpty()) {
            return null;
        }
        City province = cityList.get(0);
        City city1 = new City();
        city1.setParentId(province.getId());
        List<City> cities = this.mapper.select(city1);
        return cities;
    }


    @Override
    public List<CityDto> findCityAndProvinceList() {
        List<CityDto> responeList = new ArrayList<>();
        List<City> provinces = new ArrayList<>();
        List<City> cities = new ArrayList<>();
        List<City> cityList = this.mapper.selectAll();
        for (City city : cityList) {
            if (city.getParentId() == 0) {
                provinces.add(city);
            } else if (city.getParentId() != 0 && city.getLevel() == 2) {
                cities.add(city);
            }
        }
        for (City province : provinces) {
            CityDto respDto = new CityDto();
            respDto.setId(province.getId());
            respDto.setName(province.getName());
            ArrayList<City> citys = new ArrayList<>();
            for (City city : cities) {
                if (city.getParentId().equals(province.getId())) {
                    City cityVo = new City();
                    BeanUtils.copyProperties(city, cityVo);
                    citys.add(cityVo);
                }
            }
            respDto.setCityList(citys);
            responeList.add(respDto);
        }
        return responeList;
    }

    @Override
    @CityAnno
    public void cityTestAnno(Long along, Integer bInt, String cString) {
        Integer a = 1;
        Integer b = 2;
        Integer d = null;
        if(true){
            Integer c = 3;
            d = 4;
        }
        Integer e = 5;
    }


}
