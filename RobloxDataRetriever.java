import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RobloxDataRetriever{

//will mainly be the class where we utilize the
//roblox api to recieve data about our games
//more than likely this will be the class that
//will be creating RobloxGame objects
    private RobloxGameCollection ourCollection;
    private HttpClient client;
    private String VOTES_URL = "https://games.roblox.com/v1/games/votes";

    public RobloxDataRetriever() {
    client = HttpClient.newHttpClient();
    ourCollection = new RobloxGameCollection();

    //to be removed later, once we automate the creation of games
    initializeGamesTemp();
    }



    /**
     * A temporary method designed to create ten games for the Roblox API
     * to gather other Roblox games using recomended data from the respective
     * ten games.
     */
    public void initializeGamesTemp(){
        //rivals
        RobloxGame rivals = new RobloxGame(null, 6035872082L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(rivals);
        //sniperArena
        RobloxGame sniperArena = new RobloxGame(null, 9534705677L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(sniperArena);
        //driving Empire
        RobloxGame drivingEmpire = new RobloxGame(null, 1202096104L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(drivingEmpire);
        //doors
        RobloxGame doors = new RobloxGame(null, 2440500124L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(doors);
        //howtotrainyourdragon
        RobloxGame howToTrainYourDragon = new RobloxGame(null, 7450497506L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(howToTrainYourDragon);
        //superGolf
        RobloxGame superGolf = new RobloxGame(null, 1424449565L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(superGolf);
        //workAtPizzaPlace
        RobloxGame workAtPizzaPlace = new RobloxGame(null, 47545L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(workAtPizzaPlace);
        //ronopoly
        RobloxGame ronopoly = new RobloxGame(null, 2621511041L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(ronopoly);
        //isle
        RobloxGame isle = new RobloxGame(null, 1116949753L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(isle);
        //buildABoatForTreasure
        RobloxGame buildABoatForTreasure = new RobloxGame(null, 210851291L, 0, null, 0, 0, 0, 0);
        ourCollection.addGame(buildABoatForTreasure);
    }


    public String getData(String url) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        return response.body();
    }

    /**
     * Creates a String representing a URL API request that concatinates
     * a universeID into the URL.
     * 
     * @return String containing a URL concatination
     */
    public String buildMainRequestURL(long universeID){
        return "https://games.roblox.com/v1/games?universeIds=" +
        universeID +
        "&fields=name%2C%20playing%2C%20visits%2C%20genre%2C%20favoritedCount";
    }



    public void updateGameData() throws Exception{
        for(RobloxGame robloxGame : ourCollection){
            long universeID = robloxGame.getUniverseID();
            String url = buildMainRequestURL(universeID);
            String json = getData(url);


            System.out.println("Universe ID: " + universeID);
            System.out.println(json + "\n");
        }

    }


}