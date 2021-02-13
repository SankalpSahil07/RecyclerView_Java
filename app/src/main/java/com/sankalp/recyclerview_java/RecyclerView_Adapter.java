package com.sankalp.recyclerview_java;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.PlayersViewHolder> {
    private ArrayList<PlayersDetails> playerDetails;
    Context context;
    String[] playerNameList;
    String[] clubNameList;
    int[] playersImages;

    public RecyclerView_Adapter(ArrayList<PlayersDetails> playerList){
        playerDetails = playerList;
    }


    @NonNull
    @Override
    public RecyclerView_Adapter.PlayersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_single_row_players,parent,false);
        PlayersViewHolder viewHolder = new PlayersViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlayersViewHolder holder, int position) {

        PlayersDetails pDetails =  playerDetails.get(position);

        holder.playerName.setText(pDetails.getPlayerName());
        holder.playerClub.setText(pDetails.getClubName());
        holder.playerImage.setImageResource(pDetails.getPlayersImage());
    }

    @Override
    public int getItemCount() {
        return playerDetails.size();

    }
    public class PlayersViewHolder extends RecyclerView.ViewHolder{
       TextView playerName;
       TextView playerClub;
       ImageView playerImage;
            public PlayersViewHolder(@NonNull View itemView) {
                super(itemView);
                playerImage = itemView.findViewById(R.id.imageView);
                playerName = itemView.findViewById(R.id.textView_Player);
                playerClub = itemView.findViewById(R.id.textView_Club);
            }
        }

      public RecyclerView_Adapter(Context context, String[]playerNameList, String[]clubNameList,int[]playersImages){
        this.context = context;
        this.playerNameList = playerNameList;
        this.clubNameList = clubNameList;
        this.playersImages = playersImages;
      }

}


