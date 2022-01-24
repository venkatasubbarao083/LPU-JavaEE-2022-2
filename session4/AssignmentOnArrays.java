package com;
// Assignment 1: Rotate the Pixels to the Right by 90 degree :)
//			  2: Rotate the Pixels to the Left by 180 degrees
//			  3: Grayscale the image -> eg: pixel1 = {255, 0, 0};
//					we will add 255+0+0/3 -> 85
//					now pixel1 will be -> {85, 85, 85}, so d it for all the pixels

import java.util.Scanner;
public class AssignmentOnArrays {
    //This method to calculate the Grayscale

    static void Grayscale(int arr[][][]) {
        int avg ;
        System.out.println("\nGrayscale of the image\n");
        for (int a = 0; a < arr.length; ++a) {
            for (int b = 0; b < arr.length; ++b) {
                avg=0;
                for (int c = 0; c < arr.length; ++c) {
                    avg += arr[a][b][c];
                }
                avg/=3;
                System.out.print(avg+"  "+ avg+"  "+ avg);
                System.out.println();
            }
        }
    }


    static void check(int x,int degrees,int image[][][]) {
        System.out.println("\nAfter the Rotate the Pixels");
        if ((x == 2 && degrees == 0)||(x == 2 && degrees == 360) || (x == 1 && degrees == 360)||(x == 1 && degrees == 0)) {
            for (int a = 0; a < image.length; ++a) {
                for (int b = 0; b < image.length; ++b) {
                    for (int c = 0; c < image.length; ++c) {
                        System.out.printf("%d\t\t", image[a][b][c]);
                    }
                    System.out.println();
                }
            }
        } else if (x == 2 && degrees == 90 || x == 1 && degrees == 270) {
            System.out.println();
            for (int a = 0; a < image.length; ++a) {
                for (int b = image.length - 1; b >= 0; --b) {
                    for (int c = image.length - 1; c >= 0; --c) {
                        System.out.printf("%d\t\t", image[b][c][a]);
                    }
                }
                System.out.println();
            }
        } else if (x == 2 && degrees == 180 || x == 1 && degrees == 180) {
            System.out.println();
            for (int a = image.length - 1; a >= 0; --a) {
                for (int b = image.length - 1; b >= 0; --b) {
                    for (int c = image.length - 1; c >= 0; --c) {
                        System.out.printf("%d\t\t", image[a][b][c]);
                    }
                    System.out.println();
                }
            }
        }else if (x == 2 && degrees == 270 || x == 1 && degrees == 90) {
            System.out.println();
            for (int a = image.length - 1; a >= 0; --a) {
                for (int b = 0; b < image.length; ++b) {
                    for (int c = 0; c < image.length; ++c) {
                        System.out.printf("%d\t\t", image[b][c][a]);
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner scans =new Scanner(System.in);
        int choice;

        int[] pixel1 = {255, 0, 0}; // red :)
        int[] pixel2 = {123, 76, 44};
        int[] pixel3 = {32, 120, 0};
        int[] pixel4 = {123, 12, 120};
        int[] pixel5 = {189, 18, 0};
        int[] pixel6 = {187, 56, 130};
        int[] pixel7 = {140, 76, 120};
        int[] pixel8 = {90, 123, 90};
        int[] pixel9 = {200, 145, 105};

        // Image is an Array -> 3D

        int[][][] image = {
                {pixel1, pixel2, pixel3},
                {pixel4, pixel5, pixel6},
                {pixel7, pixel8, pixel9}
        };

        do {
            System.out.println("Select \"left\" or \"Right\"\n");
            System.out.println("\t1. For \"left\"\n\t2. For \"Right\"");
            choice = scans.nextInt();
            if(choice!=1&&choice!=2){
                System.out.println("\n!!! You are choosing wrong option !!!\n\t\t\tchoose Again\n");
            }
        }while(choice!=1&&choice!=2);

        //Getting the angle from the user
        int degrees;
        do {
            System.out.println('\u26A0' + " Don't Enter other then" + " 0" + '\u00B0' + " 90" + '\u00B0' + " 180" + '\u00B0' + " 270" + '\u00B0' + " 360" + '\u00B0' + " " + '\u26A0');
            System.out.print("Enter the degrees :");
            degrees = scans.nextInt();
        }while(degrees!=0&&degrees!=90&&degrees!=180&&degrees!=360);
        check(choice,degrees,image);

        System.out.println();
        Grayscale(image);


    }
}


