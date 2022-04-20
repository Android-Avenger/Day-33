package com.example.apis

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class ProductEntity(
    @ColumnInfo(name = "product_name") val pName: String,
    @ColumnInfo(name = "product_description") var pDescription:String,
    @ColumnInfo(name = "product_price") var pPrice:Int,
    )
{
    @PrimaryKey(autoGenerate = true) val id:Int= 0
}


