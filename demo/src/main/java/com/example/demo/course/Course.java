package com.example.demo.course;

public class Course {
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
