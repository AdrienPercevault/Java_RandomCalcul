import java.lang.reflect.AccessibleObject;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.aja.randomcalcul.dal.DAO;
import org.aja.randomcalcul.domain.Account;
import org.aja.randomcalcul.domain.Random;
import java.util.Set;

public class App {

    private static final Scanner sc = new Scanner( System.in );
    private static Random currentRandom;
    private static Account currentAccount;

    public static void dspMainMenu() {

        int response;
        String name;
        boolean first = true;
        do {
            if (!first) {
                System.out.println("***********************************************");
                System.out.println("* Mauvais choix, merci de recommencer !       *");
                System.out.println("***********************************************");
            }
            try {
                response = sc.nextInt();
            } catch ( InputMismatchException e ) {
                response = -1;
            } finally {
                sc.nextLine();
            }
            first = false;
        } while ( 1 > response || 2 < response );

        switch ( response ) {
            Account account = new Account();
            case 1:
                createAccount();
                break;
            default:
                System.out.println( "* Fermeture de l'application... Au revoir !*" );

        }

        public static void createAccount(){
            Account account = new Account();
            System.out.println("* Saisir votre pseudo :                    *");
            account.setName(sc.nextLine());
            System.out.println("* Votre pseudo est :" + account.getName()+"*");
            try {
                IDAO<Account, Long> dao = DAO.getAccount(MODE);
                dao.create(account);
            }
            catch (SQLException e) {
                e.printStackTrace();
            }


        }

        public static void Choix_du_niveaux() {
        int reponse;
            Account account = new Account();
        System.out.println( "***********************************************" );
        System.out.println( "******************MENU GENERAL*****************" );
        System.out.println( "***********************************************" );
        System.out.println( "* Bonjour, "+account.getName()+"              *" );
        System.out.println(" * Veuillez choisir le niveau du jeu : ")
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

        Random random = new Random();
        switch ( response ) {

        case 1:

            random.RandomFacile();
            break;
        case 2:
            random.RandomMoyen();
            break;
        case 3:
            random.RandomDifficile();
        default:
            System.out.println( "* Fermeture de l'application... Au revoir !*" );
    }
    }
}
