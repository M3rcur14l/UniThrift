package com.nullpointer.unithrift;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by antonello on 07/11/15.
 */
public class MovementsArrayAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private String type;
    private ArrayList<Product> productArrayList;

    public MovementsArrayAdapter(Context context, String type, ArrayList<Product> productArrayList) {
        super();
        this.type = type;
        this.productArrayList = productArrayList;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return productArrayList.size();
    }

    @Override
    public Product getItem(int position) {
        return productArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.movements_row, parent, false);
        Product product = getItem(position);

        TextView description = (TextView) convertView.findViewById(R.id.movements_row_description);
        TextView direction = (TextView) convertView.findViewById(R.id.movements_row_direction);
        TextView name = (TextView) convertView.findViewById(R.id.movements_row_name);
        TextView date = (TextView) convertView.findViewById(R.id.movements_row_date);
        TextView amount = (TextView) convertView.findViewById(R.id.movements_row_amount);

        //description.setText(product.getDescription());
        if (type.equals("IN")) {
            direction.setText("FROM:");
            name.setText(product.getBuyerId());
        } else {
            direction.setText("TO:");
            name.setText(product.getSellerId());
        }
        date.setText(product.getDate());
        amount.setText(product.getPrice());
        return convertView;
    }
}
