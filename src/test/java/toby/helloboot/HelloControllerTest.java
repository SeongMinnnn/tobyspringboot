package toby.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tobyspring.helloboot.HelloController;

public class HelloControllerTest {
    @Test
    void helloController(){
        HelloController helloController = new HelloController(name -> name);
        //연결을 끊어주고
        String ret = helloController.hello("Test");

        Assertions.assertThat(ret).isEqualTo("Test");
    }

    @Test        //위에서 테스트한 클래스 내 Api가 잘 돌아가는 지 확인
    void failsHelloController() {
        HelloController helloController = new HelloController(name-> name);

        Assertions.assertThatThrownBy( () -> {
            helloController.hello(null);
        }).isInstanceOf(IllegalArgumentException.class);

        Assertions.assertThatThrownBy( () -> {
            helloController.hello("");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
