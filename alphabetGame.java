import java.util.Scanner;

public class alphabetGame{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        boolean correct = false;

        while(!correct){
            System.out.println("Press enter to start! (The clock will start right afterwards");

            sc.nextLine();

            double time = (double)System.currentTimeMillis(); 
        
            String answer = sc.nextLine();
            correct = answer.equals("abcdefghijklmnopqrstuvwxyz");
            if(correct)
                System.out.println("Time: " + ((double)System.currentTimeMillis() - time)/1000 + " seconds");
            else
                System.out.println("That doesn't seem right! Try again!");
        }
    }

}
