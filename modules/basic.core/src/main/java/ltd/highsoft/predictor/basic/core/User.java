package ltd.highsoft.predictor.basic.core;

import ltd.highsoft.frameworks.domain.core.fields.*;

import java.util.Optional;

public class User {

    private final Id id;
    private final Username username;
    private final Name name;
    private final Email email;
    private final Gender gender;
    private final LongText biography;
    private final Optional<String> url;
    private final Optional<String> organization;
    private final Optional<String> location;

    public User(Id id, Username username, Name name, Email email, Gender gender, LongText biography, Optional<String> url, Optional<String> organization, Optional<String> location) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.biography = biography;
        this.url = url;
        this.organization = organization;
        this.location = location;
    }

}
