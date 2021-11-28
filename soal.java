public class soal1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 15, n = n1 + n2, n3 = (n1 % 4) ;
        int h1 = n * n, h2 = n3 * n2 ;  
        System.out.println("         soal 1");
        System.out.println("h1 ( 10 + 15 ) * (  15 + 10 )= " + h1);
        System.out.println("h2 (10 %  4  * 15)           = " + h2);
        boolean b1 = h1 >= h2;
        boolean b2 = h2 >= h1;
        boolean b3 = h1%4 == ++h2%5;
        boolean b4 = (b1 ^ b3 ) &  (b2 | b3);
        boolean b5 = b2 | (b3 & (b2^b1) );
        System.out.println("         soal 2");
        System.out.println("b1 (h1 >= h2)                = " + b1);
        System.out.println("b2 (h2 >= h1)                = " + b2);
        System.out.println("b3 (h1%4 == ++h2%5)          = " + b3);
        System.out.println("b4 (b1 ^ b3 ) &  (b2 | b3)   = " + b4);
        System.out.println("b5 (b2 | b3 & (b2^b1) )      = " + b5);
        
    }
    
}
