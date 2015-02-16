package com.example.hoteljsonreading;

import java.util.List;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListViewAdapter_FeaturedHotels extends ArrayAdapter<HotelSummary> {

	private Context context;
	private List<HotelSummary> data;
	LayoutInflater inflater;
	private HotelSummary resultObjectItem;

	public CustomListViewAdapter_FeaturedHotels(Context context,
			List<HotelSummary> arraylist) {
		super(context, 0, arraylist);    
		
		this.context = context;
		data = arraylist;
		Log.e("CustomListViewAdapter_FeaturedHotels", "Create");
	}
	
	@Override
	public int getCount() {
		Log.e("CustomListViewAdapter_FeaturedHotels", String.valueOf(data.size()));
		return data.size();
	}
	
	

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolderItem viewHolder;

		if (convertView == null) {

			// inflate the layout
			inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			convertView = inflater.inflate(R.layout.listview_hotelsummary,
					parent, false);
			// set up the ViewHolder
			viewHolder = new ViewHolderItem();
			viewHolder.textViewHotelName = (TextView) convertView
					.findViewById(R.id.tv_hotel_name);
			
			//viewHolder.textViewAddress1 = (TextView) convertView.findViewById(R.id.tv_hotel_adderss);

			// store the holder with the view.
			convertView.setTag(viewHolder);

		} else {
			// we've just avoided calling findViewById() on resource everytime
			// just use the viewHolder
			viewHolder = (ViewHolderItem) convertView.getTag();
		}

		// object item based on the position
		resultObjectItem = data.get(position);
		Log.e("ViewHolder", String.valueOf(position));
		// assign values if the object is not null
		if (resultObjectItem != null) {
			// get the TextView from the ViewHolder and then set the text (hotel
			// name)
			viewHolder.textViewHotelName.setText(resultObjectItem.getName());
			Log.e("ViewHolder",resultObjectItem.getName());
			
		}

		return convertView;
	}

	static class ViewHolderItem {
		TextView textViewHotelName;
		//TextView textViewAddress1;
       
	}
}
