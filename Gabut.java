import java.util.Scanner;

/**
 * Gabut
 */
public class Gabut {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int Input;
        System.out.print("Berapa Umur Anda?: " );
        Input = in.nextInt();

        if (Input <= 25) { System.out.println("Masih muda cuy");
            
        } else { System.out.println("Alamak mulai jadi artefak bumi ");
            
        }
    }
}