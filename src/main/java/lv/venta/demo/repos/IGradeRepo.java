package lv.venta.demo.repos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lv.venta.demo.models.Grade;


public interface IGradeRepo extends CrudRepository<Grade, Integer>{

	//tiks generēta no DATA JPA, šeit ir svarīgs funkcijas nosaukums
	public abstract ArrayList<Grade> findByStudentIdSt(int studentId);
	//tiks generēta no DATA JPA, šeit ir svarīgs funkcijas nosaukums
	public abstract ArrayList<Grade> findBySubjectIdSubj(int subjectId);
	//tiks generēta no DATA JPA, šeit ir svarīgs funkcijas nosaukums
	public abstract ArrayList<Grade> findByGradeValueLessThan(int i);
	//pašu veidots SQL vaicajums, šeit nav svarīgs funkcijas nosaukums
	@Query(value="select avg(grade_value) from grade where id_subj=?1",nativeQuery=true )
	public abstract float calculateAVGFromSubject(int subjectId);

}
