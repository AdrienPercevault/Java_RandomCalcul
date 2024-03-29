package org.aja.randomcalcul.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Scanner;

@Embeddable
public class Random implements Serializable {

    private static Scanner sc = new Scanner(System.in);
    private static Account account = new Account();
    private final int NB_QUESTIONS = 10;

    private int score = 0;
    private int result;
    private int response;

    public Random() {}

// ***********************
// *** RandomOperation ***
// ***********************
    private void Resultat(int result){
        System.out.println("Veuillez saisir votre réponse : ");
        response = sc.nextInt();
        if (response == result) {
            System.out.println("Bonne réponse");
            account.setNumber(score++);
        }else {
            System.out.println("Mauvaise réponse");
            System.out.println("La bonne réponse était : " + result);
        }
    }

    // ADDITION
    public void randomAddition(){
        score = 0;
        for(int i=0;i<NB_QUESTIONS;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " + " + nbr2);
            result = nbr1 + nbr2;
            Resultat(result);
        }
        System.out.println("Votre score est de : " + score + " sur 10");
    }

    // SUBTRACTION
    public void randomSubtraction(){
        score = 0;
        for(int i=0;i<NB_QUESTIONS;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " - " + nbr2);
            result = nbr1 - nbr2;
            Resultat(result);
        } System.out.println("Votre score est de : " + score + " sur 10");
    }

    // MULTIPLICATION
    public void randomMultiplication(){
        score = 0;
        for(int i=0;i<NB_QUESTIONS;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " * " + nbr2);
            result = nbr1 * nbr2;
            Resultat(result);
        } System.out.println("Votre score est de : " + score + " sur 10");
    }

// ***********************
// ***   Random Easy   ***
// ***********************

    public void randomRandomEasy(){
        score = 0;
        for (int i = 0; i < NB_QUESTIONS; i++) {
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            int calcul = (int)((Math.random()*3)+1);

            switch (calcul) {

                case 1:
                    System.out.println(nbr1 + " - " + nbr2);
                    result = nbr1 - nbr2;
                    break;

                case 2:
                    System.out.println(nbr1 + " + " + nbr2);
                    result = nbr1 + nbr2;
                    break;

                case 3:
                    System.out.println(nbr1 + " * " + nbr2);
                    result = nbr1 * nbr2;
                    break;

                default:
                    break;
            }
            Resultat(result);
        }
        System.out.println("Votre score est de : " + score + " sur 10");
    }

// ***********************
// ***   Random Hard   ***
// ***********************

    public void randomRandomHard(){
        score = 0;
        for (int i = 0; i < NB_QUESTIONS; i++) {
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            int nbr3 = (int)((Math.random()*99)+1);
            int calcul = (int)((Math.random()*8)+1);

            switch (calcul) {

                case 1:
                    System.out.println(nbr1 + " - " + nbr2 + " + " + nbr3);
                    result = nbr1 - nbr2 + nbr3;

                    break;

                case 2:
                    System.out.println(nbr1 + " - " + nbr2 + " x " + nbr3);
                    result = nbr1 - nbr2 * nbr3;
                    break;

                case 3:
                    System.out.println(nbr1 + " + " + nbr2 + " + " + nbr3);
                    result = nbr1 + nbr2 + nbr3;
                    break;

                case 4:
                    System.out.println(nbr1 + " - " + nbr2 + " - " + nbr3);
                    result = nbr1 - nbr2 - nbr3;
                    break;

                case 5:
                    System.out.println(nbr1 + " x " + nbr2 + " + " + nbr3);
                    result = nbr1 * nbr2 + nbr3;
                    break;

                case 6:
                    System.out.println(nbr1 + " x " + nbr2 + " - " + nbr3);
                    result = nbr1 * nbr2 - nbr3;
                    break;

                case 7:
                    System.out.println(nbr1 + " x " + nbr2 + " x " + nbr3);
                    result = nbr1 * nbr2 * nbr3;
                    break;

                case 8:
                    System.out.println(nbr1 + " + " + nbr2 + " - " + nbr3);
                    result = nbr1 + nbr2 - nbr3;
                    break;

                case 9:
                    System.out.println(nbr1 + " + " + nbr2 + " x " + nbr3);
                    result = nbr1 + nbr2 * nbr3;
                    break;

                default:
                    break;

            }
            Resultat(result);
        }
        System.out.println("Votre score est de : " + score + " sur 10");
    }

// ***********************
// ***Getters & Setters***
// ***********************

    // Score
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    // Result
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    // Response
    public int getresponse() {
        return response;
    }

    public void setresponse(int response) {
        this.response = response;
    }
}
