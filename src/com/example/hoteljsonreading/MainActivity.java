package com.example.hoteljsonreading;



import java.util.ArrayList;
import java.util.List;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i("MainActivity", "onCreate");

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment  {
		private String[] listData = new String[] { "Dos and Don'ts",
				"Health and Safety", "Embassies", "Useful Contacts" };
		
		String strJson = "Nothing";
		Context context;
		TextView tv;
		ListView listViewFeaturedHotels;
		List<HotelSummary> hotelSummaryArrayList;
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			Log.i("Fragment_main", "onCreateView");

			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			/*
			tv = (TextView) rootView
					.findViewById(R.id.tv_simple);
			
			
			ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(
					getActivity(), android.R.layout.simple_list_item_1,
					android.R.id.text1, listData);
			listView = (ListView) rootView
					.findViewById(R.id.lv_simple);
					
			*/
			
			listViewFeaturedHotels = (ListView) rootView.findViewById(R.id.lv_simple);
			
			new AsyncTask_HotelList(getActivity(), new AsyncTask_HotelListListener()).execute();

			if (strJson != null)
				Log.i("Fragment_main:onCreateView", strJson);
			else
				Log.e("Fragment_main:onCreateView", "NULL STRING");

			return rootView;
		}

		@Override
		public void onAttach(Activity activity) {
			super.onAttach(activity);
			Log.i("Fragment_main", "onAttach");
		}
		
		public class AsyncTask_HotelListListener implements AsyncResponse
	    {
	 
	        @Override
	        public void async_processFinish(List<HotelSummary> result)
	        {
	        	Log.i("AsyncTask_HotelListListener", "async_processFinish");
	        	
	        	if (result != null)
	        	{
	        		Log.i("async_processFinish","Result OK!");
	        		CustomListViewAdapter_FeaturedHotels itemsAdapter = new CustomListViewAdapter_FeaturedHotels(getActivity(), result);
	        		// Assign adapter to ListView
	        		listViewFeaturedHotels.setAdapter(itemsAdapter);
	        	}
	        	else
	        		Log.i("async_processFinish","Empty Result!##@$");
	        	//tv.setText(result);	 
	        	//hotelSummaryArrayList = result;
	            //((CustomListViewAdapter_FeaturedHotels) listViewFeaturedHotels.getAdapter()).notifyDataSetChanged();
	        	
	        }
	    }

	

	}
}
