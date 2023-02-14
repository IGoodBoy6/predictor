package ltd.highsoft.predictor.basic.core;

import ltd.highsoft.frameworks.domain.core.fields.*;

public class User {

    private final User.Account account;
    private final User.Profile profile;

    public User(Id id, GlobalName globalName, Password password, Name name, Email email, Gender gender, Text biography, Url url, Organization organization, Location location) {
        this.account = new User.Account(id, globalName, email, password);
        this.profile = new User.Profile(name, email, gender, biography, url, organization, location);
    }

    public static class Account {

        private final Id id;
        private final GlobalName globalName;
        private final Email email;
        private final EncryptedPassword password;

        public Account(Id id, GlobalName globalName, Email email, Password password) {
            this.id = id;
            this.globalName = globalName;
            this.email = email;
            this.password = password.encrypt();
        }

    }

    public static class Profile {

        private final Name name;
        private final Gender gender;
        private final Text biography;
        private final Url url;
        private final Organization organization;
        private final Location location;

        public Profile(Name name, Email email, Gender gender, Text biography, Url url, Organization organization, Location location) {
            this.name = name;
            this.gender = gender;
            this.biography = biography;
            this.url = url;
            this.organization = organization;
            this.location = location;
        }

    }

}
