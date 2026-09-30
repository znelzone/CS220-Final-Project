import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Would you like to display some Roblox Game Data[Y/N]?");
        String begin = scanner.nextLine();
        
        if(begin.equalsIgnoreCase("y") || begin.equalsIgnoreCase("yes")){
            System.out.println("Starting Search!");
                //will eventually call the DataRetreiver which makes api calls to search for games to release
                //their data
        } else {

        }


        


        System.out.println("Finished Search!");
        scanner.close();
    }
}
