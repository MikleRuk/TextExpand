package com.example.textexpand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.example.learningjetpackcompose.ItemRowModel
import com.example.textexpand.ui.theme.Gray100


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray100)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.kit1, "Китя 1", "Сем и Джинни, будучи котятами, играют вместе. Сем - рыжий котенок, Джинни - серая китя."),
                        ItemRowModel(R.drawable.kit2, "Китя 2", "Полуторагодовалая Джинни валяется на Олиной посетеле на даче."),
                        ItemRowModel(R.drawable.kit3, "Китя 3", "Юми и Джинн.и"),
                        ItemRowModel(R.drawable.kit4, "Китя 4", "Юми и Сем."),
                        ItemRowModel(R.drawable.kit5, "Китя 5", "Юми - мама Сема и Джинни."),
                        ItemRowModel(R.drawable.kit6, "Китя 6", "Миса - самая старшая китя. Брат привез ее из армии."),
                        ItemRowModel(R.drawable.kit7, "Китя 7", "Юми и ее котята в первые дни, когда они родились."),
                        ItemRowModel(R.drawable.kit8, "Китя 8", "Просто Юми. Просто Милость"),
                        ItemRowModel(R.drawable.kit9, "Китя 9", "Орущая Миса")

                    )
                ) { _, item ->
                    ItemRow(item = item)
                }

            }

        }

    }
}

