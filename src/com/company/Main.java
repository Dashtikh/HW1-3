package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("choose your shape:  ");
        System.out.println("1-circle 2-square 3-triangle  4-rectangle");
        Scanner scanner = new Scanner(System.in);
        Circle circle=new Circle();
        Square square =new Square();
        int shapetype =scanner.nextInt();
        switch (shapetype){
            case 1 :
                System.out.println("insert radios: ");
                double r=scanner.nextInt();
                System.out.println("surface is: "+circle.surface(r));
                System.out.println("perimeter is: "+ circle.perimeter(r));
                break;
            case 2:
                System.out.println("insert gon: ");
                double g=scanner.nextInt();
                System.out.println("surface is: "+Square.surface(g));
                System.out.println("perimeter is: "+ Square.perimeter(g));
                break;
            case 3:
                System.out.println("qaede va ertefa ra vared konid: ");
                double q=scanner.nextInt();
                double e=scanner.nextInt();
                System.out.println("azla ra vared konid: ");
                double a=scanner.nextInt();
                double b=scanner.nextInt();
                double c=scanner.nextInt();
                System.out.println("surface is: "+Triangle.surface(q,e));
                System.out.println("perimeter is: "+ Triangle.perimeter(a,b,c));
                break;
            case 4:
                System.out.println("insert gons: ");
                double g1=scanner.nextInt();
                double g2=scanner.nextInt();
                System.out.println("surface is: "+Rectangle.surface(g1,g2));
                System.out.println("perimeter is: "+ Rectangle.perimeter(g1,g2));
                break;



            }
        }
    }

