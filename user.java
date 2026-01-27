public class user {
    int user_id;
    String name;
    String email;
    int total_seats;
    int available_seats;
    double fare;
    user User;

    public user(int user_id, String name, String email, int total_seats, int available_seats, double fare, user user) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.total_seats = total_seats;
        this.available_seats = available_seats;
        this.fare = fare;
        this.User = user;
    }


}
