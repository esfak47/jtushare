package com.github.esfak47.utils.tushare.model.billboard

import com.google.gson.annotations.SerializedName

/**
 * @author Tony
 * Created by tony on 2018/1/17.
 */
data class BillBoardDataItem(
        @SerializedName("NO") val no: String, //1
        @SerializedName("COMPAREA") val compArea: String, //.1117
        @SerializedName("SYMBOL") val symbol: String, //000430
        @SerializedName("SNAME") val sName: String, //张家界
        @SerializedName("TCLOSE") val tClose: String, //12.6
        @SerializedName("PCHG") val pCHG: String, //-10
        @SerializedName("SMEBTSTOCK1") val sMEBTSTOCK1: String, //连续三个交易日内，跌幅偏离值累计达20%的证券
        @SerializedName("VOTURNOVER") val voTurnOver: Double, //2886.6953
        @SerializedName("VATURNOVER") val vaTurnOver: Double, //364.37080891
        @SerializedName("TDATE") val tDate: String, //2016-01-15
        @SerializedName("EXCHANGE") val exchange: String, //1
        @SerializedName("SCSTC27") val sCSTC27: String, //11.17%
        @SerializedName("SMEBTSTOCK11") val sMEBTSTOCK11: String, //06
        @SerializedName("CODE") val code: String, //1000430
        @SerializedName("NAME") val name: String
)