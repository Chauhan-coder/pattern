public class looppattern27 {
  
    public static void main(String[] args) {
        // _ _ _ _ 1
        // _ _ _ 1 2
        // _ _ 1 2 3
        // _ 1 2 3 4
        // 1 2 3 4 5

        for (int i = 1; i <= 5; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }

    }

}
