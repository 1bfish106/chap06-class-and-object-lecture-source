package com.ohgiraffers.section03.dto;

public class memberDto {
    //취급하려는 회원 정보를 고려해서 필드를 작성해본다
    //값 객체가 가지는 속성을 추출하는 과정을 추상화라고 한다.

    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    //필드를 private으로 설명하면 public으로 접근을 허용하는 설정자/접근자를 이용해 필드에 간접접근해야한다.
    //설정자 (setter) 접근자 (getter)는 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.

    //설정자 (setter)
    //[표현식]
    //public void set필드명(매개변수) {
    //필드=매개변수;
    //}

    public void setNumber(int number){
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setActivated(boolean isActivated){
        this.isActivated = isActivated;
    }

    //접근자(getter)
    //[표현식]
    //public 반환형 get필드명() {return 반환값;}

    public int getNumber(){
        return number;
    }
    public String getName(){ return name; }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public boolean isActivated(){
        return isActivated;
    }

}
