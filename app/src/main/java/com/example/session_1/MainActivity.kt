package com.example.session_1

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.session_1.ui.theme.Session1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Session1Theme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                    TopAppBar(backgroundColor = Color.WHITE,
                    title = {

                    }
                        )
                        {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                                ) {
                                Image(painter = painterResource(id =R.drawable.img ), contentDescription = null)
                                Icon(imageVector = Icons.Default.Notifications, contentDescription =null )
                            }
                        }
                    ) {

                    }
                }
                ) {
LazyRow()
                }
            }
        }
    }
}




