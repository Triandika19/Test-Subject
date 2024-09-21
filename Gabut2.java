import java.util.Scanner;

public class Gabut2 {

    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
        int Input;

        System.out.print("Apakah kamu anak ILKOM? (Ketika 1 jika iya, 2 jika bukan): ");
        Input = in.nextInt();
        if (Input <= 1) { System.out.println("Kamu sangatlah keren dan mahasigma +10000000 Aura");
            
        } else { System.out.println("Kurang keren -10000 Aura");
            
        }
    }  
    }

