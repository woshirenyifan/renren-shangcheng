package com.ryf.mapper;

import java.util.List;

import com.ryf.model.Student;
import com.ryf.model.ext.TeacherCourse;

public interface TeacherCourseMapper {
	
	List<TeacherCourse> selectTCByTno(String tno);
	
	int updateStudentById(Student record);
}
