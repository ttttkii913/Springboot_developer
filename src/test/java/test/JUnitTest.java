package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1 + 2는 3이다") // 테스트 이름
    @Test // 테스트임을 명시
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a + b); // 값이 같은지 확인
        // assertEquals = 첫 번째 인수(기대하는 값)와 두 번째 인수(실제로 검증할 값)의 값이 같은지 비교
    }
}
