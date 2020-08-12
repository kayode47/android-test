package ng.riby.androidtest.DB;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import ng.riby.androidtest.DB.Journey;

import java.util.List;

@Dao
public interface JourneyDao {

    @Query("SELECT * FROM journey")
    List<Journey> getAll();


    @Query("SELECT COUNT(*) FROM journey")
    int countJounery();

    @Insert
    void insertAll(Journey... journey);

    @Delete
    void delete(Journey journey);

    @Query("SELECT id,FromLatitude, FromLongitude, ToLatitude, ToLongitude,Distance FROM journey")
    List<Journey> getAllJourney();
}
