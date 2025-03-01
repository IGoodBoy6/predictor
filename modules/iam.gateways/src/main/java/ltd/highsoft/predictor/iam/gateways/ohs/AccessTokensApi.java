package ltd.highsoft.predictor.iam.gateways.ohs;

import ltd.highsoft.frameworks.domain.core.ValueSink;
import ltd.highsoft.frameworks.gateways.core.OpenHostService;
import ltd.highsoft.predictor.iam.application.GetAccessTokenContentUseCase;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@OpenHostService
@RequestMapping("/access-tokens")
public class AccessTokensApi {

    private @Resource GetAccessTokenContentUseCase getAccessTokenContentUseCase;

    @GetMapping("current")
    public Optional<ValueSink> getContent() {
        return getAccessTokenContentUseCase.execute();
    }

}
