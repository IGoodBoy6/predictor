package ltd.highsoft.predictor.basic.gateways.ohs;

import ltd.highsoft.frameworks.gateways.core.StaticResource;
import org.springframework.web.bind.annotation.RequestMapping;

@StaticResource
@RequestMapping("/docs")
public class DocumentController {

    @RequestMapping
    public String test() {
        return "apidoc.html";
    }

}
