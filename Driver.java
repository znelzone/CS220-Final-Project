import java.util.Scanner;

public class Driver{



    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to display some Roblox Game Data[Y/N]?");
        String begin = scanner.nextLine();

        if(begin.equalsIgnoreCase("y") || begin.equalsIgnoreCase("yes")){
            System.out.println("Starting Search!");
            
            //creates the roblox data retriever and creates a set of 10 temp games
            RobloxDataRetriever retriever = new RobloxDataRetriever();
            retriever.updateGameData();

            System.out.println("Finished Search!");
        } else if(begin.equalsIgnoreCase("n") || begin.equalsIgnoreCase("no")){
            System.out.println("See you next time!");
            
        } else {
            System.out.println("Answer was neither [Y/N] couldn't search");
        }

        
        scanner.close();
    }
}
