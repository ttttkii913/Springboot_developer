package test;

import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll // 전체 테스트를 시작하기 전 처음으로 한 번만 실행(static) ex) db 연결, 테스트 환경 초기화
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach // 테스트 케이스를 시작하기 전에 매번 실행(public) ex) 객체 초기화, 테스트에 필요한 값을 미리 넣을 떄
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll // 전체 테스트를 마치고 종료하기 전 한 번만 실행 ex) 테스트 이후에 특정 데이터 삭제
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @AfterEach // 각 테스트 케이스를 종료하기 전 매번 실행
    public void afterEach() {
        System.out.println("@AfterEach");
    }
}
