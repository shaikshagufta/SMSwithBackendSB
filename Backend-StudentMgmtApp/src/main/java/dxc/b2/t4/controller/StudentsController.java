package dxc.b2.t4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dxc.b2.t4.model.Students;
import dxc.b2.t4.repository.StudentsRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1")
public class StudentsController {

	@Autowired
	private StudentsRepository studentsRepository;

	//get all students
	@GetMapping("/students")
	public List < Students > getAllEmployees() {
		return studentsRepository.findAll();
	}

	// create employee rest API
	@PostMapping("/students")
	public Students createEmployee(@RequestBody Students students) {
		return studentsRepository.save(students);
	}

	/*// get employee by id rest API
	@GetMapping("/students/{id}")
	public ResponseEntity < Students > getEmployeeById(@PathVariable Long id) {
		Students students = studentsRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("Students not exist with id:" +id));

		return ResponseEntity.ok(students);
	}

	// update employee rest api

	@PutMapping("/students/{id}")
	public ResponseEntity < Students > updateEmployee(@PathVariable Long id, @RequestBody Students employeeDetails) {
		Students students = studentsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Students not exist with id:" + id));


		students.setFirstName(students.getFirstName());
		students.setLastName(students.getLastName());
		students.setEmailId(students.getEmailId());

		Students updatedEmployee = studentsRepository.save(students);
		return ResponseEntity.ok(updatedEmployee);
	}

	// delete employee rest api
	@DeleteMapping("/students/{id}")
	public ResponseEntity < Map < String, Boolean >> deleteEmployee(@PathVariable Long id) {
		Students employee = studentsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not exist with id :" +id));

		studentsRepository.delete(employee);
		Map < String, Boolean > response = new HashMap < > ();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}*/
}
