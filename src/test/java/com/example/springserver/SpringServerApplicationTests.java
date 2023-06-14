package com.example.springserver;

import com.example.springserver.model.sparepasrt.SparePart;
import com.example.springserver.model.sparepasrt.SparePartDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {
	@Autowired
	SparePartDao sparePartDao;

	@Test
	void getSparePart() {
		List<SparePart> sparePartList = sparePartDao.getAll();
		System.out.println(sparePartList);
	}

}
