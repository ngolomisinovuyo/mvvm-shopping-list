package com.example.shoppinglist.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem (
    @ColumnInfo(name="name")
    var name: String,
    @ColumnInfo(name="amount")
    var amount: Int
        ) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}