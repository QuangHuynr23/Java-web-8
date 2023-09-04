package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.repository.entity.BuildingEntity;

import java.util.List;

public interface BuildingRepository {
    List<BuildingEntity> findAll();
}
