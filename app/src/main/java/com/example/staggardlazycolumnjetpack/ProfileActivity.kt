package com.example.staggardlazycolumnjetpack

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.staggardlazycolumnjetpack.ui.theme.FoodProfileScreen
import com.example.staggardlazycolumnjetpack.ui.theme.StaggardLazyColumnJetpackTheme

class ProfileActivity : ComponentActivity() {
    private val food: CardData by lazy {
        intent?.getSerializableExtra(FOOD_ID) as CardData
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StaggardLazyColumnJetpackTheme {
               FoodProfileScreen(food = food)
            }
        }
    }
    companion object{
        private const val FOOD_ID = "food_id"
        fun newIntent(context: Context, food: CardData)=
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(FOOD_ID,food)
            }
    }
}

