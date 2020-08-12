package ng.riby.androidtest;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ng.riby.androidtest.DB.Journey;

public class JourneyAdapter extends RecyclerView.Adapter<JourneyAdapter.ViewHolder> {

    List<Journey> journeys;
    public JourneyAdapter(List<Journey> journeys){
        this.journeys= journeys;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_jounery_recycler,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
//        set adapter view
        holder.fromLatitude.setText(String.valueOf(journeys.get(position).getFromLatitude()));
        holder.fromLongitude.setText(String.valueOf(journeys.get(position).getFromLongitude()));
        holder.toLatitude.setText(String.valueOf(journeys.get(position).getToLatitude()));
        holder.toLongitude.setText(String.valueOf(journeys.get(position).getToLongitude()));
        holder.distance.setText(journeys.get(position).getDistance());

    }

    @Override
    public int getItemCount() {
        Log.v(JourneyAdapter.class.getSimpleName(),""+ journeys.size());
        return journeys.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public AppCompatTextView fromLatitude;
        public AppCompatTextView fromLongitude;
        public AppCompatTextView toLatitude;
        public AppCompatTextView toLongitude;
        public AppCompatTextView distance;


        public ViewHolder(View view) {
            super(view);
            fromLatitude= itemView.findViewById(R.id.tvfromLatitude);
            fromLongitude= itemView.findViewById(R.id.tvfromLongitude);
            toLatitude= itemView.findViewById(R.id.tvtoLatitude);
            toLongitude= itemView.findViewById(R.id.tvtoLongitude);
            distance= itemView.findViewById(R.id.tvDistance);

        }
    }
}
