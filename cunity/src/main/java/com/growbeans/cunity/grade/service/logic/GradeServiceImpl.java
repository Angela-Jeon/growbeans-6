package com.growbeans.cunity.grade.service.logic;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.growbeans.cunity.grade.domain.Grade;
import com.growbeans.cunity.grade.service.GradeService;
import com.growbeans.cunity.grade.store.GradeStore;

@Service("gradeService")
public class GradeServiceImpl implements GradeService{
	
	@Autowired
	private GradeStore gStore;
	
	@Override
	public ArrayList<Grade> selectGrade() {
		return null;
	}

	@Override
	public int insertGrade() {
		return 0;
	}


}
