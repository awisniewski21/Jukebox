package edu.illinois.cs465.jukebox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    ArrayList<EntryItem> data_entry_list;

    public RecyclerViewAdapter(Context mContext, ArrayList<EntryItem> entryList) {
        this.mContext = mContext;
        this.data_entry_list = entryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_song, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(R.drawable.clay_davis); // TODO: Use list images
        holder.song.setText(data_entry_list.get(position).name);
        holder.artist.setText(data_entry_list.get(position).artist);
        //holder.button.(data_buttons.get(position));
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int _pos = holder.getAdapterPosition();

                data_entry_list.remove(_pos);
                notifyItemRemoved(_pos);
                notifyItemRangeChanged(_pos, data_entry_list.size());
            }
        });
    }

    @Override
    public int getItemCount() {
        return data_entry_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView song;
        TextView artist;
        Button button;
        FrameLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.fragment_song_cover);
            song = itemView.findViewById(R.id.fragment_song_name);
            artist = itemView.findViewById(R.id.fragment_song_artist);
            button = itemView.findViewById(R.id.fragment_song_button);
            parentLayout = itemView.findViewById(R.id.fragment_song_parent_layout);
        }
    }
}
