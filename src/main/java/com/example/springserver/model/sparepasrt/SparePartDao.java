package com.example.springserver.model.sparepasrt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class SparePartDao {
    @Autowired
    private SparePartRepository repository;

    public List<SparePart> getAll() {
        List<SparePart> spareParts = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(spareParts::add);
        return spareParts;
    }

    public void save(SparePart sparePart) {
        repository.save(sparePart);
    }
}
