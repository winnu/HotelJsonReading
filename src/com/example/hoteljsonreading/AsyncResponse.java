package com.example.hoteljsonreading;

import java.util.List;

public interface AsyncResponse {
	void async_processFinish(List<HotelSummary> result);
}
