package pl.sda.builder;

public class User {

    private String name;
    private String lastName;
    private boolean active;
    private String city;
    private String password;
    private String postalCode;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", active=" + active +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static final class Builder {

        private String name;
        private String lastName;
        private boolean active;
        private String city;
        private String password;
        private String postalCode;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public  Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder active(boolean active){
            this.active = active;
            return this;
        }

        public Builder postalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }



        public User build() {

            User user = new User();
            user.name = this.name;
            user.lastName = this.lastName;
            user.city = this.city;
            user.password = this.password;
            user.active = this.active;
            user.postalCode = this.postalCode;

            return user;
        }

    }
}
