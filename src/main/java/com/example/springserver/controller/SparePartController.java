package com.example.springserver.controller;

import com.example.springserver.model.sparepasrt.SparePart;
import com.example.springserver.model.sparepasrt.SparePartDao;
import com.example.springserver.model.sparepasrt.SparePartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SparePartController {
    @Autowired
    private SparePartDao sparePartDao;

    @GetMapping("/get-all")
    public List<SparePart> getAllSpareParts() {
        return sparePartDao.getAll();
    }
}
