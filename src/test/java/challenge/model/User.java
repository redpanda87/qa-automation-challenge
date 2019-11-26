package challenge.model;


public class User {
    private static String email;
    private static String password;
    private static String name;
    private static String lastName;
    private static String fullName;

    public static String getFullName() {
        fullName = name +" "+lastName;
        return fullName;
    }



    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        User.lastName = lastName;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        User.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        User.password = password;
    }
}
