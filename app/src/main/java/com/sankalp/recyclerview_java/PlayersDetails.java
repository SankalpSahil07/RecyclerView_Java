package com.sankalp.recyclerview_java;

public class PlayersDetails{
   private  String playerName;
   private  String clubName;
   private  int playersImage;

   public PlayersDetails(String textPlayerName, String textClubName, int footballPlayersImage){
       playerName = textPlayerName;
       clubName =  textClubName;
       playersImage = footballPlayersImage;
   }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getPlayersImage() {
        return playersImage;
    }

    public void setPlayersImage(int playersImage) {
        this.playersImage = playersImage;
    }
}
