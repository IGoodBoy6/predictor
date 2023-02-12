package ltd.highsoft.predictor.basic.gateways.persistence;

import ltd.highsoft.frameworks.gateways.core.Aggregate;
import ltd.highsoft.frameworks.persistence.mongo.MongoAggregates;
import ltd.highsoft.predictor.basic.domain.*;
import org.springframework.data.mongodb.core.MongoTemplate;

@Aggregate
public class MongoPongs implements Pongs {

    private final MongoAggregates<MongoPong, Pong> aggregates;

    public MongoPongs(MongoTemplate mongoTemplate) {
        this.aggregates = new MongoAggregates<>(mongoTemplate, MongoPong.class, MongoPong::new, MongoPong::toDomain, Pong::verify);
    }

    @Override
    public Pong get(String id) {
        return aggregates.get(id);
    }

}
