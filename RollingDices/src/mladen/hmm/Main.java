package mladen.hmm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        rolldices(20);
        System.out.println("=============================================");
        rolldices(20,12);
    }

    public static void rolldices(int numberOfRolls) {
        Random roll = new Random();
        int rolledDice;
        int jedan =0, dva =0, tri=0, cetiri=0, pet=0, sest = 0;

        for (int i = 0; i <numberOfRolls; i++){
            rolledDice =roll.nextInt(6)+1;
            System.out.println(rolledDice);
            if(rolledDice==1)
                jedan++;
            if(rolledDice==2)
                dva++;
            if(rolledDice==3)
                tri++;
            if(rolledDice==4)
                cetiri++;
            if(rolledDice==5)
                pet++;
            if(rolledDice==6)
                sest++;

        }

        System.out.println("jedan "+jedan *100/numberOfRolls +"%");
        System.out.println("dva "+dva *100/numberOfRolls +"%");
        System.out.println("tri "+tri *100/numberOfRolls +"%");
        System.out.println(cetiri *100/numberOfRolls +"%");
        System.out.println(pet *100/numberOfRolls +"%");
        System.out.println(sest *100/numberOfRolls +"%");

    }

    public static void rolldices (int numberOfRolls, int diceSides) {
        Random roll = new Random();
        ArrayList lista = new ArrayList();
        int rolledDice;
        for (int i = 0; i < numberOfRolls; i++) {
            rolledDice = roll.nextInt(diceSides) + 1;
            lista.add(i,rolledDice);
            System.out.println(rolledDice);
        }

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        printStatistic(lista);

    }

    public static void printStatistic(ArrayList lista){
        HashMap<Integer, Integer> statisticka = new HashMap<>();

        for(int i = 0; i<lista.size();i++){

            if(statisticka.containsKey(lista.get(i))){
                statisticka.put((Integer) lista.get(i),i++);
            }
            else statisticka.put((Integer) lista.get(i),i);


        }

        System.out.println(statisticka);




    }





}
