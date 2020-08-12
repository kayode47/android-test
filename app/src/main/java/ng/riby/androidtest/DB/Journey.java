package ng.riby.androidtest.DB;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "journey")
public class Journey {

    @ColumnInfo(name = "Id")
   @PrimaryKey(autoGenerate = true)
   private int id;

    @ColumnInfo(name = "FromLatitude")
    private Double fromLatitude;

    @ColumnInfo(name = "FromLongitude")
    private Double fromLongitude;

    @ColumnInfo(name = "ToLatitude")
    private Double toLatitude;

    @ColumnInfo(name = "ToLongitude")
    private Double toLongitude;

    @ColumnInfo(name = "Distance")
    private String distance;

    public Journey(int id, Double fromLatitude, Double fromLongitude, Double toLatitude, Double toLongitude, String distance) {
        this.id = id;
        this.fromLatitude = fromLatitude;
        this.fromLongitude = fromLongitude;
        this.toLatitude = toLatitude;
        this.toLongitude = toLongitude;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getFromLatitude() {
        return fromLatitude;
    }

    public void setFromLatitude(Double fromLatitude) {
        this.fromLatitude = fromLatitude;
    }

    public Double getFromLongitude() {
        return fromLongitude;
    }

    public void setFromLongitude(Double fromLongitude) {
        this.fromLongitude = fromLongitude;
    }

    public Double getToLatitude() {
        return toLatitude;
    }

    public void setToLatitude(Double toLatitude) {
        this.toLatitude = toLatitude;
    }

    public Double getToLongitude() {
        return toLongitude;
    }

    public void setToLongitude(Double toLongitude) {
        this.toLongitude = toLongitude;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}


