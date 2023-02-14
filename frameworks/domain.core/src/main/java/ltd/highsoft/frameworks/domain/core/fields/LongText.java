package ltd.highsoft.frameworks.domain.core.fields;

import static ltd.highsoft.frameworks.domain.core.fields.DomainFieldRule.Anything.anything;
import static ltd.highsoft.frameworks.domain.core.fields.DomainFieldRule.StringThing.string;

public class LongText extends DomainField<String> {

    public LongText(String value) {
        super(value);
        final int maxSize = 2000;
        addRule(anything().notNull());
        addRule(string().notEmpty());
        addRule(string().maxLength(maxSize));
    }

}
