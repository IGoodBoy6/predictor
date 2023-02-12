package ltd.highsoft.predictor.basic.domain;

import ltd.highsoft.frameworks.domain.core.*;
import ltd.highsoft.frameworks.domain.core.fields.*;

import static ltd.highsoft.frameworks.domain.core.MapBasedDescriptionFactory.createDescription;

public final class Pong {

    private final Id id;
    private final Name pong;

    public static Pong restore(String id, String pong) {
        return new Pong(id, pong);
    }

    public static Pong newInstance(String id, String pong) {
        return new Pong(id, pong);
    }

    private Pong(String id, String pong) {
        this.id = new Id(id);
        this.pong = new Name(pong);
    }

    public void verify() {
        id.verify();
        pong.verify();
    }

    public Description description() {
        return createDescription(description -> {
            description.put("id", id);
            description.put("pong", pong.get());
        });
    }

    public void content(ValueSink sink) {
        sink.put(id.get(), pong.get());
    }

}
