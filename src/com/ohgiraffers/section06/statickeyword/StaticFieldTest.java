package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    //non-static field와 static field 선언
        private int nonStaticCount;
        private static int staticCount;

        public int getNonStaticCount(){
            return this.nonStaticCount;
    }
        public int getStaticCount(){
            return StaticFieldTest.staticCount;
        }

        //두 필드의 값을 1씩 증가시키기위한 메소드
        public void increaseNonStaticCount(){
            this.nonStaticCount++;
        }

        public void increaseStaticCount(){
            StaticFieldTest.staticCount++;
        }

}
