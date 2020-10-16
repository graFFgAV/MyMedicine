//package com.example.mymedicine;
//
//import android.graphics.drawable.Drawable;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.cardview.widget.CardView;
//import androidx.core.content.ContextCompat;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class ItemAdapter extends
//        RecyclerView.Adapter<ItemAdapter.ViewHolder>{
//    private String[] captions;
//    private int[] imageIds;
//
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        private CardView cardView2;
//        public ViewHolder(CardView v) {
//            super(v);
//            cardView2 = v;
//        }
//    }
//
//    public ItemAdapter(String[] captions, int[] imageIds){
//        this.captions = captions;
//        this.imageIds = imageIds;
//    }
//
//    @Override
//    public int getItemCount(){
//        return captions.length;
//    }
//
//    @Override
//    public ItemAdapter.ViewHolder onCreateViewHolder(
//            ViewGroup parent, int viewType){
//        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.card_view2, parent, false);
//        return new ItemAdapter.ViewHolder(cv);
//    }
//
//    @Override
//    public void onBindViewHolder(ItemAdapter.ViewHolder holder, final int position){
//        final CardView cardView2 = holder.cardView2;
//        ImageView imageView = (ImageView)cardView2.findViewById(R.id.ivName);
//        Drawable drawable =  ContextCompat.getDrawable(cardView2.getContext(), imageIds[position]);
//        imageView.setImageDrawable(drawable);
//        imageView.setContentDescription(captions[position]);
//        TextView textView = (TextView)cardView2.findViewById(R.id.tvName);
//        textView.setText(captions[position]);
//    }
//}

