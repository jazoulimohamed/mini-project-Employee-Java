import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Calendar.PM;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employe> ArrayEmpolyé = new ArrayList<>();

    public static void main (String[] args) {

        Employe.menu();
        int choix = sc.nextInt();

        while (choix < 1 || choix > 9) {
            Employe.menu();
            choix = sc.nextInt();
        }
        while (choix >= 1 && choix <= 9) {
            switch (choix) {

                case 1:

                    ajouterEmployé();
                    Employe.menu();
                    choix = sc.nextInt();
                    break;
                case 2:

                    afficheunEmploye();
                    choix = sc.nextInt();
                    break;

            }


        }
    }


        //static List<Employe> ArrayEmpolyé2 = new ArrayList<>();


        static void ajouterEmployé () {

            System.out.print("Entrer le matricule :");
            int Matricule = sc.nextInt();
            System.out.print("Entrer le nom :");
            String Nom = sc.next();
            System.out.print("Enter le prenom :");
            String Prenom = sc.next();
            System.out.print("Entrer l'age :");
            int Age = sc.nextInt();
            System.out.print("Entre le salaire :");
            double Salaire = sc.nextDouble();
            Employe e = new Employe(Matricule, Nom, Prenom, Age, Salaire);
            ArrayEmpolyé.add(e);

        
        }

        static void afficherEmploye () {
            System.out.print("Entrer  d'employé pour affiché :");
            int Matricule = sc.nextInt();
            int i = 0;
            for (Employe e : ArrayEmpolyé) {
                i++;
                if (e.getMatricule() == Matricule) {
                    System.out.println("les information de employé c'est" + e.getMatricule());
                } else {
                    System.out.println("le employé indisponible ");
                }
            }
        }



        // pour afficher un employe
        static void afficheunEmploye () {

            if (ArrayEmpolyé.isEmpty()) {
                System.out.println("Il n'y a aucun employe !");
            } else {
                System.out.print("Entrer le matricule d'employe pour l'afficher :");
                int Matricule = sc.nextInt();
                for (Employe e:ArrayEmpolyé) {
                    if (e.getMatricule() == Matricule) {
                        System.out.println(e);
                    }
                }
                System.out.println("Cet employe n'extste pas !");
            }
        }


    static void Affichersalair () {
        int nb = 0;
        if (ArrayEmpolyé.isEmpty()) {
            System.out.print("la base de donner est vide \n");

        } else {

            for (int i = 0; i < ArrayEmpolyé.size(); i++) {
                if (ArrayEmpolyé.get(i).getSalaire() > 1000) {
                    nb += 1;
                }
            }
            System.out.println("le nombre des employés ayant un salaire qui dépasse 10000 est : " + nb + "\n");
        }
    }




    }