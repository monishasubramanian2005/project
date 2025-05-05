package mypackage;
import java.util.Scanner;

interface Service {
    void moveFloor(int s, int d);
}
public class Lift implements Service {
	
	    int currentFloor,destination;

	    public void moveFloor(int source, int destination) {
	        this.currentFloor = source;
	        this.destination=destination;

	        System.out.println("Lift starting at floor: " + currentFloor);
	        System.out.println("Moving to floor: " + destination);

	        while (currentFloor != destination) {
	            if (currentFloor < destination) {
	                currentFloor++;
	            } else {
	                currentFloor--;
	            }
	            System.out.println("Lift is at floor: " + currentFloor);
	        }
	    }

	    public int getCurrentFloor() {
	        return currentFloor;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the destination floor: ");
	        int destination = scanner.nextInt();
	        int source = 1;

	        Lift lift = new Lift();
	        lift.moveFloor(source, destination);
	        System.out.println("Lift reached floor: " + lift.getCurrentFloor());

	        System.out.print("Enter the destination floor: ");
	        int destination1 = scanner.nextInt();
	        Lift lift1 = new Lift();
	        lift1.moveFloor(lift.getCurrentFloor(), destination1);
	        System.out.println("Lift reached floor: " + lift1.getCurrentFloor());
	       
	        System.out.print("Enter the destination floor: ");
	        int destination3 = scanner.nextInt();
	        Lift lift2 = new Lift();
	        lift2.moveFloor(lift1.getCurrentFloor(), destination3);
	        System.out.println("Lift reached floor: " + lift2.getCurrentFloor());


	    }
	}

