package ltd.highsoft.frameworks.domain.core.fields;

import java.util.*;

import static com.google.common.base.Charsets.UTF_8;

public class EncryptedPassword {

    private final String value;

    public EncryptedPassword(Password password) {
        this.value = Base64.getEncoder().encodeToString(password.get().getBytes(UTF_8));
    }

    public boolean matches(Password password) {
        return Objects.equals(this.value, new EncryptedPassword(password).value);
    }

}
