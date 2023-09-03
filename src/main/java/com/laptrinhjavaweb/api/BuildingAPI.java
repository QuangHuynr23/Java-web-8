package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.bean.AssignmentBuildingBean;
import com.laptrinhjavaweb.bean.BuildingBean;
import com.laptrinhjavaweb.bean.ErrorResponseBean;
import com.laptrinhjavaweb.customexception.FieldRequiredException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/building")
public class BuildingAPI {

    @GetMapping
    public List<BuildingBean> getBuilding(@RequestParam(value = "name", required = false) String name,
                                          @RequestParam(value = "numberofbasement", required = false) Integer numberOfBasement,
                                          @RequestParam(value = "types", required = false) List<String> types) {
        List<BuildingBean> results = new ArrayList<>();
        return results;
    }

//    role 7
//    @PostMapping("/api/building")
//    public BuildingBean createBuilding(@RequestBody BuildingBean newBuilding) {
//        try{
//            System.out.println(10/0);
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        return newBuilding;
//    }

//    @PostMapping("/api/building")
//    public BuildingBean createBuilding(@RequestBody BuildingBean newBuilding) {
//        System.out.println(10/0);
//        return newBuilding;
//    }

    /*Role 5*/
    @PostMapping
//    public Object createBuilding(@RequestBody BuildingBean newBuilding) {
    public BuildingBean createBuilding(@RequestBody BuildingBean newBuilding) {
//        try {
//            System.out.println(10/0);
////            success
//            return newBuilding;
//        } catch (ArithmeticException e){
////            return detail error
//            ErrorResponseBean errorResponseBean = new ErrorResponseBean();
//            errorResponseBean.setError(e.getMessage());
//            List<String> details = new ArrayList<>();
//            details.add("1 so khong chia duoc cho 0");
//            errorResponseBean.setDetails(details);
//            return errorResponseBean;
//        }

//        System.out.println(10/0);

            validateData(newBuilding);
            return newBuilding;
    }

    private void validateData(BuildingBean newBuilding) throws FieldRequiredException {
        if(newBuilding.getName()==null || newBuilding.getName().equals("") || newBuilding.getNumberOfBasement()==null){
            throw new FieldRequiredException("name or numberofbasement is required");
        }
    }


    @PutMapping
    public BuildingBean updateBuilding(@RequestBody BuildingBean updateBuilding) {
        return updateBuilding;
    }

    @DeleteMapping
    public void deleteBuilding(@RequestBody BuildingBean deleteBuilding) {
        System.out.println("ok");
    }

    @PostMapping("/assignment")
    public void assignmentBuilding(@RequestBody AssignmentBuildingBean assignmentBuildingBean){
        System.out.println("ok");
    }
}
