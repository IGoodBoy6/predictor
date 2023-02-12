package ltd.highsoft.predictor.usecases.basic;

import ltd.highsoft.predictor.IntegrationTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class DocumentationTest extends IntegrationTest {

    @Test
    void should_view_docs_successfully() {
        get("/docs").statusCode(is(200)).contentType(equalTo("text/html;charset=UTF-8"));
    }

}
