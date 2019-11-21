package com.example.jchen415.mywaytormobileapplication.Fragments;

import com.example.jchen415.mywaytormobileapplication.Notifications.MyResponse;
import com.example.jchen415.mywaytormobileapplication.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAALuM0Z6k:APA91bEY9pWL6XmArjB7xeKFgmcpJht1BA71UoE0WWG1vaVIPAa30sQ8VOLvwSSC0psgySoPD3i7i643yILWOwZQRLkyrH4H3km_2zjUXnDfsLE6ozLEVoc0caP328L3cSs5uuSj6j7W"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
