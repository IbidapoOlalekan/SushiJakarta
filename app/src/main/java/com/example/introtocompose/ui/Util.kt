package com.example.introtocompose.ui

object Util {
    fun generateSushiItem(): List<Meal>{
        return listOf(
            Meal("Original Sushi", 21, 4.8),
            Meal("Shrimp Sushi", 87, 4.2),
            Meal("Kaizen Sushi", 201, 3.8),
            Meal("Wagyu Sushi", 11, 4.4),
            Meal("Mushu Sushi", 27, 5.8),
            Meal("Croaker Sushi", 91, 4.8),
            Meal("Titus Sushi", 56, 4.8),
            Meal("Salmon Sushi", 19, 4.8)
        )
    }

    fun generateRamenItem(): List<Meal>{
        return listOf(
            Meal("Beef Ramen", 21, 4.8),
            Meal("Shrimp Ramen", 87, 4.2),
            Meal("Fish Ramen", 201, 3.8),
            Meal("Mushu Ramen", 11, 4.4),
            Meal("Snail Ramen", 27, 5.8),
            Meal("Croaker Ramen", 91, 4.8),
            Meal("Rat Ramen", 56, 4.8),
            Meal("Salmon Ramen", 19, 4.8)
        )
    }

}

data class Meal(
    val name: String,
    val price: Int,
    val ratings : Double,
    var isFav: Boolean = false
)