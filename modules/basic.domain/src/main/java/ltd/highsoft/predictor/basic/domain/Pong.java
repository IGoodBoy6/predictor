package ltd.highsoft.predictor.basic.domain;

import ltd.highsoft.frameworks.domain.core.*;

import static ltd.highsoft.frameworks.domain.core.MapBasedDescriptionFactory.createDescription;

public final class Pong {

    private final String id;
    private final String pong;

    public static Pong restore(String id, String pong) {
        return new Pong(id, pong);
    }

    public static Pong newInstance(String id, String pong) {
        return new Pong(id, pong);
    }

    private Pong(String id, String pong) {
        this.id = id;
        this.pong = pong;
    }

    public Description description() {
        return createDescription(description -> {
            description.put("id", id);
            description.put("pong", pong);
        });
    }

    public void content(ValueSink sink) {
        sink.put(id, pong);
    }

}
