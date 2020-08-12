package ng.riby.androidtest;

import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import ng.riby.androidtest.DB.AppDatabase;

import ng.riby.androidtest.DB.Journey;


import java.util.List;

public class JourneyList extends AppCompatActivity {
    private static final String TAG ="JouneryList";

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_jounery_list);
        recyclerView = findViewById(R.id.recyclerViewUsers);

        //get List from Database
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class, "journey-database").allowMainThreadQueries().build();

        List<Journey> journeys = db.jouneryDao().getAllJourney();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new JourneyAdapter(journeys);
        recyclerView.setAdapter(adapter);

    }
}
