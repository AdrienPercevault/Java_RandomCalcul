import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.aja.randomcalcul.dal.DAOFactory;
import org.aja.randomcalcul.dal.IDAO;
import org.aja.randomcalcul.domain.Account;
import org.aja.randomcalcul.domain.Random;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class app {

    private static final Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

// ***********************
// ***    Main  menu   ***
// ***********************

    public static void main( String... args ) {
        displayMainMenu();
    }

// ***********************
// ***  Display  Menu  ***
// ***********************

    // MAIN MENU
    public static void displayMainMenu() {
        int response;
        boolean first = true;
        do {
            if (!first) {
                System.out.println("***********************************************");
                System.out.println("* Erreur de selection !                       *");
                System.out.println("***********************************************");
            }
            System.out.println("***********************************************");
            System.out.println("****************** CONNEXION ******************");
            System.out.println("***********************************************");
            System.out.println("* Connectez-vous ou inscrivez-vous            *");
            System.out.println("* 1 : Inscription                             *");
            System.out.println("* 2 : Connexion                               *");
            System.out.println("* 3 : Tableau des scores                      *");
            System.out.println("* 4 : Quitter                                 *");
            System.out.println("***********************************************");
            System.out.print("* Votre choix : ");

            try {
                response = sc.nextInt();
            }
            catch (InputMismatchException e) {
                response = -1;
            }
            finally {
                sc.nextLine();
            }
            first = false;
        }
        while (1 > response || 4 < response);

        switch (response) {
            case 1:
                registration();
                break;
            case 2:
                connexion();
                break;
            case 3:
                tableauScore();
                break;
            default:
                System.out.println("***********************************************");
                System.out.println("* Fermeture de l'application...               *");
        }
    }

    // DIFFICULTY MENU
    public static void displayDifficultyMenu() {
        int response;
        boolean first = true;
        do {
            if (!first) {
                System.out.println("***********************************************");
                System.out.println("* Erreur de selection !                       *");
                System.out.println("***********************************************");
            }
            System.out.println("***********************************************");
            System.out.println("************ NIVEAUX DE DIFFICULTE ************");
            System.out.println("***********************************************");
            System.out.println("* Veuillez choisir le niveau du jeu :         *");
            System.out.println("* 1 : Addition                                *");
            System.out.println("* 2 : Soustraction                            *");
            System.out.println("* 3 : Mutliplication                          *");
            System.out.println("* 4 : Aleatoire                               *");
            System.out.println("* 5 : Retour au menu principal                *");
            System.out.println("***********************************************");
            System.out.print("* Votre choix : ");

            try {
                response = sc.nextInt();
            }
            catch (InputMismatchException e) {
                response = -1;
            }
            finally {
                sc.nextLine();
            }
            first = false;
        }
        while (1 > response || 6 < response);

        switch (response) {
            case 1:
                displayAdditionGameMenu();
                break;
            case 2:
                displaySubtractionGameMenu();
                break;
            case 3:
                displayMultiplicationGameMenu();
                break;
            case 4:
                displayRandomGameMenu();
                break;
            default:
                displayMainMenu();
        }
    }

// ***********************
// *** Game Difficulty ***
// ***********************

    // ADDITION GAME
    public static void displayAdditionGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "************** Calcul : addition **************" );
        System.out.println( "***********************************************" );
        random.randomAddition();


    }

    // SUBTRACTION GAME
    public static void displaySubtractionGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "************ Calcul : soustraction ************" );
        System.out.println( "***********************************************" );
        random.randomSubtraction();

    }

    // MULTIPLICATION GAME
    public static void displayMultiplicationGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "*********** Calcul : multiplication ***********" );
        System.out.println( "***********************************************" );
        random.randomMultiplication();
    }

    // Random GAME
    public static void displayRandomGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "************* Calcul : aléatoires *************" );
        System.out.println( "***********************************************" );
        random.randomRandom();

    }

// ***********************
// *** Create  Account ***
// ***********************

    public static void registration() {
        Account account = new Account();
        System.out.println("***********************************************");
        System.out.println("*************** Créer un compte ***************");
        System.out.println("***********************************************");

        System.out.print("* Nom d'utilisateur : ");
        account.setUsername(sc.nextLine());

        System.out.println("* Mot de passe : ");
        account.setPassword(sc.nextLine());

        try {
            IDAO<Account, Long> dao = DAOFactory.getAccountDAO();
            dao.create(account);
            displayDifficultyMenu();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// ***********************
// ***     Connect     ***
// ***********************

    public static void connexion() {
        System.out.println("***********************************************");
        System.out.println("*************** En cour de dev ****************");
        System.out.println("***********************************************");
    }

// ***********************
// ***   Score table   ***
// ***********************

    public static void tableauScore() {
        System.out.println("***********************************************");
        System.out.println("************* Tableau des Scores **************");
        System.out.println("***********************************************");

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT DISTINCT username, number FROM Player ORDER BY DESC ");
        List<String> monTableauDesScores = query.list();
        System.out.println(monTableauDesScores);

    }
}
