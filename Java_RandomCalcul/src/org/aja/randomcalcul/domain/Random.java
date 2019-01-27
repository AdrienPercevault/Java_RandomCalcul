package org.aja.randomcalcul.domain;

import java.util.Scanner;

public class Random {

    private static Scanner sc = new Scanner(System.in);
    private final int nb_questions=10;
    private int score =0;
    private int result;
    private int reponse;

    public void randomAddition(){
        for(int i=0;i<nb_questions;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " + " + nbr2);
            result = nbr1 + nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            reponse = sc.nextInt();
            if (reponse == result) {
                System.out.println("Bonne réponse");
                score++;
            }else {
                System.out.println("Mauvaise réponse");
            }
        } System.out.println("Votre score est de : " + score + " sur 10");
    }

    public void randomSubstraction(){
        for(int i=0;i<nb_questions;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " - " + nbr2);
            result = nbr1 - nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            reponse = sc.nextInt();
            if (reponse == result) {
                System.out.println("Bonne réponse");
                score++;
            }else {
                System.out.println("Mauvaise réponse");
            }
        } System.out.println("Votre score est de : " + score + " sur 10");
    }

    public void randomMultiplication(){
        for(int i=0;i<nb_questions;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " * " + nbr2);
            result = nbr1 * nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            reponse = sc.nextInt();
            if (reponse == result) {
                System.out.println("Bonne réponse");
                score++;
            }else {
                System.out.println("Mauvaise réponse");
            }
        } System.out.println("Votre score est de : " + score + " sur 10");
    }

    public void randomRandom(){
        for (int i = 0; i < nb_questions; i++) {
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            int calcul = (int)((Math.random()*3)+1);

            switch (calcul) {

                case 1:
                    System.out.println(nbr1 - nbr2);
                    result = nbr1 - nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 2:
                    System.out.println(nbr1 + " + " + nbr2);
                    result = nbr1 + nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
                    reponse = sc.nextInt();
                    if (reponse == result) {
                        System.out.println("Bonne réponse");
                        score++;
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 3:
                    System.out.println(nbr1 + " * " + nbr2);
                    result = nbr1 * nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
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
        System.out.println("Votre score est de : " + score + " sur 10");
    }

    public int getNb_questions() {
        return nb_questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getReponse() {
        return reponse;
    }

    public void setReponse(int reponse) {
        this.reponse = reponse;
    }

}
