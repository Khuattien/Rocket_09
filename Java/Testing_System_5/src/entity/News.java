package entity;

import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title, pushlishDate, author, content;
    private float averageRate;
    private int[] rates;

    public int[] getRates() {
        return rates;
    }

    public void setRates(int[] rates) {
        this.rates = rates;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPushlishDate() {
        return pushlishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPushlishDate(String pushlishDate) {
        this.pushlishDate = pushlishDate;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void DisPlay() {
        System.out.println("Title: "+title);
        System.out.println("PushlistDate: "+pushlishDate);
        System.out.println("Author: "+author);
        System.out.println("Content: "+content);
        System.out.println("AverageRate: "+averageRate);
    }

    @Override
    public float Calculate() {
        float temp=  (float)(rates[1]+rates[2]+rates[3])/3;
        this.averageRate = temp;
        return temp;
    }

    public void insertNews() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap title: ");
        this.title=scanner.nextLine();

        System.out.println("Nhap Pushlist Date: ");
        this.pushlishDate= (scanner.nextLine());

        System.out.println("Nhap author: ");
        this.author=scanner.nextLine();

        System.out.println("Nhap content: ");
        this.content=scanner.nextLine();

        System.out.println("Nhap 3 danh gia: ");
        int [] rate_temp = new int[3];
        for(int i=0; i<3; i++)
        {
            System.out.println("Nhap diem danh gia "+(i+1)+": ");
            rate_temp[i] = scanner.nextInt();
        }
        this.rates= rate_temp;
        scanner.close();
    }
}
