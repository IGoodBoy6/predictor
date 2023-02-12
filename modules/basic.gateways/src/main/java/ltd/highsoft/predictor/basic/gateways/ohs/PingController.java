package ltd.highsoft.predictor.basic.gateways.ohs;

import ltd.highsoft.frameworks.domain.core.ValueSink;
import ltd.highsoft.frameworks.gateways.core.OpenHostService;
import ltd.highsoft.predictor.basic.application.PingUseCase;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@OpenHostService
public class PingController {

    private @Resource PingUseCase pingUseCase;

    @GetMapping("/ping")
    public ValueSink ping() {
        return pingUseCase.execute();
    }

}
