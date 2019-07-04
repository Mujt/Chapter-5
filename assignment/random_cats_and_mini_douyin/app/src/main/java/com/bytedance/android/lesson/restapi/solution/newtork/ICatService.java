package com.bytedance.android.lesson.restapi.solution.newtork;


import android.media.Image;

import com.bytedance.android.lesson.restapi.solution.bean.Cat;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author Xavier.S
 * @date 2019.01.15 16:42
 */
public interface ICatService {
    @GET("/v1/images/search?limit=5")
    Call<List<Cat>> getCall();
    // TODO-C1 (2) Implement your Cat Request here, url: https://api.thecatapi.com/v1/images/search?limit=5
}
