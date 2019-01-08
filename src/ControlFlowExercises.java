import java.sql.SQLOutput;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i < 15) {
//            System.out.println(i);
//            i++;
//        }

//        long x = 2;
//        do {
//            System.out.println(i);
//            x = x * x;
//        }while (x < 1000000);

        long x = 2;
        for (int i = 5; i < 15; i++) {
            System.out.println(i);
            if (x < 1000000) {
                System.out.println(x);
                x = x * x;
            }
        }
    }
}


