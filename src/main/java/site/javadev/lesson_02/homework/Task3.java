package site.javadev.lesson_02.homework;
/*Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
 насколько быстрее голодный Вася съедает один банан?
Вывести на косоль*/
public class Task3 {
    public static void main(String[] args) {

        int hungryVasya = 9 / 3;  // голодный Вася
        int wellFedVasya = 15 / 3; // сытый Вася
        int resoult = wellFedVasya - hungryVasya;

        System.out.println(resoult);



    }
}
