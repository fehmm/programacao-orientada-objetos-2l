package CLINICA.model.odata;

import CLINICA.model.dao.TutorDAO;
import CLINICA.model.dao.AnimalDAO;
import CLINICA.model.Tutor;
import CLINICA.model.Animal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TutorDAO tutorDAO = new TutorDAO();
        AnimalDAO animalDAO = new AnimalDAO();

        while (true) {
            System.out.println("\n=== CLÍNICA VETERINÁRIA ===");
            System.out.println("1 - Cadastrar Tutor");
            System.out.println("2 - Listar Tutors");
            System.out.println("3 - Cadastrar Animal");
            System.out.println("4 - Listar Animais");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int op = sc.nextInt(); sc.nextLine();

            if (op == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Telefone: ");
                String tel = sc.nextLine();
                tutorDAO.inserir(new Tutor(nome, tel));
            }
            else if (op == 2) tutorDAO.listar();

            else if (op == 3) {
                System.out.print("Nome do animal: ");
                String nome = sc.nextLine();
                System.out.print("Espécie: ");
                String esp = sc.nextLine();
                System.out.print("ID do Tutor: ");
                int tid = sc.nextInt(); sc.nextLine();
                animalDAO.inserir(new Animal(nome, esp, tid));
            }
            else if (op == 4) animalDAO.listar();

            else if (op == 0) break;
        }

        sc.close();
    }
}