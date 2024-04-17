package com.example.collegecookbbookapp

import android.os.Parcel
import android.os.Parcelable

data class FoodItem(
    val name: String,
    val image: Int,
    val category: String,
    val mainIngredients: List<String>,
    val optionalIngredients: List<String>,
    val requirements: List<String>,
    val instructions: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.createStringArrayList() ?: emptyList(),
        parcel.createStringArrayList() ?: emptyList(),
        parcel.createStringArrayList() ?: emptyList(),
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(image)
        parcel.writeString(category)
        parcel.writeStringList(mainIngredients)
        parcel.writeStringList(optionalIngredients)
        parcel.writeStringList(requirements)
        parcel.writeString(instructions)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FoodItem> {
        override fun createFromParcel(parcel: Parcel): FoodItem {
            return FoodItem(parcel)
        }

        override fun newArray(size: Int): Array<FoodItem?> {
            return arrayOfNulls(size)
        }
    }
}