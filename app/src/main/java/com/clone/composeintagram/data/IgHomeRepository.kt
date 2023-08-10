package com.clone.composeintagram.data

import androidx.compose.ui.graphics.Color
import javax.inject.Inject

class IgHomeRepository @Inject constructor(
    private val igLocalDataSource: IgLocalDataSource
) {
    val igStatus: List<DataModel> = igLocalDataSource.statusIg
    val igStatusBorder: List<Color> = igLocalDataSource.colorList
}