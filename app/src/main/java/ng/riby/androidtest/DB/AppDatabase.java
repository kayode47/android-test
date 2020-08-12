package ng.riby.androidtest.DB;



import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Jounery.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {


  private static AppDatabase INSTANCE;

    public abstract JouneryDao jouneryDao();
//    public abstract AttendanceDao attendanceDao();





    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "jounery-database")
                            // allow queries on the main thread.
                            // Don't do this on a real app! See PersistenceBasicSample for an example.
                            .allowMainThreadQueries()
                            .build();



        }
        return INSTANCE;
    }



    }




