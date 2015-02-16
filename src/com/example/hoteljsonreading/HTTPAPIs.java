package com.example.hoteljsonreading;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

public class HTTPAPIs {
	private String url;

	public HTTPAPIs(String url) {
		this.url = url;
	}

	public String HTTPget () {
		InputStream is = null;
		String resultStr="Error";
		
		try {
			HttpClient httpclient = new DefaultHttpClient();
			HttpGet request = new HttpGet(url);
			HttpResponse response = httpclient.execute(request);
			HttpEntity entity = response.getEntity();
			is = entity.getContent();

		} catch (Exception e) {
			Log.e("log_tag", "Error in http connection " + e.toString());
		}

		// Convert response to string
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					is, "iso-8859-1"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			resultStr = sb.toString();
			

		} catch (Exception e) {
			Log.e("log_tag", "Error converting result " + e.toString());
		}
		return resultStr;
	}
}