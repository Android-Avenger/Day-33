package com.example.apis

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities =
[ProductEntity::class],
    version = 1
)
abstract class ProductDB : RoomDatabase() {

   abstract fun insertProduct() : ProductDao
   abstract fun getAllProduct() : ProductDao
   abstract fun getProductEntity() : ProductDao
   abstract fun updateProduct() : ProductDao
   abstract fun deleteProduct() : ProductDao


}