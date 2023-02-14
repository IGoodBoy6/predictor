package ltd.highsoft.predictor.basic.core;

import ltd.highsoft.frameworks.domain.core.fields.*;

import java.util.Optional;

public class User {

    private final Id id;
    private final Name username;
    private final Name name;
    private final Email email;
    private final String gender;
    private final Optional<String> biography;
    private final Optional<String> url;
    private final Optional<String> organization;
    private final Optional<String> location;

    public User(Id id, Name username, Name name, Email email, String gender, Optional<String> biography, Optional<String> url, Optional<String> organization, Optional<String> location) {
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
