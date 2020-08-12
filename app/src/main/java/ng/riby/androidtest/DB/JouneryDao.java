package ng.riby.androidtest.DB;




import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import ng.riby.androidtest.DB.Jounery;

import java.util.List;

@Dao
public interface JouneryDao {

    @Query("SELECT * FROM journey")
    List<Jounery> getAll();


    @Query("SELECT COUNT(*) FROM journey")
    int countJounery();

    @Insert
    void insertAll(Jounery... jounery);

    @Delete
    void delete(Jounery jounery);

    @Query("SELECT id,FromLatitude, FromLongitude, ToLatitude, ToLongitude FROM journey")
    List<Jounery> getAllJounery();
}
