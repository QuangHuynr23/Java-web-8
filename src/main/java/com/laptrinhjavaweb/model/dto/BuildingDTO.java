package com.laptrinhjavaweb.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuildingDTO {
    private Long id;
    private String name;
    private Integer floorArea;
    private Long[] buildingIds;
    private Integer numberOfBasement;
}
