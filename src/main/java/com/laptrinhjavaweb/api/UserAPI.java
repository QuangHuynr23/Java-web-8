package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.bean.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class UserAPI {
//    @GetMapping("/api/staffs")
//    public List<UserBean> getStaff(@RequestParam(value ="buildingid", required = false) Long buildingId) {
//        List<UserBean> results = new ArrayList<>();
//        return results;
//    }

    @GetMapping("/api/users")
    public List<UserBean> getStaff( //@RequestParam(value ="buildingid", required = false) Long buildingId
                                    @RequestParam(value ="buildingid") Long buildingId
                                    , @RequestParam(value ="role", required = false) String roleCode) {
        List<UserBean> results = new ArrayList<>();
        return results;
    }

}
