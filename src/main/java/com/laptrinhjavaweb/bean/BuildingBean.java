package com.laptrinhjavaweb.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuildingBean {
    private Long id;
    private String name;
    private Integer floorArea;
    private Long[] buildingIds;
}
