package com.laptrinhjavaweb.api;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.laptrinhjavaweb.bean.BuildingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@Controller
public class BuildingAPI {

    @RequestMapping(value = "/api/building", method = RequestMethod.GET)
    public @ResponseBody List<BuildingBean> getBuilding(@RequestParam(value = "name", required = false) String name,
                                                        @RequestParam(value = "numberofbasement", required = false) Integer numberOfBasement,
                                                        @RequestParam(value = "types", required = false) List<String> types){
        //item != null and item != empty and check isNumber
        // parse
        System.out.println(name);
        System.out.println(numberOfBasement);
        return null;
    }

    @RequestMapping(value = "/api/building/{buildingid}", method = RequestMethod.GET)
    public @ResponseBody BuildingBean getDetail(@PathVariable("buildingid") Long buildingId){
        System.out.println(buildingId);
        return null;
    }

    @RequestMapping(value = "/api/building", method = RequestMethod.POST)
    public @ResponseBody BuildingBean createBuilding(@RequestBody BuildingBean newBuilding){

        return null;
    }

    @RequestMapping(value = "/api/building", method = RequestMethod.PUT)
    public @ResponseBody BuildingBean updateBuilding(@RequestBody BuildingBean updateBuilding){
        return null;
    }

    @RequestMapping(value = "/api/building", method = RequestMethod.DELETE)
//    public void deleteBuilding(@RequestBody Long[] ids){
    public void deleteBuilding(@RequestBody BuildingBean deleteBuilding){
        System.out.println("ok");
    }
}
