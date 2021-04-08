package com.maddox.cool.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status:String,val count:String,val info:String,val infocode:String,val places:List<Place>)
data class Place(val id:String,val name:String,@SerializedName("formatted_address")val address:String,val location:Location)
data class Location(val lat:String,val lng:String)
