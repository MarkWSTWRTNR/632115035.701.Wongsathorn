//632115035 Wongsathorn Woratanarat
package bicycle;

import java.util.Scanner;

public class Bicycle {
    Scanner input = new Scanner(System.in);

    private int increasespeed = 5;
    private int currentspeed;

    public void setCurrentspeed() {
        for (int j = 0; j != 1;) {
            System.out.print("Enter Current speed : ");
            this.currentspeed = input.nextInt();
            if (currentspeed < 100 && currentspeed >= 0) {

                System.out.println("Set speed complete");
                j = 1;
            } else {
                System.out.println("The current speed of a bicycle cannot exceed the 99 km/hr. and less than 0");
                System.out.println("Please try again.");

            }
        }
    }

    public void showCurrentSpeed() {
        System.out.println("Current speed is : " + currentspeed + " km/hr. ");
        System.out.println(" ");
    }

    public void addIncreasespeed() {
        currentspeed = currentspeed + increasespeed;
        if (currentspeed > 99) {
            System.out.println("The current speed of a bicycle cannot exceed the 99 km/hr. ");
            currentspeed = currentspeed - increasespeed;
        }
    }

    public void addDecreaseSpeed() {
        currentspeed = currentspeed - increasespeed;
        if (currentspeed < 0) {
            currentspeed = 0;
            System.out.println("The current speed of a bicycle is " + currentspeed + " km/hr.");
        }
    }

    public void choose() {

        for (int j = 0; j != -1;) {
            System.out.print(
                    "Increase speed Enter 1" + "\n" + "Decrease speed Enter 2" + "\n" + "If you want stop Enter 3 : ");
            int i = input.nextInt();
            System.out.println(" ");
            if (i == 1) {
                addIncreasespeed();
                showCurrentSpeed();
            } else if (i == 2) {
                addDecreaseSpeed();
                showCurrentSpeed();
            } else if (i == 3) {
                currentspeed = 0;
                System.out.println("Stop!");
                showCurrentSpeed();
                j = -1;
            } else {
                System.out.println(" You input wrong !!!");
            }
        }
    }

    public void gear() {
        System.out.print("Enter the gear level : ");
        int level = input.nextInt();
        currentspeed = currentspeed + (increasespeed * level);
        if (currentspeed > 99) {
            System.out.println("The current speed of a bicycle cannot exceed the 99 km/hr. ");
            currentspeed = currentspeed - (increasespeed * level);
        }
    }

    public void choosehavegear() {

        for (int j = 0; j != -1;) {
            System.out.print(
                    "Increase speed Enter 1" + "\n" + "Decrease speed Enter 2" + "\n" + "If you want stop Enter 3 : ");
            int i = input.nextInt();
            System.out.println(" ");
            if (i == 1) {
                gear();
                showCurrentSpeed();
            } else if (i == 2) {
                addDecreaseSpeed();
                showCurrentSpeed();
            } else if (i == 3) {
                currentspeed = 0;
                System.out.println("Stop!");
                showCurrentSpeed();
                j = -1;
            } else {
                System.out.println(" You input wrong !!!");
            }
        }
    }
}