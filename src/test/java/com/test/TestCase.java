package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ryf.enums.ShopStateEnum;
import com.ryf.mapper.StudentMapper;
import com.ryf.model.Student;
import com.ryf.model.StudentExample;

public class TestCase extends BaseTest{

	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	public void test1(){
		
		List<Student> list = studentMapper.selectByExample(new StudentExample());
		for (Student student : list) {
			System.out.println(student);
		}
		
	}
	
	@Test
	public void test2(){
		List<Student> list = studentMapper.selectByExample(new StudentExample());
		Student student = list.get(0);
		student.setSname("changetheworld");
		int i = studentMapper.updateByPrimaryKeySelective(student);
		System.out.println(i);
	}
	
	
}
