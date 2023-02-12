package ltd.highsoft.predictor.basic.application;

import ltd.highsoft.frameworks.application.core.UseCase;
import ltd.highsoft.frameworks.domain.core.ValueSink;
import ltd.highsoft.frameworks.security.core.Authorities;
import ltd.highsoft.predictor.basic.domain.Pongs;

import static ltd.highsoft.frameworks.domain.core.GlobalValueSinkFactory.createValueSink;

@UseCase(requiredAuthorities = Authorities.ANONYMOUS)
public class PingUseCase {

    private final Pongs pongs;

    public PingUseCase(Pongs pongs) {
        this.pongs = pongs;
    }

    public ValueSink execute() {
        return createValueSink(pongs.get("ping")::content);
    }

}
