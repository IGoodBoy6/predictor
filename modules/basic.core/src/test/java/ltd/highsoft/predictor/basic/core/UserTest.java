package ltd.highsoft.predictor.basic.core;

import ltd.highsoft.frameworks.domain.core.fields.*;
import ltd.highsoft.frameworks.test.context.WithId;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@WithId("1")
class UserTest {

    @Test
    void should_create_a_user() {
        assertThat(new User(new Id(), new GlobalName(""), "", new Name(""), new Email(""), Gender.MALE, new Text(""), new Url(""), new Organization(""), new Location(""))).isNotNull();
    }

}
