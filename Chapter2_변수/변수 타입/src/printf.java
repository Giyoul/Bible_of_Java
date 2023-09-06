public class printf {
    public static void main(String[] args) throws Exception{


        /*
        - 지시자 %d (int), %b (boolean), %f (float), %c (char), %s (string)
        - 줄바꿈 %n
        - C랑 똑같다
        */
        System.out.printf("age=[%d]%n", 12);
        System.out.printf("age=[%5d]%n", 12);
        System.out.printf("age=[%-5d]%n", 12);

        
        
        
        // Integer.toBinaryString(int i); → 10진수 수를 2진수로 변환시킬때 사용
        int num = 12;
        System.out.printf("age=[%s]%n", Integer.toBinaryString(num));


        
        /*
        - 소수는 기본적으로 소수점 7자리에서 반올림하여 소수점 6째 자리까지 나타낸다. ex) 1.2345678 → 1.234568
        - 소수점 표현
        */
        System.out.printf("d = %14.10f", d); // 전체 14자리의 소수 중 10자리

        // 문자열에도 적용할 수 있다.
        System.out.printf("d = %.8s", url); // 좌측에서 8글자만 출력


    }
}
