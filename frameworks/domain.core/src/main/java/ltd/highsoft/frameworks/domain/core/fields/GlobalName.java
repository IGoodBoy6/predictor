package ltd.highsoft.frameworks.domain.core.fields;

import static ltd.highsoft.frameworks.domain.core.fields.DomainFieldRule.Anything.anything;
import static ltd.highsoft.frameworks.domain.core.fields.DomainFieldRule.StringThing.string;

public final class GlobalName extends DomainField<String> {

    public GlobalName(String value) {
        super(value);
        final var minLength = 4;
        final var maxLength = 16;
        final String usernameRegex = "^([a-zA-Z])[0-9a-zA-Z_]{1,}$";
        addRule(anything().notNull());
        addRule(string().notEmpty());
        addRule(string().minLength(minLength));
        addRule(string().maxLength(maxLength));
        addRule(string().regex(usernameRegex));
    }

}
