package builder;

public class UserMain {
    public static void main(String[] args) {
        User user = User.UserBuilder.UserBuilder()
                        .username("junil")
                        .password("1234")
                        .build();
    }
}
