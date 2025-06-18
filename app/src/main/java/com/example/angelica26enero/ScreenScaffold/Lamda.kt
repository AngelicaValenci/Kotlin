package com.example.angelica26enero.ScreenScaffold

import androidx.compose.runtime.Composable

@Composable
fun Lamda(num1:Int,num2:Int,Operacion:(Int,Int)-> Int):Int{
    return Operacion(num1,num2)
}
