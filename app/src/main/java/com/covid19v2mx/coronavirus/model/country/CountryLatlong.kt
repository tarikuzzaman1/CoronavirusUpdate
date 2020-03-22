package com.covid19v2mx.coronavirus.model.country


import com.google.gson.annotations.SerializedName
/**
 * Created by Md.Tarikuzzaman on 22-Mar-2020 6:14 PM, ROSC-II MIS Cell, LGED.
 */
data class CountryLatlong(
    @SerializedName("ref_country_codes")
    var refCountryCodes: List<RefCountryCode>?
)