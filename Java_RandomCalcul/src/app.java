import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.aja.randomcalcul.dal.DAOFactory;
import org.aja.randomcalcul.dal.IDAO;
import org.aja.randomcalcul.domain.Account;
import org.aja.randomcalcul.domain.Random;
import org.aja.randomcalcul.domain.Score;

public class app {

    private static final Scanner sc = new Scanner(System.in);
    private static Random random = new Random();
    private static Account account;
    private static Score score = new Score();

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
            System.out.println("* 2 : Connexion (en cour de dev)              *");
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
            System.out.println("* 4 : Aleatoire facile                        *");
            System.out.println("* 5 : Aleatoire difficile                     *");
            System.out.println("* 6 : Retour au menu principal                *");
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
                displayEasyRandomGameMenu();
                break;
            case 5:
                displayHardRandomGameMenu();
                break;
            default:
                displayMainMenu();
        }
    }

    public static void displayReplayMenu() {
        int response;
        boolean first = true;
        do {
            if (!first) {
                System.out.println("***********************************************");
                System.out.println("* Erreur de selection !                       *");
                System.out.println("***********************************************");
            }
            System.out.println("***********************************************");
            System.out.println("****************** REJOUER ? ******************");
            System.out.println("***********************************************");
            System.out.println("* Voulez-vous rejouer une nouvelle partie?    *");
            System.out.println("* 1 : Oui                                     *");
            System.out.println("* 2 : Non                                     *");
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
        while (1 > response || 2 < response);

        switch (response) {
            case 1:
                displayDifficultyMenu();
                break;
            case 2:
                displayMainMenu();
                break;
            default:
                break;
        }
    }

// ***********************
// *** Game Difficulty ***
// ***********************

    // ADDITION GAME
    //Ajout dans la base OK Clé étrangère KO 
    public static void displayAdditionGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "************** Calcul : addition **************" );
        System.out.println( "***********************************************" );
        for(int i=0;i<10;i++){
            int nbr1 = (int)((Math.random()*99)+1);
            int nbr2 = (int)((Math.random()*99)+1);
            System.out.println(nbr1 + " + " + nbr2);
            int result = nbr1 + nbr2;
            System.out.println("Veuillez saisir votre réponse : ");
            int response = sc.nextInt();
            if (response == result) {
                System.out.println("Bonne réponse");
                int tmp = score.getNumber();
                tmp++;
                score.setNumber(tmp);
            }else {
                System.out.println("Mauvaise réponse");
                System.out.println("La bonne réponse était : " + result);
            }
        }
        System.out.println("Votre score est de : " + score + " sur 10");
        try {
            IDAO<Score, Long> dao = DAOFactory.getScoreDAO();
            account.setScore(score);
            dao.update(score);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        /*random.randomAddition();

        try {
            IDAO<Score, Long> dao = DAOFactory.getScoreDAO();
            account.setScore(random.getScore());
            dao.update(score);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/
        displayReplayMenu();
    }

    // SUBTRACTION GAME
    public static void displaySubtractionGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "************ Calcul : soustraction ************" );
        System.out.println( "***********************************************" );
        random.randomSubtraction();

        try {
            IDAO<Account, Long> dao = DAOFactory.getAccountDAO();
            account.setScore(random.getScore());
            dao.update(account);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        displayReplayMenu();
    }

    // MULTIPLICATION GAME
    public static void displayMultiplicationGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "*********** Calcul : multiplication ***********" );
        System.out.println( "***********************************************" );
        random.randomMultiplication();

        try {
            IDAO<Account, Long> dao = DAOFactory.getAccountDAO();
            account.setScore(random.getScore());
            dao.update(account);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        displayReplayMenu();
    }

    // RANDOM GAME
    public static void displayEasyRandomGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "********** Calcul : aléatoires facile *********" );
        System.out.println( "***********************************************" );
        random.randomRandomEasy();

        try {
            IDAO<Account, Long> dao = DAOFactory.getAccountDAO();
            account.setScore(random.getScore());
            dao.update(account);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        displayReplayMenu();
    }

    // RANDOM GAME
    public static void displayHardRandomGameMenu() {
        System.out.println( "***********************************************" );
        System.out.println( "******** Calcul : aléatoires difficile ********" );
        System.out.println( "***********************************************" );
        random.randomRandomHard();

        try {
            IDAO<Account, Long> dao = DAOFactory.getAccountDAO();
            account.setScore(random.getScore());
            dao.update(account);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        displayReplayMenu();

    }

// ***********************
// *** Create  Account ***
// ***********************

    public static void registration() {
        account = new Account();
        System.out.println("***********************************************");
        System.out.println("*************** Créer un compte ***************");
        System.out.println("***********************************************");

        System.out.print("* Nom d'utilisateur : ");
        account.setUsername(sc.nextLine());

//        System.out.println("* Mot de passe : ");
//        account.setPassword(sc.nextLine());

        try {
            IDAO<Account, Long> dao = DAOFactory.getAccountDAO();
            dao.create(account);
            displayDifficultyMenu();
        }
        catch (SQLException e) {
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
        System.out.println(score.getAccounts());
        for (Account a : score.getAccounts()) {
            System.out.println("Bonjour la : ");
            System.out.println(a.getId() + " \t " + a.getUsername() + " \t ");
        }

//        try {
//            IDAO<Account, Long> dao = DAOFactory.getAccountDAO();
//            dao.findAll();
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }



//        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        Session session;
//        session = sessionFactory.openSession();
//        Query query = session.createQuery("FROM Account ORDER BY number DESC");
//        List<String> monTableauDesScores = query.list();
//        System.out.println(monTableauDesScores);
    }
}
