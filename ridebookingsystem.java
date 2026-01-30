import java.util.ArrayList;
import java.util.*;
public class ridebookingsystem {

    List<Ride> rideslist = new ArrayList<>();
public void createRide(int id, String Source, String destiantion, int seats, double fare , user User)
{
    Ride ride1 = new Ride(id,destiantion,Source,seats,fare ,User);
    rideslist.add(ride1);
}


    public List<Ride> showAll()
    {
        return rideslist;
    }
    public List<Ride> SearchRide(String source , String destination , int seats)
    {
        List<Ride> availableRide = new ArrayList<>();
        for(Ride : rideslist) {
            if (rides.source.equals(source)) {
                return availableRide;
            }
        }



}

