package com.example.tempconuhacks6;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.tempconuhacks6.databinding.PlaylistItemsBinding;

import java.util.List;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder> {

    private List<Song> songs;
    public PlaylistAdapter(List<Song> songs) {
        this.songs = songs;
    }

    @NonNull
    @Override
    public PlaylistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlaylistViewHolder(PlaylistItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistViewHolder holder, int position) {
        holder.bindItem(songs.get(position));
    }

    @Override
    public int getItemCount() {
        if(songs != null)
            return songs.size();
        else
            return 0;
    }

    static class PlaylistViewHolder extends RecyclerView.ViewHolder{
        PlaylistItemsBinding binding;

        public PlaylistViewHolder(PlaylistItemsBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindItem(Song song){
            binding.artistText.setText(song.artist);
            binding.albumText.setText(song.album);
            binding.coverImageView.setImageResource(song.imgURL);
        }
    }
}
