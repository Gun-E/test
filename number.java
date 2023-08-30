package test;

import java.util.Random;

public class number {

        public static void main(String[] args){
//                int random1= (int) (Math.random() * 6) + 1;
//                int random2= (int) (Math.random() * 6) + 1;
//
//                Dice first= new Dice(random1);
//                Dice second= new Dice(random2);
//
//                System.out.println("주사위 합 = " + DiceCalculator.addDice(first, second));
//
//                String str = "abcdefg";
//
//                int val= (int) (Math.random() * str.length());
//                System.out.println(DiceCalculator.getIndexOf(val));
//
//                int random4= (int) (Math.random() * 6) + 1;
//                Dice dice= new Dice(random4);
//                System.out.println("주사위 눈("+ random4 + ")이 홀수?? : " + DiceCalculator.odd(dice));


                try {
                        new Library(-1);
                }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                }

                Library library = new Library(5);

                library.add("해리포터");
                library.add("샬롯의 거미줄");

                try {
                        library.add("샬롯의 거미줄");
                }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                }

                library.delete("해리포터");
                library.delete("스파이더맨");

                library.find("샬롯의 거미줄");
                library.find("샬롯의 거미줄2");

                library.findall();

                library.add("JAVA 7");
                library.add("JAVA 8");
                library.add("JAVA 9");
                library.add("JAVA 10");

                try {
                        library.add("JAVA 22");
                }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                }

                library.findall();



        }

}
