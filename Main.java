package com.packag;
import java.util.Arrays;
import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstTeam = "Policeman";
        String secondTeam = "Terrorist";
        int[] policeman = new int[5];
        int[] terrorist = new int[5];
        Scanner f = new Scanner(System.in);
        System.out.println("Введіть п'ять чисел - кількість фрагів кожного гравця команди Policeman");
        policeman[0]=f.nextInt();
        policeman[1]=f.nextInt();
        policeman[2]=f.nextInt();
        policeman[3]=f.nextInt();
        policeman[4]=f.nextInt();
        System.out.println("Команда Policeman має наступні бали  "+ Arrays.toString(policeman));


        System.out.println("Введіть п'ять чисел - кількість фрагів кожного гравця команди Terrorist");
        terrorist[0]=f.nextInt();
        terrorist[1]=f.nextInt();
        terrorist[2]=f.nextInt();
        terrorist[3]=f.nextInt();
        terrorist[4]=f.nextInt();
        System.out.println("Команда Terrorist має наступні бали  "+ Arrays.toString(terrorist));

        int sum1=0;
        for (int i:policeman){
            sum1=sum1+i;
        }System.out.println("Сума фрагів команди Policeman "+sum1);
        int sum2=0;
        for (int j:terrorist){
            sum2=sum2+j;
        }System.out.println("Сума фрагів команди Terrorist "+sum2);

        double score1=0;
        score1=sum1/(double)policeman.length;
        System.out.println("Рахунок команди Policeman=  "+score1);

        double score2=0;
        score2=sum2/(double)terrorist.length;
        System.out.println("Рахунок команди Terrorist=  "+score2);

        if (score1>score2) {
            System.out.println("Виграла команда " + firstTeam + " з результатом " + score1);
        }else if(score1<score2){
            System.out.println("Виграла команда "+secondTeam+" з результатом "+score2);
        }
        else {System.out.println("Нічия");

        }

    }
}
