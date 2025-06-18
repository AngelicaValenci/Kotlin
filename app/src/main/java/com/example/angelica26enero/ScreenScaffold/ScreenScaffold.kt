package com.example.angelica26enero.ScreenScaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun pantallaScaffold(){
    Scaffold(
        topBar = { TopAppBar ( colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Blue)
            ,title ={ Text(text="suma", color = Color.White)}, modifier = Modifier.background(Color.Blue))
        }

        , floatingActionButton ={ FloatingActionButton(containerColor = Color.Blue, shape = CircleShape,
            onClick ={} ){ Text(text = "+")}}
    ){
            paddingValues ->
        val respuesta= Lamda(4,3){
                num1,num2->num1+num2

        }

        Text(text = respuesta.toString(), modifier = Modifier.padding(paddingValues))


    }
}
