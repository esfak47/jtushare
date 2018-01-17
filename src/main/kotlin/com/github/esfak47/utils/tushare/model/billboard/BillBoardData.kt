package com.github.esfak47.utils.tushare.model.billboard
import com.google.gson.annotations.SerializedName


/**
 * @author Tony
 * Created by tony on 2018/1/17.
 */

data class BillBoardData(
		@SerializedName("page") val page: Int, //0
		@SerializedName("count") val count: Int, //150
		@SerializedName("order") val order: Int, //-1
		@SerializedName("total") val total: String, //60
		@SerializedName("pagecount") val pagecount: Int, //1
		@SerializedName("time") val time: String, //2018-01-17 15:06:11
		@SerializedName("key") val key: String, ///finance/hs/marketdata/lhb/46381d9f40fea21440ffd137ec8c48be.json
		@SerializedName("list") val list: List<BillBoardDataItem>
)

