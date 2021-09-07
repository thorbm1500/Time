package com.company;

public class Main {

    public static void main(String[] args) {
        int hour = 10;
        int minute = 15;
        int second = 51;
        float start = (hour*60*60+minute*60+second);
        System.out.println("Number of second since midnight: "+(hour*60*60+minute*60+second));
        System.out.println("Number of seconds remaining of the day: "+(86400-(hour*60*60+minute*60+second)));
        System.out.println("Percentage of the day that has passed: "+(36951*100/86400)+"%");
        int hoursince = 10;
        float minutesince = 31;
        float secondsince = 9;
        System.out.println("Elapsed time since project start: "+((hoursince*60*60+minutesince*60+secondsince-start)/60)+" minutes");
    }
}
