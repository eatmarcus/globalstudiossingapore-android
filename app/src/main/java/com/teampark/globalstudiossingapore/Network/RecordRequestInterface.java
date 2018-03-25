package com.teampark.globalstudiossingapore.Network;

/**
 * Created by Mong on 19/3/18.
 */

import com.teampark.globalstudiossingapore.Entity.BeaconRecord;
import com.teampark.globalstudiossingapore.Entity.Records;

import java.util.ArrayList;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RecordRequestInterface {

    @FormUrlEncoded
    @POST("records/add-records")
    Observable<Records> addRecords(@FieldMap Map<String, String> fieldsMap);

    @POST("records/get-all-records")
    Observable<ArrayList<BeaconRecord>> getAllRecords();
}
