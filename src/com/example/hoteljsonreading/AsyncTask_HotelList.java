package com.example.hoteljsonreading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.example.hoteljsonreading.JsonUtils;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AsyncTask_HotelList extends AsyncTask<String, String, List<HotelSummary>> {
	 private Activity activity;
	//private Context context;
    private AsyncResponse listener;
    //private static final String myFeatureHotelListQuery = "http://m.uploadedit.com/ba3a/1424003003236.txt";
    //private static final String myFeatureHotelListQuery = "http://m.uploadedit.com/ba3a/142396894382.txt";
    private static final String myFeatureHotelListQuery = 
	"http://dev.api.ean.com/ean-services/rs/hotel/v3/list?cid=55505&apiKey=55pxbry2by2cue9fhwzxqx7x&minorRev=28&locale=en_US&currencyCode=USD&city=Yangon&countryCode=MM&_type=json";
    
    public AsyncTask_HotelList(Activity act, AsyncResponse listener)
    {
        this.activity = act;
        this.listener = listener;
    }
    
    
	


	@Override
	protected List<HotelSummary> doInBackground(String... arg0) {
		HTTPAPIs http = new HTTPAPIs(myFeatureHotelListQuery);
		String strJson = http.HTTPget();
		JSONObject jsonobject;
		//JSONArray jsonarray;
		List<HotelSummary> hsummaryList = null;
		
		try {

			//ObjectMapper mapper = new ObjectMapper();
			int jlen = 0;
			
			JSONObject firstObj = null;
			JSONObject response=new JSONObject(strJson);
			JSONObject Data= response.getJSONObject("HotelListResponse");
			String customerId = Data.getString("customerSessionId");
			
			JSONObject hlst = Data.getJSONObject("HotelList");			
			JSONArray hotelListjA = hlst.getJSONArray("HotelSummary");
			
			
			if (hotelListjA != null)
				jlen = hotelListjA.length();
			
			for (int i = 0; i < jlen; i++) {
				jsonobject = hotelListjA.getJSONObject(i);
				Log.i("JSON : strValue", jsonobject.getString("address1"));
				
		      }
			 //Json array to Java collection
			 ObjectMapper mapper = new ObjectMapper();
			 
		
			String jsonArrayStr = hotelListjA.toString();				 
			hsummaryList = mapper.readValue(jsonArrayStr, new TypeReference<List<HotelSummary>>(){ });
			 
			if (hsummaryList != null)
				Log.i("JSON : hsummaryList", "hsummaryList is ok");
			else
				Log.i("JSON : hsummaryList", "Empty/null list");
			 
			Log.i("JSON : strValue", String.valueOf(jlen));

			
		} catch (JSONException e) {
			Log.e("log_tag", "Error parsing data " + e.toString());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.i("Fragment_main", "doInBackground");

		return (List<HotelSummary>) hsummaryList;
	}


	protected void onPostExecute(List<HotelSummary> hList) {
		 listener.async_processFinish(hList);
		 	
		if (hList != null)
			Log.i("onPostExecute", "not null");
		
		else
			Log.i("onPostExecute", "null");
		
		activity.runOnUiThread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			} 
			
		}); //runnable
	}

}
