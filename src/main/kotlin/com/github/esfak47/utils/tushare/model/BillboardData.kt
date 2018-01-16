/*
 *   Copyright 2018 esfak47
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.esfak47.utils.tushare.model
import com.alibaba.fastjson.annotation.JSONField


/**
 * Created by tony on 18-1-16.
 */

data class BillboardData(
		@JSONField(name = "page") val page: Int, //0
		@JSONField(name = "count") val count: Int, //150
		@JSONField(name = "order") val order: Int, //-1
		@JSONField(name = "total") val total: String, //60
		@JSONField(name = "pagecount") val pageCount: Int, //1
		@JSONField(name = "time") val time: String, //2018-01-16 12:16:43
		@JSONField(name = "key") val key: String, ///finance/hs/marketdata/lhb/46381d9f40fea21440ffd137ec8c48be.json
		@JSONField(name = "list") val list: List<Item>
)

data class Item(
		@JSONField(name = "NO") val no: String, //1
		@JSONField(name = "COMPAREA") val comparea: String, //.1117
		@JSONField(name = "SYMBOL") val symbol: String, //000430
		@JSONField(name = "SNAME") val sName: String, //张家界
		@JSONField(name = "TCLOSE") val tClose: String, //12.6
		@JSONField(name = "PCHG") val pchg: String, //-10
		@JSONField(name = "SMEBTSTOCK1") val smebtStock1: String, //连续三个交易日内，跌幅偏离值累计达20%的证券
		@JSONField(name = "VOTURNOVER") val voTurnOver: Double, //2886.6953
		@JSONField(name = "VATURNOVER") val vaTurnOver: Double, //364.37080891
		@JSONField(name = "TDATE") val tDate: String, //2016-01-15
		@JSONField(name = "EXCHANGE") val exchange: String, //1
		@JSONField(name = "SCSTC27") val scstc27: String, //11.17%
		@JSONField(name = "SMEBTSTOCK11") val smebtStock11: String, //06
		@JSONField(name = "CODE") val code: String, //1000430
		@JSONField(name = "NAME") val name: String
)