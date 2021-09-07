package io.github.grishaninvyacheslav.stock_stroke_alert.domain.models

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Ticker(
    @SerializedName("1. symbol")
    @Expose
    val symbol: String,

    @SerializedName("2. name")
    @Expose
    val fullName: String,

    @SerializedName("3. type")
    @Expose
    val type: String
) : Parcelable

@Parcelize
data class Quote(
    @SerializedName("1. open")
    @Expose
    val open: String,

    @SerializedName("2. high")
    @Expose
    val high: String,

    @SerializedName("3. low")
    @Expose
    val low: String,

    @SerializedName("4. close")
    @Expose
    val close: String,

    @SerializedName("5. volume")
    @Expose
    val volume: String
) : Parcelable