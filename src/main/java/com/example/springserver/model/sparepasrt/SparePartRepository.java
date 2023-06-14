package com.example.springserver.model.sparepasrt;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SparePartRepository extends CrudRepository<SparePart, Integer> {

}
