public class App {
    public static void main(String[] args) throws Exception {

        int year = 0;
        int age;        // 초기값 없이 선언 가능
        age = 12;

        // 기본적인 문법은 c++과 유사
        age+=1;
        age++;
        int tmp = year;
        year = age;
        age = tmp;
        ++age;
        

        System.out.println("year = "+ year);
        System.out.println("age = "+ age);
    }
}