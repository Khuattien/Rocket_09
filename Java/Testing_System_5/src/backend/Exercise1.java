package backend;

import java.util.Scanner;

import entity.News;
import entity.ThiSinh;
import entity.TuyenSinh;

public class Exercise1 {
    public void question1() {
        News news = new News();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do{
            loadMenu();
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    news.insertNews();
                    break;
                case 2:
                    news.DisPlay();
                    break;
                case 3:
                    news.Calculate();
                    news.DisPlay();
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
            }

        }while(choose != 4);

    }

    public static void loadMenu(){
        System.out.println("---------------");
        System.out.println("1 - Insert news");
        System.out.println("2 - View list news");
        System.out.println("3 - Average rate");
        System.out.println("4 - Exit");
        System.out.println("---------------");
    }

    public void question2() {
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            loadMenu1();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    tuyenSinh.themTS();;
                    break;
                case 2:
                    tuyenSinh.display();;
                    break;
                case 3:
                    tuyenSinh.timTS();;
                    tuyenSinh.display();;
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;

            }
        } while (choose != 4);
        scanner.close();
    }

    public static void loadMenu1() {
        System.out.println("---------------");
        System.out.println("1-Insert TS");
        System.out.println("2-Infor TS");
        System.out.println("3-Find SBD");
        System.out.println("4-Exit");
        System.out.println("---------------");
    }


}
