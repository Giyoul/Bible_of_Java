public class constant_literal {
    public static void main(String[] args) throws Exception{
        /*
        - 상수(constant)는 변하지 않는 값이다.
        - 변수 선언시 앞에 final을 붙여 선언한다
        - 리터럴(literal)은 상수의 값 자체를 의미한다
         */
        final int MAX_SPEED = 10; // (O) MAX_SPEED는 상수이며, 10이 리터럴이다
        final int MAX_SPEED;      // (X)

        final double PI = 3.14f; // (O)

        /*
            - 리터럴은 접미사를 붙여줘야 한다
            long타입은 L,
            float타입은 f,
            double타입은 d,
            int타입은 i인데,
            [double, int, char]타입은 생략할 수 있다.         
        */
        int i = 'A';        // (O) 'A의 유니코드인 65가 i에 저장된다'
        long i = 123;       // (O) 'int보다 long타입의 범위가 더 넓으므로 생략 가능'
        double d = 3.14f;   // (O) 'foat보다 double타입의 범위가 더 넓으므로 생략 가능'

        float f = 3.14;     // (X) '3.14는 double타입이므로 3.14f로 표현해야 한다.'
        char ch = 'char';   // (X) 'char타입은 한 문자이므로 문장이 들어갈 수 없다.'

        String name = 'nm'; // (O) '아래 코드와 같다'
        String name = new String('nm'); // (O) '위의 코드와 같다'

        // 어떤 타입이던 문자열과 더하면 문자열이 된다.
        String str = name + 8.0; // (O) str == "nm8.0"
    }
}
