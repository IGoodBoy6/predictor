package ltd.highsoft.predictor.basic.domain;

import ltd.highsoft.frameworks.domain.core.ValueSink;

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

    public String id() {
        return id;
    }

    public String pong() {
        return pong;
    }

    public void content(ValueSink sink) {
        sink.put(id, pong);
    }

}
