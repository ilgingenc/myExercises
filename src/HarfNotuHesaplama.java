import java.util.Scanner;

public class HarfNotuHesaplama {
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz:");
        int not= scan.nextInt();
        String harfnot;
        if(not>=80){
        harfnot="AA";}
        else if (not<80 && not>=70){
            harfnot="BA";}
            else if (not<70 && not>=60){
                harfnot="BB";}

        else if (not<60 && not>=50){
            harfnot="CC";}
        else if (not<50 && not>=45){
            harfnot="DD";}
        else{
            harfnot="FF";
        }
        System.out.println("Harf Notunuz:"+ harfnot);
            }
        }



