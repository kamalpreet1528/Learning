public class loops{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }

        class car{
            int model;
            String brand;
            String color;
        }

        car c1 = new car();
        c1.color = "black";
        c1.model = 2015;
        c1.brand = "Toyota";

        System.out.println(c1.model);

        class calculator{
            public int add(int n1, int n2){
                return n1+n2;
            }
            public int subtract(int n1, int n2){
                return n1-n2;
            }
            public int divide(int n1, int n2){
                return n1/n2;
            }
            public int multiply(int n1, int n2){
                return n1*n2;
            }

            
        }
    }
}