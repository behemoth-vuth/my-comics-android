package vn.behemoth.mycomics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<Post> listPost;

    public  RecyclerViewAdapter(Context context, List<Post> listPost) {
        this.context = context;
        this.listPost = listPost;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(context).inflate(R.layout.item_recyclerview, null);
        return new MyViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Post data = getItem(position);

        holder.img.setImageDrawable(ContextCompat.getDrawable(context, data.img));
        holder.tvName.setText(data.name);
        holder.tvChapter.setText(data.chapter);
        holder.tvAuthor.setText(data.author);
        holder.tvDateTime.setText(data.datetime);
    }

    public Post getItem(int position) {
        return listPost.get(position);
    }

    @Override
    public int getItemCount() {
        return listPost.size();
    }

    public static class  MyViewHolder extends RecyclerView.ViewHolder {

        AppCompatImageView img;
        TextView tvName;
        TextView tvChapter;
        TextView tvAuthor;
        TextView tvDateTime;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            tvName = itemView.findViewById(R.id.tvName);
            tvChapter = itemView.findViewById(R.id.tvChapter);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);
            tvDateTime = itemView.findViewById(R.id.tvDateTime);
        }
    }
}
