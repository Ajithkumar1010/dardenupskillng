package com.example.microserivetask.springboot.controller;

import com.example.microserivetask.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(
                1,
                "ajith",
                "kumar"
        );
        //return new ResponseEntity<> (student, HttpStatus.OK);
        return ResponseEntity.ok()
                .header("custom-header","ajith")
                .body(student);
    }

    // http://localhost:8080/students
    @GetMapping
    public ResponseEntity<List <Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "ajith", "kumar"));
        students.add(new Student(2, "arun", "kumar"));
        students.add(new Student(3, "ram", "kumar"));
        students.add(new Student(4, "sanjay", "kumar"));
        return ResponseEntity.ok(students) ;
    }

    //spring boot rest api with path variable
    // {id}- URI template variable
    //pathvariable-used on method argument to bind it to the value of uri template variable
    // http://localhost:8080/students/1/ajith/kumar

    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity <Student> studentPathVariable( @PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        Student student= new Student(studentId, firstName, lastName);
         return ResponseEntity.ok(student);
    }

    //diff b/t pathvariable is used to bind the value of uri template variable into method arg and requestparm is used to extract the value of query parameter in a request

//spring boot rest api with request parm
// http://localhost:8080/students/query?id=1&firstName=ajith&lastName=kumar ->query

@GetMapping("query")
public ResponseEntity <Student> studentRequestVariable( @RequestParam int id,
                                         @RequestParam String firstName,
                                          @RequestParam String lastName) {
    Student student=new Student(id, firstName, lastName );
    return ResponseEntity.ok(student);
}

//spring boot rest api that handles http post request- creating new resouce
    //postmapping- used for mapping HTTP post request onto specific method
    // requestbody-responsible for retrieving the http request body and automatically converting it to the java object

    @PostMapping("create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent( @RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED) ;
    }

    //spring boot rest api that handles http post request - updating existing resource

    @PutMapping("{id}/update")
     public ResponseEntity<Student> updateStudent( @RequestBody Student student, @PathVariable("id") int studentId) {
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return ResponseEntity.ok(student);
    }

    //spring boot rest api that handles http delete request - deleting existing resource

    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent( @PathVariable("id") int studentId){
        System.out.println(studentId);
        return ResponseEntity.ok("student deleted successfully") ;
    }


}