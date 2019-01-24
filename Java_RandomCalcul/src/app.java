import java.util.InputMismatchException;
import java.util.Scanner;

import org.aja.randomcalcul.domain.Random;

public class app {

    private static final Scanner sc = new Scanner( System.in );
    private static Random currentRandom;

    public static void dspMainMenu() {

        int response;
        boolean first = true;
        do {
            if ( !first ) {
                System.out.println( "***********************************************" );
                System.out.println( "* Mauvais choix, merci de recommencer !       *" );
                System.out.println( "***********************************************" );
            }
            System.out.println( "***********************************************" );
            System.out.println( "******************MENU GENERAL*****************" );
            System.out.println( "***********************************************" );
            System.out.println( "* Choisir le niveau pour lancer la partie     *" );
            System.out.println( "* 1 : Niveau Facile                           *" );
            System.out.println( "* 2 : Niveau Moyen                            *" );
            System.out.println( "* 3 : Niveau Difficile                        *" );
            System.out.println( "***********************************************" );
            System.out.print( "*   Votre choix : " );
            try {
                response = sc.nextInt();
            } catch ( InputMismatchException e ) {
                response = -1;
            } finally {
                sc.nextLine();
            }
            first = false;
        } while ( 1 > response || 3 < response );

        switch ( response ) {
            case 1:
                RandomFacil();
                break;
            case 2:
                RandomMoyen();
                break;
            case 3:
                RandomDifficil();
            default:
                System.out.println( "* Fermeture de l'application... Au revoir !*" );
        }
    }

    public static void RandomFacil(){

    }

    public static void RandomMoyen(){

    }

    public static void RandomDifficil(){

    }
}
