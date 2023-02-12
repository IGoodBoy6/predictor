package ltd.highsoft.predictor.usecases.basic;

import ltd.highsoft.frameworks.test.web.*;
import ltd.highsoft.predictor.ApiTest;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static ltd.highsoft.frameworks.test.web.Documentation.doc;
import static org.hamcrest.Matchers.is;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;

public class PingTest extends ApiTest {

    @Test
    void should_get_pong_when_ping() {
        get("/ping", PathVariables.variables(Map.of()), document())
            .statusCode(is(200)).body("ping", is("pong"));
    }

    @Override
    public Documentation document() {
        return doc("basic.ping",
            responseFields(
                fieldWithPath("ping").description("固定格式")
            )
        );
    }

}
