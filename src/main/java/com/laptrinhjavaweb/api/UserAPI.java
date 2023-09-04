package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.model.dto.UserDTO;
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
    public List<UserDTO> getStaff( //@RequestParam(value ="buildingid", required = false) Long buildingId
                                   @RequestParam(value ="buildingid") Long buildingId
                                    , @RequestParam(value ="role", required = false) String roleCode) {
        List<UserDTO> results = new ArrayList<>();
        return results;
    }

}
