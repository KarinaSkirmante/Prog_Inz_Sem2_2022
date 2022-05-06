package lv.venta.demo.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import lv.venta.demo.models.Grade;


public interface IGradeRepo extends CrudRepository<Grade, Integer>{

	public abstract ArrayList<Grade> findByStudentId_St(int studentId);

	public abstract ArrayList<Grade> findBySubjectId_Subj(int subjectId);

}
