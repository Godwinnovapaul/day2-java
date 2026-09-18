// package com.college.student_management.service;

// import org.springframework.stereotype.Service;

// @Service 
// public class StudentService {

//     public String getStudents() {
//         return "List of students";
//     }

//     public String createStudent() {
//         return "Student added successfully";
//     }
    
// }

package com.college.student_management.service;
import com.college.student_management.Entity.Student;
import com.college.student_management.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service 
public class StudentService {

    private final StudentRepository StudentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.StudentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return StudentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return StudentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return StudentRepository.findById(id).orElse(null);
    }
    
}
