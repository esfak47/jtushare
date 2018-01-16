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

package com.github.esfak47.utils.tushare.unittest

import com.github.esfak47.utils.tushare.StockUrls
import org.junit.Test
import java.util.*

/**
 * Created by tony on 18-1-16.
 */
class TestStockUrls{
    @Test
    fun testGetLhb(){
        var instance = Calendar.getInstance()
        instance.set(2016,0,15)
        var time = instance.time
        var lhbUrl = StockUrls.lhbUrl(time,time)
        println(lhbUrl)
    }
}