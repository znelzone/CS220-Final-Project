import java.util.ArrayList;

public class RobloxDataRetriever{
//will mainly be the class where we utilize the
//roblox api to recieve data about our games
//more than likely this will be the class that
//will be creating RobloxGame objects
    
        

        ArrayList<RobloxGame> games = new ArrayList<RobloxGame>();

        

    public RobloxDataRetriever() {

        //for now temporarily I've made ten RobloxGames all in an arrayList
        //we're going to want to automate this away from have 10 somewhat hard coded
        //instances of RobloxGame
        RobloxGame rivals = new RobloxGame(null, 6035872082L, 0, null, 0, 0, 0, 0);
        RobloxGame sniperArena = new RobloxGame(null, 9534705677L, 0, null, 0, 0, 0, 0);
        RobloxGame drivingEmpire = new RobloxGame(null, 1202096104L, 0, null, 0, 0, 0, 0);
        RobloxGame doors = new RobloxGame(null, 2440500124L, 0, null, 0, 0, 0, 0);
        RobloxGame howToTrainYourDragon = new RobloxGame(null, 7450497506L, 0, null, 0, 0, 0, 0);
        RobloxGame superGolf = new RobloxGame(null, 1424449565L, 0, null, 0, 0, 0, 0);
        RobloxGame workAtAPizzaPlace = new RobloxGame(null, 47545L, 0, null, 0, 0, 0, 0);
        RobloxGame ronopoly = new RobloxGame(null, 2621511041L, 0, null, 0, 0, 0, 0);
        RobloxGame isle = new RobloxGame(null, 1116949753L, 0, null, 0, 0, 0, 0);
        RobloxGame buildABoatForTreasure = new RobloxGame(null, 210851291L, 0, null, 0, 0, 0, 0);
        
        games.add(rivals);
        games.add(sniperArena);
        games.add(drivingEmpire);
        games.add(doors);
        games.add(howToTrainYourDragon);
        games.add(superGolf);
        games.add(workAtAPizzaPlace);
        games.add(ronopoly);
        games.add(isle);
        games.add(buildABoatForTreasure);


    }
    
    //will have to create a for loop similar to this
    // for (RobloxGame currentGame : games){
    //      in some way
    // }

}