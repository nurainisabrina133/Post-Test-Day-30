package LogicApp;

public class LoopingTriangle {
    public void loopingApp(){
        System.out.println(">> Output Looping Triangle");
        for (int i = 0; i <5 ; i++) {
            for (int j = 1+i; j <= 9-i; j++) {
                if (j % 2 == 0){
                    System.out.print("_");
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


