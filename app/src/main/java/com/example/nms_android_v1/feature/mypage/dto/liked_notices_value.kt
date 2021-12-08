package com.example.nms_android_v1.feature.mypage.dto

import com.google.gson.annotations.SerializedName

data class liked_notices_value(
    @SerializedName("id") val id: String,
    @SerializedName("title") val title: String,
    @SerializedName("writer") val writer: String,
    @SerializedName("department") val department: String,
    @SerializedName("created_date") val created_date: String,
    @SerializedName("image") val image: String
)