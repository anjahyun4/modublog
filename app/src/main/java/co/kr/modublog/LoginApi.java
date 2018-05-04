package co.kr.modublog;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginApi {

    public static final String LOGIN_URL = "http://modublog.co.kr/test/android/login.php";
    public static Retrofit retrofit = null;

    public static Retrofit getLoginApi(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(LOGIN_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
