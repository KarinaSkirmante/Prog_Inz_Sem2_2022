package lv.venta.demo.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lv.venta.demo.models.Grade;
import lv.venta.demo.repos.IGradeRepo;
import lv.venta.demo.services.IFilteringService;

@Service
public class FilteringServiceImpl implements IFilteringService {

	@Autowired
	private IGradeRepo gradeRepo;
	
	@Override
	public ArrayList<Grade> getAllGradesFromStudentById(int studentId) {
		ArrayList<Grade> result = gradeRepo.findByStudentId_St(studentId);
		return result;
	}

	@Override
	public ArrayList<Grade> getAllGradesFromSubjectById(int subjectId) {
		ArrayList<Grade> result = gradeRepo.findBySubjectId_Subj(subjectId);
		return result;
	}

	@Override
	public ArrayList<Grade> getBadGrades() {
		ArrayList<Grade> result = gradeRepo.findByGrade_ValueLessThan(4);
		return result;
	}

	@Override
	public float getAVGFromSubject(int subjectId) {
		float result = gradeRepo.calculateAVGFromSubject(subjectId);
		return result;
	}

}
