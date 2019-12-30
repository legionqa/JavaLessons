package lesson2;

public class Lesson2Main {

    public static void main(String[] args) {

        Lesson2Main lesson2 = new Lesson2Main();
        lesson2.printText("Go Java", 555);
        lesson2.summaryOfNumbers(5, 6);
        lesson2.countForLoop(10, "Try number: ");
        lesson2.countWhileLoop(5, "try");
        lesson2.loopInsideTheLoop();
    }


    public void printText(String text, int number) {

        System.out.println(text + " " + number);
    }


    public void summaryOfNumbers(int numberA, int numberB) {

        if (numberA == 0 || numberB == 0) {
            System.out.println("Error: one of the numbers is 0");

        } else if (numberA < 10 && numberB < 10) {

            int result = numberA + numberB;
            System.out.println("Result is:" + result);
        } else {
            System.out.println("Error: the number is too big");
        }

    }

    public void countForLoop(int num, String txt) {

        for (int i = 1; i <= num; i++) {

            if (i == 2) {
                continue;
            }

            if (i > 5) {
                break;
            }
            System.out.println(txt + " " + i);

        }

    }

    public void countWhileLoop(int num, String txt) {
        int i = 0;
        while (i <= num) {
            i++;
            if (i == 2) {
                continue;
            }

            if (i > 5) {
                break;
            }
            System.out.println(txt + " " + i);
            //i=i+1;
        }

    }


    public void loopInsideTheLoop() {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
