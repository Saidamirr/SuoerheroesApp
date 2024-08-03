package com.example.superherosapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.superherosapp.data.Hero
import com.example.superherosapp.data.HeroesRepository
import com.example.superherosapp.ui.theme.Shapes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroesScreen() {
    @Composable
    fun SmallTopAppBarExample() {
        Scaffold(
            CenterAlignedTopAppBar(
                        title = {
                            Text("Superheroes")
                        }
            )
        ) { innerPadding ->
            LazyColumn(modifier = Modifier.padding(innerPadding)) {
                items(HeroesRepository.heroes) {
                    ListItem(hero = it,
                        modifier = Modifier)
                }
            }
        }
    }

}

@Composable
fun ListItem(hero: Hero, modifier: Modifier) {
    Card (modifier = Modifier
        .padding(5.dp)
        .clip(Shapes.small)
    ) {
        Row(modifier = Modifier.padding(20.dp)) {
            Column(
                modifier = Modifier.weight(1F)
            ) {
                Text(text = stringResource(id = hero.nameRes))
                Text(text = stringResource(id = hero.aboutRes),
                    //modifier = Modifier.width(250.dp)
                )
            }
            //Spacer(modifier = Modifier.weight(2F))
            Image(painter = painterResource(id = hero.pictureRes),
                contentDescription = "hero image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .clip(Shapes.medium),
            )
        }
    }
}