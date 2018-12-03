package com.example.demo;

import com.example.demo.common.ParamObject;
import com.example.demo.mapper.SexAnalysisMapper;
import com.example.demo.model.SexAnalysis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private SexAnalysisMapper sex;

	@Test
	public void contextLoads() {
		ParamObject param = new ParamObject();
		param.setUserId(1);
		param.setEndDate("2018-09-12");
		param.setStartDate("2018-10-23");
		List<SexAnalysis> list = new ArrayList<>();
		list = sex.showSexAnalysisById(param);
		for (SexAnalysis sex : list){
			System.out.print(sex);
		}

	}

}
