package com.covid19v2mx.coronavirus.model.country


import com.google.gson.annotations.SerializedName
/**
 * Created by Md.Tarikuzzaman on 22-Mar-2020 6:14 PM, ROSC-II MIS Cell, LGED.
 */
data class RefCountryCode(
    @SerializedName("alpha2")
    var alpha2: String?,
    @SerializedName("alpha3")
    var alpha3: String?,
    @SerializedName("country")
    var country: String?,
    @SerializedName("latitude")
    var latitude: Double?,
    @SerializedName("longitude")
    var longitude: Double?,
    @SerializedName("numeric")
    var numeric: Int?
)