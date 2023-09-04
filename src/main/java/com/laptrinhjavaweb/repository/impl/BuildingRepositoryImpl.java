package com.laptrinhjavaweb.repository.impl;

import com.laptrinhjavaweb.repository.BuildingRepository;
import com.laptrinhjavaweb.repository.entity.BuildingEntity;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
    private String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
    private String USER = "root";
    private String PASS = "123456";
    @Override
    public List<BuildingEntity> findAll() {
        List<BuildingEntity> results = new ArrayList<>();
        String QUERY = "SELECT * FROM estatebasic.building;";
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
        ) {
            while(rs.next()){
                BuildingEntity buildingEntity = new BuildingEntity();
                buildingEntity.setName(rs.getString("name"));
                buildingEntity.setDistrictId(rs.getLong("districtid"));
                buildingEntity.setStreet(rs.getString("street"));
                buildingEntity.setWard(rs.getString("ward"));
                results.add(buildingEntity);
            }
            return results;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
