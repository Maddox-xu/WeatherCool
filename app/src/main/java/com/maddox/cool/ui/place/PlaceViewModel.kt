package com.maddox.cool.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.maddox.cool.logic.model.Place
import com.maddox.cool.logic.network.Repository

class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()

    /**
     * 监听searchLiveData的变化,去跟去其值作为搜索参数 调用Repository的
     * 查询方法,返回类型为一个LiveData
     */
    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }




}