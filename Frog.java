import java.util.Scanner;

public class Frog{
    public static void main(String[] args){

	Scanner scn = new Scanner(System.in);
	System.out.print("Enter the distance: ");
	int input = scn.nextInt();

        int[] jumps = {5, 3, 2 };
        int[] waitingTimes= {2, 3, 5 };
        int x = 0;
	int time = 0;
	int distance = 0;

        System.out.print("Steps = ");
        while(x < input) {
            for (int i = 0; i < jumps.length; ++i){
                System.out.print(jumps[i]+" ");
                x += jumps[i];
                if (x < input){
                    time += waitingTimes[i];
                } else {
                    if (x == input){
                        distance = x;
                        break;
                    } else {
                        distance = x;
                        break;
                    }
                }
            }

        }
	System.out.println();
        System.out.println("Total distance is = " + distance);
        System.out.println("Total waiting time is = " + time);
    }
}