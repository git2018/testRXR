package cn.wswin.testrxr;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Api {

    //获取serverID
    @Headers("Authorization:Basic Z3poOkEwQTQ3NUNGNDU0Q0Y5QTA2OTc5MDM0MDk4MTY3QjlF")
    @FormUrlEncoded
    @POST("/v2/api/login")
    Observable<ResponseBody> login(@Field("username") String username, @Field("password") String password, @Field("server_id") String server_id);


    //获取serverID
    @GET("/v2/api/branchs/getServers")
    Observable<ResponseBody> getServerID();

    //获取我的部门
    @GET("/v2/api/getMybranch/{serverID}/{branchID}")
    Observable<ResponseBody> getMybranch(@Path("serverID") String serverID, @Path("branchID") String branchID);

    //获取部门
    @GET("/v2/api/branchs/{serverID}/{pid}")
    Observable<ResponseBody> getBranch(@Path("serverID") String serverID, @Path("pid") String pid);

    //获取部门用户
    @GET("/v2/api/user/{serverID}/{branchID}")
    Observable<ResponseBody> getUser(@Path("serverID") String serverID, @Path("branchID") String branchID);

    //********************** 测试数据 ************************************
    @GET("/v2/api/branchs/getServers")
    Observable<ResponseBody> testObservable();

    @GET("/v2/api/branchs/getServers")
    Call<ResponseBody> testCall();

}
