import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          ridebookingsystem ridebookingsystem = new ridebookingsystem();
          ridebookingsystem.createRide(1,"Greater Noida" ,"Agra" , 3 , 275.30);
          ridebookingsystem.createRide(2 , "Agra" , "Delhi" , 5 , 4614.5);
        System.out.println(ridebookingsystem.showAll());

    }
}