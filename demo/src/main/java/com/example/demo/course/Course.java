package com.example.demo.course;

import javax.persistence.*;

@Entity
@Table
public class Course {
    @Id
    @SequenceGenerator(
        name = "course_sequence",
        sequenceName = "course_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private String name;
    private int code;

    public Course(Long id, String name, int code){
        this.id = id;
        this.name = name;
        this.code = code;
    }

    // public Course(String name, int code){
    //     this.name = name;
    //     this.code = code;
    // }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getCode(){
        return this.code;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCode(int code){
        this.code = code; 
    }

    @Override
    public String toString(){
        return "Course{" + 
                "id=" + id +
                ", name=" + name +  '\'' +
                ", code=" + code + 
                "}"; 
    }
}
