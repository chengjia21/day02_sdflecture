package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        MountainBike mountainBike = new MountainBike(5, 10, 20);
        System.out.println(mountainBike.toString());

        MountainBike mountainBike2 = new MountainBike(10, 15, 25);
        MountainBike mountainBike3 = new MountainBike(15, 20, 30);

        RoadBike roadBike = new RoadBike(15, 120, 30);



//   <Bicycle> is defining the type as Bicycle, so won't become generic?
        List<Bicycle> bicycles = new ArrayList<Bicycle>();
        bicycles.add(mountainBike);
        bicycles.add(mountainBike2);
        bicycles.add(mountainBike3);
        bicycles.add(roadBike);

        for(Bicycle bicycle: bicycles){
            System.out.println(bicycle.toString());
        }

        for(Bicycle bicycle: bicycles){
            if (bicycle instanceof MountainBike){
                System.out.println(bicycle.hashCode() + " is a Mountain Bike");
            } else if (bicycle instanceof RoadBike) {
                System.out.println(bicycle.hashCode() + " is a Road Bike");
            }

            // System.out.println(bicycle.toString());
        }

        //Another way without using loop is to use:
        // System.out.println(bicycles.toString());


    }
}
