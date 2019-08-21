package wcci.Rendering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;


@Service
public class Initializer implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepo;
	
	

	private Room room1;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		populateStudent (); 

	}

	
	private void populateStudent () {
		Student student1 = new Student (room1, "Lawrence", "27", "Columbus");
		studentRepo.save(student1);
		Student student2 = new Student (room1, "Mike", "29", "Columbus");
		studentRepo.save(student2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
