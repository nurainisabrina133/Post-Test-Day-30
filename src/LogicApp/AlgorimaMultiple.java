package LogicApp;

public class AlgorimaMultiple {
    public void multipleApp() {
        System.out.println(">> Output Multiple App");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("BIZZBUZZ ");
                continue;
            }else if (i % 5 == 0) {
                System.out.print("BUZZ ");
                continue;
            } else if (i % 3 == 0) {
                System.out.print("BIZZ ");
                continue;
            }
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
