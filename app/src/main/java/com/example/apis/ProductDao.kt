package com.example.apis

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import java.io.FileDescriptor

interface ProductDao {

 @Insert(onConflict = OnConflictStrategy.IGNORE)
 fun insertProduct(productDao: ProductDao)

 @Query("SELECT * FROM product")
 fun getAllProductsLiveData() : LiveData<List<ProductEntity>>

 @Query("SELECT * FROM product")
 fun getAllProduct() : List<ProductEntity>

 @Query("SELECT * FROM product WHERE product_name=:product")
 fun getProductEntity(product:String) : ProductEntity?

 @Query("UPDATE product SET product_name=:name,product_description=:description,product_price=:price" )
 fun updateProduct(
     name: String,
     description :String,
     price:Int
 )

 @Query("DELETE FROM product WHERE product_name=:productName")
 fun deleteProduct(productName: String)

}