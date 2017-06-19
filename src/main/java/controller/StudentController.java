package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Student;

@Controller
public class StudentController {

	@RequestMapping("/student")
	public String studentmodel(Model model){
		Student student=new Student();
		student.setStu_fname("satrajit");
		student.setStu_lname("nath");
		student.setStu_age("23");
		model.addAttribute("student", student);
		return "studentview";
		
	}
	@ResponseBody
	@RequestMapping("/kd")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
}
