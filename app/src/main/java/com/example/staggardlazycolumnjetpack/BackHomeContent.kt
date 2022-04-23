package com.example.staggardlazycolumnjetpack

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun BackHomeContent(navigateToProfile: (CardData) ->Unit){
    val foods = remember { FoodDataList.foodList}
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        items(
            items= foods,
            itemContent = {
                FoodListItem(food =it, navigateToProfile)
            }
        )
    }
}