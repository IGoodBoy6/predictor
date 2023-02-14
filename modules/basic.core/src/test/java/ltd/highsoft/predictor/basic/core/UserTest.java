package ltd.highsoft.predictor.basic.core;

import ltd.highsoft.frameworks.domain.core.fields.*;
import ltd.highsoft.frameworks.test.context.WithId;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@WithId("1")
class UserTest {

    @Test
    void should_create_a_user() {
        assertThat(new User(new Id(), new Username(""), new Name(""), new Email(""), "", Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty())).isNotNull();
    }

}
