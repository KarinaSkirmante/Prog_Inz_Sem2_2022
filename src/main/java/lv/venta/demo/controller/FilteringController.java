package lv.venta.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lv.venta.demo.services.IFilteringService;

@Controller
public class FilteringController {
	
	@Autowired
	private IFilteringService filtService;
	
	@GetMapping("/grades/stud/{id}") //localhost:8080/grades/stud/3
	public String getGradesByStudentId(Model model, 
			@PathVariable(name="id") int id)
	{
		model.addAttribute("object", filtService.getAllGradesFromStudentById(id));
		return "grades-page";//atvers grades-page.html
	}
	
	@GetMapping("/grades/subj/{id}") //localhost:8080/grades/subj/3
	public String getGradesBySubjectId(Model model, 
			@PathVariable(name="id") int id)
	{
		model.addAttribute("object", filtService.getAllGradesFromSubjectById(id));
		return "grades-page";//atvers grades-page.html
	}
	
	@GetMapping("/grades/bad") //localhost:8080/grades/bad
	public String getGradesBad(Model model)
	{
		model.addAttribute("object", filtService.getBadGrades());
		return "grades-page";//atvers grades-page.html
	}

}
