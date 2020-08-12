package ng.riby.androidtest.DB;



import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Journey.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {


  private static AppDatabase INSTANCE;

    public abstract JourneyDao jouneryDao();
//    public abstract AttendanceDao attendanceDao();

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "journey-database")
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();

        }
        return INSTANCE;
    }

    }




