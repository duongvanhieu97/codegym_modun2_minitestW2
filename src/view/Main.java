package view;

import controller.MaterialManager;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Material> materialList = MaterialManager.materialList;

    public static void main(String[] args) {
        MaterialManager list = new MaterialManager();

        CrispyFlour botMi = new CrispyFlour("1", "Bột Mì", LocalDate.of(2022, 7, 8), 9000, 5);
        CrispyFlour botNgo = new CrispyFlour("2", "Bột Ngô", LocalDate.of(2022, 8, 15), 9000, 3);
        CrispyFlour botSan = new CrispyFlour("3", "Bột Sắn", LocalDate.of(2022, 8, 14), 9000, 2);
        CrispyFlour botGao = new CrispyFlour("4", "Bột Gạo", LocalDate.of(2022, 8, 12), 9000, 8);
        CrispyFlour botNep = new CrispyFlour("5", "Bột Nếp", LocalDate.of(2022, 8, 18), 9000, 3);
        Meat thitLon = new Meat("6", "Thịt Lợn", LocalDate.of(2022, 8, 16), 12000, 10);
        Meat thitGa = new Meat("7", "Thịt Gà", LocalDate.of(2022, 8, 16), 12000, 4);
        Meat thitCa = new Meat("8", "Thịt Cá", LocalDate.of(2022, 8, 16), 12000, 6);
        Meat thitBo = new Meat("9", "Thịt Bò", LocalDate.of(2022, 8, 16), 12000, 3);
        Meat thitVit = new Meat("10", "Thịt Vịt", LocalDate.of(2022, 8, 16), 12000, 7);
        list.addNewMaterial(botMi);
        list.addNewMaterial(botNgo);
        list.addNewMaterial(botSan);
        list.addNewMaterial(botGao);
        list.addNewMaterial(botNep);
        list.addNewMaterial(thitLon);
        list.addNewMaterial(thitGa);
        list.addNewMaterial(thitCa);
        list.addNewMaterial(thitBo);
        list.addNewMaterial(thitVit);
        Material meat = getMeat();
        Material crispy = getCrispyFlour();
        list.addNewMaterial(meat);
        list.addNewMaterial(crispy);
        list.showNewMaterial();
        list.deleteMaterial(thitLon);
        list.showNewMaterial();
    }

    public static Material getMeat() {
        System.out.println("Enter material: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter Month: ");
        int month = scanner.nextInt();
        System.out.println("Enter Day: ");
        int day = scanner.nextInt();
        System.out.println("Enter Cost: ");
        int cost = scanner.nextInt();
        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        Material meat = new Meat(id, name, LocalDate.of(year, month, day), cost, weight);
        return meat;
    }

    public static Material getCrispyFlour() {
        System.out.println("Enter Crispy: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter Month: ");
        int month = scanner.nextInt();
        System.out.println("Enter Day: ");
        int day = scanner.nextInt();
        LocalDate manufacturingDate = LocalDate.of(year, month, day);
        System.out.println("Enter Cost: ");
        int cost = scanner.nextInt();
        System.out.println("Enter Quantity: ");
        int quantity = scanner.nextInt();
        Material meat = new Meat(id, name, manufacturingDate, cost, quantity);
        return meat;
    }

}

