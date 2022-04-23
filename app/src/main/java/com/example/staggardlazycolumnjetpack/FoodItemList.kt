package com.example.staggardlazycolumnjetpack

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*

@Composable
fun FoodListItem(food:CardData, navigateToProfile: (CardData) -> Unit){
    Column(
        modifier = Modifier
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
    ) {
        MyStaggeredGrid(
            numberOfColumn = 2,
            modifier = Modifier.padding(5.dp)
        ) {

            val randnum = Random()
            FoodDataList.foodList.forEach { card ->

                Surface(
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(30.dp)),
                    elevation = 4.dp,) {
                    Box(
                        modifier = Modifier.clickable { navigateToProfile(food)  },
                        contentAlignment = Alignment.BottomStart
                    ) {
                        Image(
                            painter = painterResource(id = food.foodImage),
                            contentDescription = food.foodName,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.height(food.height.dp)
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = food.foodName,
                                color = Color(0xFFFFFFFF),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                softWrap = true,
                                modifier = Modifier.fillMaxWidth(.7f)
                            )
                            Text(
                                text = food.make,
                                color = Color(0xFF000000),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                maxLines = 1,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(30.dp))
                                    .background(Color(0xFFFFFFFF))
                                    .padding(7.dp)
                            )
                        }
                    }
                }

            }
        }
    }
}