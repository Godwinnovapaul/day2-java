// package com.college.student_management.controller;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController

// public class StudentController {
//     private final StudentService studentService;

//     public StudentController(StudentService studentService) {
//         this.studentService = studentService;
//     }
//     @GetMapping("/hello")
//     public String hello()
//     {
//         return "Successful";
//     }
//     @PostMapping("/students")
//     public String createStudent(){
//         return studentService.createStudent();
//     }

// }

package com.college.student_management.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.college.student_management.Entity.Student;
import java.util.List;


import com.college.student_management.service.StudentService;

@RequestMapping("/students")
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

   @GetMapping

    public List<Student> getAllStudents() {

        return studentService.getAllStudents();

    }

    // GET student by ID

    @GetMapping("/{id}")

    public Student getStudentById(@PathVariable Long id) {

        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}