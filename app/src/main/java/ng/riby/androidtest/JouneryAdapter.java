package ng.riby.androidtest;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ng.riby.androidtest.DB.Jounery;

public class JouneryAdapter extends RecyclerView.Adapter<JouneryAdapter.ViewHolder> {

    List<Jounery> jouneries;
    public JouneryAdapter(List<Jounery> jouneries){
        this.jouneries= jouneries;
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
        holder.fromLatitude.setText(String.valueOf(jouneries.get(position).getFromLatitude()));
        holder.fromLongitude.setText(String.valueOf(jouneries.get(position).getFromLongitude()));
        holder.toLatitude.setText(String.valueOf(jouneries.get(position).getToLatitude()));
        holder.toLongitude.setText(String.valueOf(jouneries.get(position).getToLongitude()));
        holder.distance.setText(String.valueOf(jouneries.get(position).getDistance()));

    }

    @Override
    public int getItemCount() {
        Log.v(JouneryAdapter.class.getSimpleName(),""+ jouneries.size());
        return jouneries.size();
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
            toLongitude= itemView.findViewById(R.id.tvDistance);

        }
    }
}
