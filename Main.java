public class Main{


    public static void main(String[] args) throws Exception {

        RobloxDataRetriever retriever = new RobloxDataRetriever();

        String data = retriever.getData("https://games.roblox.com/v1/games?universeIds=6035872082");

        System.out.println(data);
    }
}
