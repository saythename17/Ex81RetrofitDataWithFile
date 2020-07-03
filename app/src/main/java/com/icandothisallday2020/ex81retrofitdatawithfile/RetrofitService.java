package com.icandothisallday2020.ex81retrofitdatawithfile;

import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface RetrofitService {
    //@FormUrlEncoded//@Field 를 사용하려면 ---@Field  사용불가
    //└(@FormUrlEncoded  &  @Multipart --이 두개의 인코딩타입이 공존할 수 없음)
    //@Field 처럼 개별 데이터 전달 - [@PartMap] : 데이터들을 Map Collection 으로 전달
    //---> GET 방식의 @QueryMap 과 비슷함
    @Multipart//MultipartBody.Part : ['식별자','파일명',requestBody(요청객체)]

    @POST("/Retrofit/uploadData.php")
    Call<String> postDataWithFile(@PartMap Map<String,String> dataPart, @Part MultipartBody.Part filePart);


}
