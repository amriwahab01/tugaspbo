package membut.kalkultor;
import java.util.Scanner;
public class MembutKalkultor {

    public static void main(String[] args) {
        
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        inputUser = new Scanner(System.in);
        
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("input user ="+a+""+operator+""+b);
        
        if (operator == '+'){
            hasil = a+b;
            System.out.println("hasil +" + hasil);
        }else if (operator == '-'){  
            hasil = a-b;
            System.out.println("hasil =" + hasil);
        }else if (operator == '*'){
            hasil = a*b;
            System.out.println("hasil =" + hasil);
        }else if (operator == '/'){
            if (b == 0){
                System.out.println("pembangian nol menghasilkan tak hinngga");
            }else{
            hasil = a/b;
            System.out.println("hasil =" + hasil);
            }

        }else{
            System.out.println("operator tidak di temukan");
                    }
        }
        
    }
    

