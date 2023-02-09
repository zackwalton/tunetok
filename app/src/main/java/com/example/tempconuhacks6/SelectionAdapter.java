package com.example.tempconuhacks6;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.tempconuhacks6.databinding.SelectionItemsBinding;

import java.util.List;

// holds pages for the ViewPager2
public class SelectionAdapter extends RecyclerView.Adapter<SelectionAdapter.SelectionViewHolder> {
    private List<Playlist> playlists;
    public SelectionAdapter(List<Playlist> playlists){
        this.playlists = playlists;
    }

    @NonNull
    @Override
    public SelectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SelectionViewHolder(SelectionItemsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SelectionViewHolder holder, int position) {
        holder.bindItem(playlists.get(position));
    }

    @Override
    public int getItemCount() {
        if (playlists != null)
            return playlists.size();
        else
            return 0;
    }

    static class SelectionViewHolder extends RecyclerView.ViewHolder{
        SelectionItemsBinding binding;

        public SelectionViewHolder(SelectionItemsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindItem(Playlist playlist){
            binding.selectionName.setText(playlist.name);
            binding.selectionImage.setImageURI(Uri.parse("https://i.scdn.co/image/ab67616d0000b2735d3578f7bf6c948360ccf6d8"));
        }
    }
}
