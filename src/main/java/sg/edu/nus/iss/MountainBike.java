package sg.edu.nus.iss;

public class MountainBike extends Bicycle {
    public int seatHeight;


    

    public MountainBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight; // assign passed in value to class level attribute. this.seatHeight refers to class level
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        // return "MountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() + "\nSeatHeight=" + seatHeight;
    }

    

    
}
