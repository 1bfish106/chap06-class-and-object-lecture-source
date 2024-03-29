package com.ohgiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {
        //데이터를 추상화하는 기법을 이해하고 이를 사용하여 프로그래밍 할 수 있다.
        // 캡슐화의 원칙에서 일부 어긋나기는 하지만 다른목적을 가진 클래스와 객체를 추상화하는 기법이 있다.
        //행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체의 경우이다.

        memberDto member = new memberDto();
        member.setNumber(1);
        member.setName("정가연");
        member.setAge(27);
        member.setGender('여');
        member.setHeight(166.8);
        member.setWeight(56.0);
        member.setActivated(true);

        System.out.println("회원번호 : " + member.getNumber());
        System.out.println("회원이름 : " + member.getName());
        System.out.println("회원나이 : " + member.getAge());
        System.out.println("회원성별 : " + member.getGender());
        System.out.println("회원 키 : " + member.getHeight());
        System.out.println("회원 몸무게 : " + member.getWeight());
        System.out.println("회원 활성화 상태 : " + member.isActivated());

        //캡슐화 원칙에 따라 작성하기는 했으나 실제로는 캡슐화가 의미 없을 정도로 필드명을 그대로 사용한
        //설정자와 접근자로 인해 캡슐화 효과가 없다. (유지보수성 악화)
        //하짐나 데이터를 주로 다루는 객체의 경우 행위를 추상화하지않고 미리 모든 필드에 접근 가능성을
        //염두에 두고 작성해두는 관례로 인해 현재도 많이 사용하고 있다.


    }

}
