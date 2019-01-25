package org.aja.randomcalcul.domain;

import java.util.Scanner;

public class Random {

    private static Scanner sc = new Scanner(System.in);
    private final int nb_questions=10;
    private int score =0;
    private int result;
    private int nbr1 = (int)(Math.random()*11);
    private int nbr2 = (int)(Math.random()*11);
    private int calcul = (int)(Math.random()*4);
    private int reponse;

    public Random() {
    }

    public void RandomFacile(){
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

    public void RandomDifficile(){
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

    public int getNbr1() {
        return nbr1;
    }

    public void setNbr1(int nbr1) {
        this.nbr1 = nbr1;
    }

    public int getNbr2() {
        return nbr2;
    }

    public void setNbr2(int nbr2) {
        this.nbr2 = nbr2;
    }

    public int getCalcul() {
        return calcul;
    }

    public void setCalcul(int calcul) {
        this.calcul = calcul;
    }

    public int getReponse() {
        return reponse;
    }

    public void setReponse(int reponse) {
        this.reponse = reponse;
    }

}
