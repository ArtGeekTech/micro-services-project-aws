package com.spacex.mars.datadashboard.model.dao;

import com.spacex.mars.datadashboard.model.dvo.Data;

public interface DataDao {
    Data save(Data data);
    Data findById(Long id);
}
