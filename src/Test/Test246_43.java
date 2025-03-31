package Test;

public class Test246_43 {
    public static void main(String []args) {
        int p = 2;  // 기본값을 2로 설정
        int n = 3;
        while (true) {
            double t = Math.sqrt(n);  // n의 제곱근 계산
            int m = (int)t;  // 제곱근 값을 정수로 변환
            for (int i = 2; i <= m; i++) {  // 2부터 m까지 나누어 보는 반복문
                int r = n % i;  // 나머지를 구함
                if (r == 0)  // 나머지가 0이면 n은 소수가 아님
                    break;
                if (i == m)  // m까지 다 나누어 떨어지지 않으면 소수
                    p = n;  // 소수이면 p에 n을 저장
            }
            n++;  // n을 증가시켜서 다음 숫자를 확인
            if (n > 100)  // n이 100을 넘으면 종료
                break;
        }
        System.out.printf("%d\n", p);  // 가장 큰 소수를 출력
    }
}
