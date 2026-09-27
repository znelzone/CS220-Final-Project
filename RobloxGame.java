private class robloxGame{

    //RobloxGame attributes

    private String gameName;
    private long gameID;
    private int currentPlayerCount;
    private String genre;
    private long visits;
    private int favorites;
    private int likes;

    //we might want to do more work on this one
    //the setter might just compare current player counts
    //with the historical player count and change it based on
    //if the newest player count is the higher of the two values.
    private int maxPlayerCount;

    public robloxGame(String gameName, long gameID, int currentPlayerCount, String genre, long visits, int favorites,
        int likes, int maxPlayerCount){
        this.gameName = gameName;
        this.gameID = gameID;
        this.currentPlayerCount = currentPlayerCount;
        this.genre = genre;
        this.visits = visits;
        this.favorites = favorites;
        this.likes = likes;
        this.maxPlayerCount = maxPlayerCount;

    }

    //getters for robloxGame
    
    public String getGameName(){
        return gameName;
    }

    public long getGameID(){
        return gameID;
    }

    public int getCurrentPlayerCount(){
        return currentPlayerCount;
    }

    public String getGenre(){
        return genre;
    }

    public long getVisits(){
        return visits;
    }
    
    public int getFavorites(){
        return favorites;
    }

    public int getLikes(){
        return likes;
    }

    public int getMaxPlayerCount(){
        return maxPlayerCount;
    }

    
    //setters for RobloxGame

    //sets current player count when called
    public void setCurrentPlayerCount(int currentPlayerCount){
        this.currentPlayerCount = currentPlayerCount;
    }

    //set's favorites count when called
    public void setFavorites(long favorites){
        this.favorites = favorites;
    }
    
    //set's name of game. might rethink this one since we don't
    //really want the name of the games changing ever once
    //they're created
    public void setGameName(String gameName){
        this.gameName = gameName;
    }

    //sets game ID same thing for gameName probably want to 
    //rethink the possibility to chang this with a callable
    //methode since we don't want the game's id nums changing

    public void setGameID(long gameID){
        this.gameID = gameID;
    }

    //I'm thinking the same thing for this one as well,
    //we probably don't want to change the genre of a game
    //once it's instantiated
    public void setGenre(String genre){
        this.genre = genre;
    }

    //sets like count of a RobloxGame when ran
    public void setLikes(long likes){
        this.likes = likes;
    }

    public void setMaxPlayerCount(long maxPlayerCount){
        if(currentPlayerCount > maxPlayerCount){
            maxPlayerCount = currentPlayerCount;
        } 
        //!!!we might want to look at this again!!! I'm not
        //perfectly certain if we can just have a setter not return
        //anything
    }

    //sets visit count. this one is most likely fine since
    //whenever we run the program we'll most likely need to
    //reset visit counts for our Roblox games as visit count's
    //will likely have changed.
    public void setVisits(long visits){
        this.visits = visits;
    }


}
