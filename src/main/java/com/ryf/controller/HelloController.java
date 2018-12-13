package com.ryf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ryf.mapper.StudentMapper;
import com.ryf.mapper.TeacherCourseMapper;
import com.ryf.model.Student;
import com.ryf.model.StudentExample;
import com.ryf.model.ext.TeacherCourse;

@Controller
public class HelloController {
	
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private TeacherCourseMapper tcMapper;
	
	@RequestMapping("/index")
	@ResponseBody
	public List<Student> showIndex(){
		
		List<Student> selectByExample = studentMapper.selectByExample(new StudentExample());
		return selectByExample;
	}
	
	@RequestMapping("/select/{tno}")
	@ResponseBody
	public List<TeacherCourse> selectTCBytno(@PathVariable String tno){
		
		List<TeacherCourse> list = tcMapper.selectTCByTno(tno);
		return list;
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public List<TeacherCourse> selectTCBytno1(String tno){
		
		List<TeacherCourse> list = tcMapper.selectTCByTno(tno);
		return list;
	}
	
	@RequestMapping(value="/updateStudentById")
	@ResponseBody
	public Map<String,Object> updateStudentById(@RequestBody Student student){
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("status","fail");
		int count = tcMapper.updateStudentById(student);
		if(count > 0){
			map.put("status","success");
			map.put("count",count);
		}
		return map;
	}
	
	@RequestMapping("/suimobile")
	public String index2(){
		
		return "suimobile";
		
	}
	
	/**
	 * 测试java代码的http请求
	 * @param key
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/test",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> testHttp(String key , String name){
		Map<String,String> map = new HashMap<>();
		map.put("key",key);
		map.put("name",name);
		return map;
	}
	
}
