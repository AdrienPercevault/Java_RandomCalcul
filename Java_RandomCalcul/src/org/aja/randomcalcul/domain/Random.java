package org.aja.randomcalcul.domain;

import java.util.Scanner;

public class Random {

    private static Scanner sc = new Scanner(System.in);
    private final int NB_QUESTIONS = 10;
    private int scoreNumber = 0;
    private int result;
    private int response;
    private Score score = new Score();

    public Random() {

    }

// ***********************
// ***     Classes     ***
// ***********************

    // Addition
    public void randomAddition(){
        int nbr1 = (int)((Math.random()*99)+1);
        int nbr2 = (int)((Math.random()*99)+1);
        for(int i=0;i<NB_QUESTIONS;i++){
            System.out.println(nbr1 + " + " + nbr2);
            result = nbr1 + nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            response = sc.nextInt();
            if (response == result) {
                System.out.println("Bonne réponse");
                scoreNumber++;
                score.setNumber(scoreNumber);
            }else {
                System.out.println("Mauvaise réponse");
            }
        } System.out.println("Votre score est de :" + scoreNumber + " sur 10");
    }

    // Subtraction
    public void randomSubtraction(){
        int nbr1 = (int)((Math.random()*99)+1);
        int nbr2 = (int)((Math.random()*99)+1);
        for(int i=0;i<NB_QUESTIONS;i++){
            System.out.println(nbr1 + " - " + nbr2);
            result = nbr1 - nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            response = sc.nextInt();
            if (response == result) {
                System.out.println("Bonne réponse");
                scoreNumber++;
                score.setNumber(scoreNumber);
            }else {
                System.out.println("Mauvaise réponse");
            }
        } System.out.println("Votre score est de :" + scoreNumber + " sur 10");
    }

    // Multiplication
    public void randomMultiplication(){
        int nbr1 = (int)((Math.random()*99)+1);
        int nbr2 = (int)((Math.random()*99)+1);
        for(int i=0;i<NB_QUESTIONS;i++){
            System.out.println(nbr1 + " * " + nbr2);
            result = nbr1 * nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            response = sc.nextInt();
            if (response == result) {
                System.out.println("Bonne réponse");
                scoreNumber++;
                score.setNumber(scoreNumber);
            }else {
                System.out.println("Mauvaise réponse");
            }
        } System.out.println("Votre score est de :" + scoreNumber + " sur 10");
    }

    // Random
    public void randomRandom(){
        for (int i = 0; i < NB_QUESTIONS; i++) {
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            int calcul = (int)((Math.random()*3)+1);

            switch (calcul) {

                case 1:
                    System.out.println(nbr1 - nbr2);
                    result = nbr1 - nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
                    response = sc.nextInt();
                    if (response == result) {
                        System.out.println("Bonne réponse");
                        scoreNumber++;
                        score.setNumber(scoreNumber);
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 2:
                    System.out.println(nbr1 + " + " + nbr2);
                    result = nbr1 + nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
                    response = sc.nextInt();
                    if (response == result) {
                        System.out.println("Bonne réponse");
                        scoreNumber++;
                        score.setNumber(scoreNumber);
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                case 3:
                    System.out.println(nbr1 + " * " + nbr2);
                    result = nbr1 * nbr2;
                    System.out.println("Veuillez saisir votre réponse : ");
                    response = sc.nextInt();
                    if (response == result) {
                        System.out.println("Bonne réponse");
                        scoreNumber++;
                        score.setNumber(scoreNumber);
                    }else {
                        System.out.println("Mauvaise réponse");
                    }
                    break;

                default:
                    break;
            }
        }
        System.out.println("Votre score est de :" + scoreNumber + " sur 10");
    }

// ***********************
// ***Getters & Setters***
// ***********************

    // NB_QUESTIONS
    public int getNB_QUESTIONS() {
        return NB_QUESTIONS;
    }

    // ScoreNumber
    public int getscoreNumber() {
        return scoreNumber;
    }

    public void setscoreNumber(int scoreNumber) {
        this.scoreNumber = scoreNumber;
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
