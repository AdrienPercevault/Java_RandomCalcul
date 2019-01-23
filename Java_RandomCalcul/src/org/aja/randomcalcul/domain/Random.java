package org.aja.randomcalcul.domain;

import java.util.Scanner;

public class Random {

    public void RandomFacil(){
        final int nb_questions=10;
        int score =0,result,nbr1=(int)(Math.random()*11),nbr2=(int)(Math.random()*11),calcul=(int)(Math.random()*4),reponse;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<nb_questions;i++){
            switch (calcul) {
                case 1:
                    System.out.println(nbr1 + nbr2);
                    result = nbr1 + nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 2:
                    System.out.println(nbr1 - nbr2);
                    result = nbr1 - nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 3:
                    System.out.println(nbr1 / nbr2);
                    result = nbr1 / nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 4:
                    System.out.println(nbr1 * nbr2);
                    result = nbr1 * nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                default:

                    break;
            }
        }
    }

    public void RandomMoyen() {
        final int nb_questions = 10;
        int score = 0, result, nbr1 = (int) (Math.random() * 11), nbr2 = (int) (Math.random() * 11), calcul = (int) (Math.random() * 4), reponse;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nb_questions; i++) {
            switch (calcul) {
                case 1:
                    System.out.println(nbr1 + nbr2);
                    result = nbr1 + nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 2:
                    System.out.println(nbr1 - nbr2);
                    result = nbr1 - nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 3:
                    System.out.println(nbr1 * nbr2);
                    result = nbr1 * nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 4:
                    System.out.println(nbr1 / nbr2);
                    result = nbr1 / nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                default:

                    break;
            }
        }

    }

    public void RandomDificil(){
        final int nb_questions=10;
        int score = 0,result,nbr1=(int)(Math.random()*11),nbr2=(int)(Math.random()*11),calcul=(int)(Math.random()*4),reponse;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nb_questions; i++) {
            switch (calcul) {
                case 1:
                    System.out.println(nbr1 - nbr2);
                    result = nbr1 + nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 2:
                    System.out.println(nbr1 + nbr2);
                    result = nbr1 - nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 3:
                    System.out.println(nbr1 / nbr2);
                    result = nbr1 / nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 4:
                    System.out.println(nbr1 * nbr2);
                    result = nbr1 * nbr2;
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                default:

                    break;
            }
        }


    }
}
