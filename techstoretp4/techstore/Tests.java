
import java.util.ArrayList;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        ArrayList<String> noms = new ArrayList<String>();

        ArrayList<Double> prix = new ArrayList<Double>();

        ArrayList<Long> quantites = new ArrayList<Long>();

        Stock stock = new Stock(noms, prix, quantites);

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("====== GESTION DU STOCK TECHSTORE ==========");
            System.out.println("0 - Ajouter un article");
            System.out.println("1 - Augmenter la quantité d'un article");
            System.out.println("2 - Modifier un article");
            System.out.println("3 - Supprimer un article");
            System.out.println("4 - Consulter le stock");
            System.out.println("5 - Quitter");
            System.out.print("Votre choix : ");
            
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 0:
                    System.out.print("Nom de l'article : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prix de l'article : ");
                    double p = scanner.nextDouble();
                    System.out.print("Quantité : ");
                    long q = scanner.nextLong();
                    stock.ajouterArticle(nom, p, q);
                    System.out.println("Article ajouté avec succès.");
                    break;

                case 1:
                    System.out.print("Référence de l'article : ");
                    String refInc = scanner.nextLine();
                    System.out.print("Quantité à ajouter : ");
                    long qInc = scanner.nextLong();
                    if (stock.incrementerQuantiteArticle(refInc, qInc)) {
                        System.out.println("Quantité augmentée avec succès.");
                    } else {
                        System.out.println("Article introuvable.");
                    }
                    break;

                case 2:
                    System.out.print("Référence de l'article à modifier : ");
                    String refMod = scanner.nextLine();
                    System.out.print("Nouveau nom : ");
                    String nouvNom = scanner.nextLine();
                    System.out.print("Nouveau prix : ");
                    double nouvPrix = scanner.nextDouble();
                    System.out.print("Nouvelle quantité : ");
                    long nouvQ = scanner.nextLong();
                    if (stock.modifierArticle(refMod, nouvNom, nouvPrix, nouvQ)) {
                        System.out.println("Article modifié avec succès.");
                    } else {
                        System.out.println("Article introuvable.");
                    }
                    break;

                case 3:
                    System.out.print("Référence de l'article à supprimer : ");
                    String refSup = scanner.nextLine();
                    if (stock.supprimerArticle(refSup)) {
                        System.out.println("Article supprimé avec succès.");
                    } else {
                        System.out.println("Article introuvable.");
                    }
                    break;

                case 4:
                    System.out.println(stock.toString());
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 5);

        scanner.close();
    }
}