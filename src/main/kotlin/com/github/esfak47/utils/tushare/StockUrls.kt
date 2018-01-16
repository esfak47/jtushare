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

package com.github.esfak47.utils.tushare

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by tony on 18-1-16.
 */
/**
 * utils to get corresponding url for certain api
 */
object StockUrls {

    fun lhbUrl(pageNo: Int = 1, pageSize: Int = 150): String {
        val now = Date()
        return lhbUrl(now, now, pageNo, pageSize);
    }

    /**
     * 龙虎榜
     */
    fun lhbUrl(start: Date, end: Date, pageNo: Int = 1, pageSize: Int = 150): String {

        val dateFormatter = SimpleDateFormat("yyyy-MM-dd");
        return "http://quotes.money.163.com/hs/marketdata/service/lhb.php?page=${pageNo - 1}&query=start:${dateFormatter.format(start)};end:${dateFormatter.format(end)}&sort=TDATE&order=desc&count=${pageSize}"
    }
}