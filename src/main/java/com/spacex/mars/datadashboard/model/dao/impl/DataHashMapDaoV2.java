package com.spacex.mars.datadashboard.model.dao.impl;

import com.spacex.mars.datadashboard.model.dao.DataDao;
import com.spacex.mars.datadashboard.model.dvo.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataHashMapDaoV2 implements DataDao {

    private Map<Long, Data> map = new HashMap<>();

    @Override
    public Data save(Data data) {
        Long id = data.getId();

        // Only if is a new record.
        if (id == null || !map.containsKey(id)) {
            id = map.size() + 1L;
            data.setId(id);
        }

        map.put(id, data);
        return data;
    }

    @Override
    public Data findById(Long id) {

        return map.get(id);
    }
}
