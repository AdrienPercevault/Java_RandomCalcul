import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.aja.randomcalcul.dal.IDAO;
import org.aja.randomcalcul.dal.DAO;
import org.aja.randomcalcul.domain.Account;
import org.aja.randomcalcul.domain.Random;
import org.aja.randomcalcul.domain.Score;

public class app {

    private static DAO accountDAO = new DAO<Account, Long>(Account.class);
    private static DAO scoreDAO = new DAO<Score, Long>(Score.class);
    private static final Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    public static void displayMainPage() {
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
            System.out.println("* 3 : Quitter                                 *");
            System.out.println("***********************************************");
            System.out.print("* Votre choix : ");

            try {
                response = sc.nextInt();
            } catch (InputMismatchException e) {
                response = -1;
            } finally {
                sc.nextLine();
            }
            first = false;
        }
        while (1 > response || 3 < response);

        switch (response) {
            case 1:
                registration();
                break;
            case 2:
                connexion();
                break;

            default:
                System.out.println("***********************************************");
                System.out.println("* Fermeture de l'application... Au revoir !   *");
        }
    }

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
            System.out.println("* 1 : Facile                                  *");
            System.out.println("* 2 : Moyen                                   *");
            System.out.println("* 3 : Difficile                               *");
            System.out.println("* 4 : Quitter                                 *");
            System.out.println("***********************************************");
            System.out.print("* Votre choix : ");

            try {
                response = sc.nextInt();
            } catch (InputMismatchException e) {
                response = -1;
            } finally {
                sc.nextLine();
            }
            first = false;
        }
        while (1 > response || 4 < response);

        switch (response) {
            case 1:
                random.RandomFacile();
                break;
            case 2:
                random.RandomMoyen();
                break;
            case 3:
                random.RandomDifficile();
            default:
                System.out.println("***********************************************");
                System.out.println("* Fermeture de l'application... Au revoir !   *");
        }
    }

    public static void registration() {
        Account account = new Account();
        System.out.println("***********************************************");
        System.out.println("********* Ajout d'une nouvelle agence *********");
        System.out.println("***********************************************");
        System.out.println("* Création d'un compte :*");

        System.out.print("* Nom d'utilisateur : ");
        account.setUsername(sc.nextLine());

        System.out.println("* Mot de passe :");
        account.setPassword(sc.nextLine());

        try {
            IDAO<Account, Long> dao = accountDAO;
            dao.create(account);
            displayDifficultyMenu();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void connexion() {
        System.out.println("***********************************************");
        System.out.println("*************** En cour de dev ****************");
        System.out.println("***********************************************");
    }
}
