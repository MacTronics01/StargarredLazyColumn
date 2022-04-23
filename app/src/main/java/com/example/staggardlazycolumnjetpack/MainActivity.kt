package com.example.staggardlazycolumnjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.staggardlazycolumnjetpack.ui.theme.StaggardLazyColumnJetpackTheme
import java.io.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StaggardLazyColumnJetpackTheme {
                // A surface container using the 'background' color from the theme
                MyApp{
                    startActivity(ProfileActivity.newIntent(this,it))
                }
            }
            }
        }
    }

@Composable
fun  MyApp(navigateToProfile: (CardData)->Unit){
    Scaffold(
        content = {
            BackHomeContent(navigateToProfile = navigateToProfile)
        }
    )
}


