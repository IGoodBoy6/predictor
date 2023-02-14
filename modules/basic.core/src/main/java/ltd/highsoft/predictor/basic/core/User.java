package ltd.highsoft.predictor.basic.core;

import ltd.highsoft.frameworks.domain.core.fields.*;

public class User {

    private final Id id;
    private final GlobalName globalName;
    private final Name name;
    private final Email email;
    private final Gender gender;
    private final LongText biography;
    private final Url url;
    private final Organization organization;
    private final Location location;

    public User(Id id, GlobalName globalName, Name name, Email email, Gender gender, LongText biography, Url url, Organization organization, Location location) {
        this.id = id;
        this.globalName = globalName;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.biography = biography;
        this.url = url;
        this.organization = organization;
        this.location = location;
    }

}
