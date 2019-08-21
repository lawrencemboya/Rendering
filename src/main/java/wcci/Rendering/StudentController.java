package wcci.Rendering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/students")
	@CrossOrigin
	public Iterable<Student> findAllStudents(){
		return studentRepo.findAll();
	}

}
