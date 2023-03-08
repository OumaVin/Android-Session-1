package com.example.assignm

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewTreeLifecycleOwner
import com.example.assignm.ui.theme.AssignmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmTheme {
           Scaffold(
               topBar = {
                   TopAppBar (
                       backgroundColor = Color.White,
                       elevation =0.dp,
                       title = {
                           Row(
                               modifier = Modifier
                                   .fillMaxWidth()
                                   .clip(CircleShape),
                               horizontalArrangement = Arrangement.SpaceBetween,
                               verticalAlignment = Alignment.CenterVertically,
                           ){
                               Image(
                                   painter = painterResource(id = R.drawable.img_1),
                                   contentDescription =null )
                               Icon(
                                   imageVector = Icons.Default.Notifications,
                                   contentDescription = null)
                           }
                       }

                               )

                       }
                   ){
                       LazyColumn(
                           modifier = Modifier
                               .fillMaxWidth()
                               .padding(24.dp)
                               .width(100.dp)
                       ){
                           item {
                               LazyRow(modifier = Modifier.fillMaxWidth() ){
                                   items(town){ town->
                                       Town(town)
                                   }
                               }
                           }
                           item {
                               //Spacer(modifier = Modifier.height(24.dp))

                               Row(
                                   Modifier.fillMaxWidth(),
                                   horizontalArrangement = Arrangement.SpaceBetween
                               ){
                                   Text(text = "Best Destination")

                                   Text(text = "View All")
                               }
                           }
                           item {
                               LazyRow(
                                   modifier = Modifier.fillMaxWidth()
                               ){
                                   items(Destination){ Destination->
                                       Card(
                                       ) {
                                         Image(
                                             painter = painterResource(id = Destination.Image),
                                             contentDescription =null
                                         )
                                           Text(
                                               text = Destination.name
                                           )
                                       }
                                   }
                               }
                           }
                       }
               }





        }
    }
}

@Composable
fun Town(town: Town) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .padding(8.dp)

    ){
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(id = town.Image),
                contentDescription = null

            )
            Text(text = town.name)
            Text(text = town.location)
        }
    }

}

    @Composable
    fun BestDestination(Destination: BestDestination) {
        Card(modifier = Modifier
            .width(100.dp)
            .height(120.dp)
            .padding(23.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = Destination.Image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )

                Text(text = Destination.name)
                Text(text = Destination.location)
            }

        }
    }

}

data class Town(
    val Image: Int,
    val name: String,
    val location: String,
    val rating: Float,
)

val town = listOf(
    Town(
        Image = R.drawable.img,
        name = "Eldoret",
        location = "Nairobi, Kenya",
        rating = 4.5f,
    ),
    Town(
        Image = R.drawable.img_2,
        name = "Manchester",
        location = "Mumbai, India",
        rating = 4.6f,
    ),
    Town(
        Image = R.drawable.img_3,
        name = "Kenya",
        location = "Kisii, Kenya",
        rating = 4.7f,
    ),
    Town(
        Image = R.drawable.img_4,
        name = "Mombasa",
        location = "Nairobi, Kenya",
        rating = 4.8f,
    ),
    Town(
        Image = R.drawable.img_5,
        name = "Dodoma",
        location = "Dodoma, Tz",
        rating = 4.9f,
    )

)

data class BestDestination(
    val Image: Int,
    val name: String,
    val location: String,
    val rating: Float
)

val Destination = listOf(
    BestDestination(
        Image = R.drawable.img,
        name = "Nakuru",
        location = "Nairobi, Kenya",
        rating = 4.5f,
    ),
    BestDestination(
        Image = R.drawable.img,
        name = "Everest",
        location = "Mombai, India",
        rating = 4.6f,
    ),
    BestDestination(
        Image = R.drawable.img,
        name = "Kenya",
        location = "Meru, Kenya",
        rating = 4.7f,
    ),
    BestDestination(
        Image = R.drawable.img,
        name = "Elgon",
        location = "Nairobi, Kenya",
        rating = 4.8f,
    ),
    BestDestination(
        Image = R.drawable.img,
        name = "Panagio",
        location = "Jubal, Tz",
        rating = 4.9f,
    )

)
