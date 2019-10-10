package com.cxq.springboot.web; /**
 * @Author: cxq
 * @Date: 2019/10/9 17:35
 */

import com.cxq.springboot.common.Result;
import com.cxq.springboot.common.ResultGenerator;
import com.cxq.springboot.dto.CityDto;
import com.cxq.springboot.model.City;
import com.cxq.springboot.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: cxq
 * @Date: 2019/10/9 17:35
 */
@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService cityService;

    @RequestMapping(value = "/city")
    public String city(){
        return "city/city";
    }

    @ResponseBody
    @RequestMapping(value = "/findCityByProvinceName", method = RequestMethod.POST)
    public Result findCityByProvinceName(String provinceName){
        List<City> cityByProvinceName = cityService.findCityByProvinceName(provinceName);
        return ResultGenerator.genSuccessResult(cityByProvinceName);
    }

    @ResponseBody
    @RequestMapping(value = "/findCityAndProvinceList", method = RequestMethod.POST)
    public Result findCityAndProvinceList(){
        List<CityDto> cityAndProvinceList = cityService.findCityAndProvinceList();
        return ResultGenerator.genSuccessResult(cityAndProvinceList);
    }
}
