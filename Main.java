import java.util.Scanner;

public class Main{



    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to display some Roblox Game Data[Y/N]?");
        String begin = scanner.nextLine();

        if(begin.equalsIgnoreCase("y") || begin.equalsIgnoreCase("yes")){
            System.out.println("Starting Search!");
            //will eventually call the DataRetreiver which makes api calls to search for games to release
            //their data
        } else {

        }
            RobloxDataRetriever retriever = new RobloxDataRetriever();
            String data = retriever.getData("https://games.roblox.com/v1/games?universeIds=6035872082");


        System.out.println(data);

        System.out.println("Finished Search!");
        scanner.close();
    }
}
