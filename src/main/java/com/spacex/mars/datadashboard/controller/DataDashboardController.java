package com.spacex.mars.datadashboard.controller;

import com.spacex.mars.datadashboard.model.dao.DataDao;
import com.spacex.mars.datadashboard.model.dvo.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3/")
public class DataDashboardController {
    @Autowired
    private DataDao dataDao;

    @GetMapping("/data/{id}")
    public Data getDataById(@PathVariable Long id) {
        return dataDao.findById(id);
    }

    @PostMapping("/data")
    public Data createData(@RequestBody Data payload) {
        return dataDao.save(payload);
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name;
    }
}
