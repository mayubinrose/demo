package com.example.demo;

import com.example.demo.common.ParamObject;
import com.example.demo.mapper.AgeAnalysisMapper;
import com.example.demo.mapper.SexAnalysisMapper;
import com.example.demo.model.AgeAnalysis;
import com.example.demo.model.AgeAndSex;
import com.example.demo.model.SexAnalysis;
import com.example.demo.service.AgeAnalysisService;
import com.example.demo.service.SexAnalysisService;
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
	private AgeAnalysisService ageser;

	@Autowired
	private AgeAnalysisMapper agemapper;

	@Test
	public void contextLoads() {
		ParamObject param = new ParamObject();
		param.setUserId(1);
		param.setEndDate("2018-9-12");
		param.setStartDate("2018-10-23");



		List<AgeAnalysis> list = ageser.showAgeAnalysisById(param);
		for (AgeAnalysis age : list){
			System.out.print(age);
		}

	}

	@Test
	public void testAgeMapper(){
		ParamObject param = new ParamObject();
		param.setUserId(1);
		param.setEndDate("2018-09-12");
		param.setStartDate("2018-10-23");

		List<AgeAndSex> l = new ArrayList<>();
		l = agemapper.showAgeAnalysisById(param);
		for(AgeAndSex as : l){
			System.out.print(as);
		}
	}
}
