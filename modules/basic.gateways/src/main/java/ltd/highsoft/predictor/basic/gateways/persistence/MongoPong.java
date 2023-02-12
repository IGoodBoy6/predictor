package ltd.highsoft.predictor.basic.gateways.persistence;

import lombok.*;
import ltd.highsoft.predictor.basic.domain.Pong;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("pong")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class MongoPong {

    private @Id String id;
    private String pong;

    public MongoPong(Pong pong) {
        this.id = pong.description().get("id");
        this.pong = pong.description().get("pong");
    }

    public Pong toDomain() {
        return Pong.restore(id, pong);
    }

}
