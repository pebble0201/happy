package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        /*comment. 문자열 합치기 결과를 예측하고 사용할 수 있다. */
        /*1. 두 개의 문자열 합치기 */
        System.out.println("======두 개의 문자열 합치기 =======");
        System.out.println(9+9);
        System.out.println("9"+9); //앞의 문자열 때문에 99구십구가 아니구 구구
        System.out.println(9+"9"); //문자열 만났으니까 구구
        System.out.println("9"+"9"); //문자열 구구

        /*세 개의 문자열 합치기*/
        System.out.println("======세 개의 문자열 합치기=====");
        System.out.println(9+9+"9"); //9+9숫자끼리 합쳐지고 문자열 "9"가 붙는 189 형태
        //'+' 연산 방향은 왼쪽에서 오른쪽이다.
        System.out.println(9+"9"+9); //구구구
        System.out.println("9"+9+9); //구구구

        System.out.println("9" + (9+9)); //먼저 연산하는 소괄호 이용하면 918 나옴

        /* 3. 문자열 합치기 응용*/
        System.out.println((10+20));
        System.out.println((10-20));
        System.out.println((10*20));
        System.out.println((10/20));
        System.out.println((10%20));

        System.out.println("=======결과 보기좋게 출력=======");
        System.out.println("10과 20의 합 : " + (10+20)); //소괄호 안쓰면 30 아니고  문자열이 합쳐져서 1020 도출
        System.out.println("10과 20의 차 : " + (10-20));
        System.out.println("10과 20의 곱 : " + (10*20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10/20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10%20));
    }
}
