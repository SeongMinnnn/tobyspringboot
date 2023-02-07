package toby.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloServiceTest {
    @Test
    void simpleHelloService(){
        SimpleHelloService helloService = new SimpleHelloService();
        // 오브젝트를 만들고
        String ret = helloService.sayHello("Test");
        // 메소드를 호출한다.
        Assertions.assertThat(ret).isEqualTo("Hello Test");
        // 검증 메소드 Assertions.assertThat()  해당 결과가 일치하는지 확인한다.
    }

}
