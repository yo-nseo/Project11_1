package kr.hs.emirim.ohyoonseo.project11_1;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.post01, R.drawable.post02, R.drawable.post03, R.drawable.post04, R.drawable.post05,
                        R.drawable.post06, R.drawable.post07, R.drawable.post08, R.drawable.post09, R.drawable.post10,
                        R.drawable.post01, R.drawable.post02, R.drawable.post03, R.drawable.post04, R.drawable.post05,
                        R.drawable.post06, R.drawable.post07, R.drawable.post08, R.drawable.post09, R.drawable.post10};

    public GridAdapter (Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5, 5, 5, 5);
        imgv.setImageResource(posterIds[i]);

        final int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context, R.layout.dialog1, null);
                ImageView imgvLarge = dialogView.findViewById(R.id.imgv_large);
                imgvLarge.setImageResource(posterIds[pos]);
                dialog.setTitle("Large Poster");
                dialog.setView(dialogView);
                dialog.setNegativeButton("close", null);
                dialog.show();
            }
        });

        return imgv;
    }
}
