package lv.venta.demo.services;

import java.util.ArrayList;

import lv.venta.demo.models.Grade;

public interface IFilteringService {

	//Atrast kāda konkrēta studenta visas atzīmes
	public abstract ArrayList<Grade> getAllGradesFromStudentById(int studentId);
	
	//Atrast visas atzīmes konkrētā kursā
	public abstract ArrayList<Grade> getAllGradesFromSubjectById(int subjectId);
	
	//TODO Atrast visas konkrēta studenta atzīmes pēc viņa vārda 
	
	
	//Atrast visas nesekmīgās atzīmes un šo atzīmju studentus 
	public abstract ArrayList<Grade> getBadGrades();
	
	//Atrast vidējo atzīmi konkrētā kursā 
	public abstract float getAVGFromSubject(int subjectId);
	
	
	//TODO Atrast vidējo atzīmi konkrētam studentam
	
}
