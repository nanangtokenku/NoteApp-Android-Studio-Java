package id.nalaronline.mynotesapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private  static final String BASE_URL = "http://192.168.1.8:8081/note_android/";
    private static Retrofit retrofit;

    public static Retrofit getApiClient (){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
