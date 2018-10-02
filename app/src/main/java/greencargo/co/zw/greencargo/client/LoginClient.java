package greencargo.co.zw.greencargo.client;


import greencargo.co.zw.greencargo.model.LoginResponse;
import greencargo.co.zw.greencargo.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


/**
 * Created by Madondo on 11/18/2017.
 */

public interface LoginClient {
    @POST("/")
    Call<LoginResponse> login(@Body User user,@Header("UUID") String uuid);

    @POST("/")
    Call<LoginResponse> logout(@Header("UUID") String uuid);
}
