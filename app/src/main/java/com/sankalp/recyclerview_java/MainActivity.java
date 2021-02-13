package com.sankalp.recyclerview_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter playerAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView_PlayersList);
        recyclerView.setHasFixedSize(true);

        ArrayList<PlayersDetails> playersDetails = new ArrayList<>();
        playersDetails.add(new PlayersDetails("Cristiano Ronaldo", "Juventus", R.drawable.ronaldo));
        playersDetails.add(new PlayersDetails("Lionel Messi", "Barcelona", R.drawable.messi));
        playersDetails.add(new PlayersDetails("Neymar Jr", "PSG", R.drawable.neymar));
        playersDetails.add(new PlayersDetails("Marcelo", "Real Madrid", R.drawable.marcelo));
        playersDetails.add(new PlayersDetails("Luca Modric", "Real Madrid", R.drawable.modric));
        playersDetails.add(new PlayersDetails("Sergio Ramos", "Real Madrid", R.drawable.ramos));
        playersDetails.add(new PlayersDetails("Wayne Rooney", "Manchester United", R.drawable.rooney));
        playersDetails.add(new PlayersDetails("Paul Pogba", "Manchester United", R.drawable.pogba));
        playersDetails.add(new PlayersDetails("Gareth Bale", "Real Madrid", R.drawable.garethbale));
        playersDetails.add(new PlayersDetails("Paulo Dybala", "Juventus", R.drawable.dybala));

        layoutManager = new LinearLayoutManager(this);
        playerAdapter = new RecyclerView_Adapter(playersDetails);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(playerAdapter);



    }

}

      /*  playerAdapter = new RecyclerView_Adapter(this,playersNameList,clubNameList,playersImage);
        recyclerView.setAdapter(playerAdapter);*/

