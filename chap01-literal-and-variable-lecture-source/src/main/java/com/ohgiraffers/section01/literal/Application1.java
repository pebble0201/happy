package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        /*comment. 여러 가지 값의 형태를 출력할 수 있다.*/
        //값 자체를 리터럴이라고 함

        /*comment. 숫자 형태의 값*/
        /*1-1. 정수 형태의 값 출력*/
        System.out.println(123);

        /*1-2. 실수 형태의 값 출력*/
        System.out.println(1.23);

        /*2. 문자 형태의 값 출력*/
        System.out.println('a'); //문자 형태의 값은 작은따옴표로 감싸줘야한다.
//        System.out.println('ab'); //두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println(''); //아무 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('1'); //숫자 값이지만 작은따옴표로 감싸져있는 경우는 문자 '1'이라고 판단한다.

        /*3. 문자열 형태의 값 출력*/
        System.out.println("안녕하세요"); //문자열로 문자 여러 개가 나열된 형태를 말하며 쌍따옴표로 감싸주어야한다.
        System.out.println("123"); //정수지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야한다.
//        System.out.println("a");
//        System.out.println("1");
        System.out.println("");
        System.out.println("a"); //한개의 문자도 쌍따옴표로 감싸면 문자열이다. 문자 a와 다르다

        /*4.논리 형태의 값 출력*/
        System.out.println(true);
        System.out.println(false);



    }
}
