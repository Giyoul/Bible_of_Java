// Scanner를 사용하기 위해서는 아래의 줄을 써줘야 한다.
import java.util.*;

public class Scanner_p {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);   // Scanner 클래스의 객체를 생성
        String inputStr = scanner.nextLine();       // 입력받은 내용을 string타입으로 저장

        System.out.printf("%s%n", inputStr);

        /*
         * nextLine 대신에, nextInt(), nextFloat도 있지만, 보통 nextLine()을 사용하고 형 변환을 진행한다.
         * 스트링을 int로 변환할떄는 Integer.parseInt();
         * 스트링을 float으로 변환할때는 Float.parseFloat();을 사용한다.
         */
        int num = Integer.parseInt(inputStr);
        System.out.printf("%d%n", num);

        // scanner를 system.in 해주었기 때문에 close도 해줘야 한다.
        scanner.close();
    }
}
