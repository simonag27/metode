// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int divisionOfTwoNumbers(int numberOne, int numberTwo){
        int division = numberOne / numberTwo;
        return division;
    }
    public static int addingThreeNumbers(int numberOne,int numberTwo, int numberThree){
        // declararea metodei
        return numberOne + numberTwo + numberThree;
        // o varianta mai simpla de afisare, echivalenta cu int sum = numberOne + numberTwo; return sum

    }

     }

    public static void main(String[] args) {
        // apelarea metodei
        int division = divisionOfTwoNumbers(3, 5);
        int division2 = divisionOfTwoNumbers(6, 9);
        int division3 = divisionOfTwoNumbers(10, 72);

        int sum = addingThreeNumbers(7,80, 50);
        int sum2 = addingThreeNumbers(100, 20, 99);

        System.out.println(sum);
    }
}