package com.company.Concept_Problems.Maths;
import java.util.Scanner;

public class DistanceBwTwoPointsOnEarth {
    public static void main(String[] args) {
        System.out.print("Enter the latitude of coordinate 1:");
        Scanner scan = new Scanner(System.in);
        double lat1 = scan.nextDouble();
        System.out.print("Enter the longitude of coordinate 1:");
        double long1 = scan.nextDouble();
        System.out.print("Enter the latitude of coordinate 2:");
        double lat2 = scan.nextDouble();
        System.out.print("Enter the longitude of coordinate 2:");
        double long2 = scan.nextDouble();
        System.out.println("The distance b/w those points is:" + distanceBwLatLong(lat1,long1,lat2,long2) + "km\n");
    }
    public static double distanceBwLatLong(double lat1,double long1,double lat2,double long2){
        //Our given points are in floating format so we have to converts it into radian format
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);

        double earthRadius = 6371.01;
        //Formula for finding distance bw two ppoints on earth is : radiusOfEarth * acos((sinx1)*sin(x2)+cos(x1)*cos(x2)*cos(y1-y2))
        return earthRadius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1-long2));
    }
}
