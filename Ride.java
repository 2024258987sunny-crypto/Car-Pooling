
public class Ride {
    int id;
    String Source;
    String destination;
    int Seats;
    double fare;

    public Ride(int id1 ,String destination , String Source , int seat , double fare) {
        this.id = id1;
        this.destination = destination;
        this.fare = fare;
        this.Seats = seat;
        this.Source = Source;
    }
    public String toString()
    {
        return "ID " +id  +" " +"Source - " + Source + " " + "Seats - " + Seats +" " + "Destination -  " + destination + " " + "fare -" +fare;
    }
}

