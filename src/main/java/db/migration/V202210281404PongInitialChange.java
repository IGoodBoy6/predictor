package db.migration;

import com.github.cloudyrock.mongock.*;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v2.decorator.impl.MongockTemplate;
import ltd.highsoft.predictor.basic.domain.Pong;
import ltd.highsoft.predictor.basic.gateways.persistence.MongoPong;

@ChangeLog
public class V202210281404PongInitialChange {

    @ChangeSet(order = "202210281404", id = "Initialize pong", author = "Neil Wang")
    public void init(MongockTemplate mongoTemplate) {
        mongoTemplate.save(new MongoPong(Pong.newInstance("ping", "pong")));
    }

}
