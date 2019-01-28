package org.aja.randomcalcul.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Scanner;

@Embeddable
public class Random implements Serializable {

    private static Scanner sc = new Scanner(System.in);
    private static Account account = new Account();
    private final int NB_QUESTIONS = 10;

    private int score =0;
    private int result;
    private int response;


    public Random() {}

    public void randomAddition(){
        for(int i=0;i<NB_QUESTIONS;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " + " + nbr2);
            result = nbr1 + nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            response = sc.nextInt();
            if (response == result) {
                System.out.println("Bonne réponse");
                score++;
                account.setNumber(score);
            }else {
                System.out.println("Mauvaise réponse");
                System.out.println("La bonne réponse était : " + result);
            }
        } System.out.println("Votre score est de : " + score + " sur 10");
    }

    public void randomSubtraction(){
        for(int i=0;i<NB_QUESTIONS;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " - " + nbr2);
            result = nbr1 - nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            response = sc.nextInt();
            if (response == result) {
                System.out.println("Bonne réponse");
                score++;
                account.setNumber(score);
            }else {
                System.out.println("Mauvaise réponse");
                System.out.println("La bonne réponse était : " + result);
            }
        } System.out.println("Votre score est de : " + score + " sur 10");
    }

    public void randomMultiplication(){
        for(int i=0;i<NB_QUESTIONS;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " * " + nbr2);
            result = nbr1 * nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            response = sc.nextInt();
            if (response == result) {
                System.out.println("Bonne réponse");
                score++;
                account.setNumber(score);
            }else {
                System.out.println("Mauvaise réponse");
                System.out.println("La bonne réponse était : " + result);
            }
        } System.out.println("Votre score est de : " + score + " sur 10");
    }

    public void randomRandom(){
        for (int i = 0; i < NB_QUESTIONS; i++) {
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            int calcul = (int)((Math.random()*3)+1);

            switch (calcul) {

                case 1:
                    System.out.println(nbr1 + " - " + nbr2);
                    result = nbr1 - nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
                    response = sc.nextInt();
                    if (response == result) {
                        System.out.println("Bonne réponse");
                        score++;
                        account.setNumber(score);
                    }else {
                        System.out.println("Mauvaise réponse");
                        System.out.println("La bonne réponse était : " + result);
                    }
                    break;

                case 2:
                    System.out.println(nbr1 + " + " + nbr2);
                    result = nbr1 + nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
                    response = sc.nextInt();
                    if (response == result) {
                        System.out.println("Bonne réponse");
                        score++;
                        account.setNumber(score);
                    }else {
                        System.out.println("Mauvaise réponse");
                        System.out.println("La bonne réponse était : " + result);
                    }
                    break;

                case 3:
                    System.out.println(nbr1 + " * " + nbr2);
                    result = nbr1 * nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
                    response = sc.nextInt();
                    if (response == result) {
                        System.out.println("Bonne réponse");
                        score++;
                        account.setNumber(score);
                    }else {
                        System.out.println("Mauvaise réponse");
                        System.out.println("La bonne réponse était : " + result);
                    }
                    break;

                default:
                    break;
            }
        }
        System.out.println("Votre score est de : " + score + " sur 10");
    }


    public void setScore(int score) {
        this.score = score;
    }

    public int getResult() {
        return result;
    }

    public int getNB_QUESTIONS() {
        return NB_QUESTIONS;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getresponse() {
        return response;
    }

    public void setresponse(int response) {
        this.response = response;
    }

}
