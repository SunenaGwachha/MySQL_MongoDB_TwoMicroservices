package com.example.execute.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.execute.api.model.Student;
import com.example.execute.api.service.StudentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @Autowired
    MyFeignClient myFeignClient;

    @PostMapping(value = "/add")
    public Student addStudent(@RequestBody Student Student){
        return studentService.addStudent(Student);
    }


    @GetMapping(value = "/get")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

  
       @GetMapping("/getAddressfromStrudent")
//   	@HystrixCommand(fallbackMethod = "serviceMayBeDown") // This is usually used in service class OR used where
       // restTemplate is used to communicate with another
       // micro-service

       @HystrixCommand(fallbackMethod = "serviceMayBeDown", commandProperties = {
               @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
       })
       public String communicate() {

           return myFeignClient.getAddress();
       }

       public String serviceMayBeDown() {

           return "Requested Address Service May be down or too busy";
       }
}