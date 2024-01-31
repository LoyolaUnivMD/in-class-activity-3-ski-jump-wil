//HelloWorld.java
//# Programmers:
//        # Course: Computer Science 212
//        # Due Date: Jan 32, 2024
//        # Lab Assignment: 3
//        # Problem Statement: Find out how far someone jumped
//        # Data In:speed, hill type
//        # Data Out:Distance, how they did compared to par
//        # Credits:
import java.util.Scanner;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What hill type did you have(normal or large)?: ");
        String hill = input.nextLine();

        System.out.print("What speed were you going?: ");
        double speed = input.nextDouble();

        //if hill type is normal
        if(hill.equals("normal")){
            //pre given info about hill
            int par = 90;
            double ppm = 2.0;
            int height = 46;
            //calculate the time distance and points
            double time = Math.sqrt((2*height)/9.8);
            double distance = speed * time;
            double points = 60+(distance-par)*ppm;
            //rounds distance and points to 2 decimal
            distance = (double) Math.round(distance*100)/100;
            points = (double) Math.round(points*100)/100;
            //outputs the distance and points
            System.out.println("You went "+distance+" distance and got "+points+" points.");
            //if the points gained are more than 61 they did good
            if(points > 61){
                System.out.println("Great job for doing better than par!");
            }
            // if the points are less than 10 ask wht happened
            else if(points <= 10){
                System.out.print("What happened??");
            }
            //if points are not less than 10 or greater than 61 say they didnt do well
            else{
                System.out.println("Sorry you didn't go very far.");
            }
        }


        //if hill type is large
        else if(hill.equals("large")){
            //set pre given information about hill
            int par = 120;
            double ppm = 1.8;
            int height = 70;
            //calculate the time distance and points
            double time = Math.sqrt((2*height)/9.8);
            double distance = speed * time;
            double points = 60+(distance-par)*ppm;
            //rounds distance and points to 2 decimal
            distance = (double) Math.round(distance*100)/100;
            points = (double) Math.round(points*100)/100;
            //outputs the distance and points
            System.out.println("You went "+distance+" distance and got "+points+" points.");
            //if the points gained are more than 61 they did good
            if(points > 61){
                System.out.println("Great job for doing better than par!");
            }
            // if the points are less than 10 ask wht happened
            else if(points <= 10){
                System.out.print("What happened??");
            }
            //if points are not less than 10 or greater than 61 say they didnt do well
            else{
                System.out.println("Sorry you didn't go very far.");
            }
        }
        //if they entered invalid hill type
        else{
            System.out.println("Invalid hill input.");
        }

        
    }
}
