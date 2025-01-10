package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {

    // 각각의 테스트를 시작하기 전에 "Hello!" 출력, 모든 테스트 끝마치고 "Bye!" 출력

    @BeforeEach // 매번 실행
    public void beforeEach() {
        System.out.println("Hello!");
    }

    @Test
    public void junitQuiz3() {
        System.out.println("This is first test");
    }

    @Test
    public void junitQuiz4() {
        System.out.println("This is second test");
    }

    @AfterAll // 한 번만 실행
    static void afterAll() {
        System.out.println("Bye!");
    }
}
