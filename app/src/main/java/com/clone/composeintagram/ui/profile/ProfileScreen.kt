package com.clone.composeintagram.ui.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.clone.composeintagram.ui.profile.components.EditShareProfile
import com.clone.composeintagram.ui.profile.components.ProfileDescription
import com.clone.composeintagram.ui.profile.components.RowDiscoverPeople
import com.clone.composeintagram.ui.profile.components.StoryProfile
import com.clone.composeintagram.ui.profile.components.ThreadsAccount

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    viewModel: ProfileViewModel = hiltViewModel()
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ProfileDescription()
        ThreadsAccount()
        EditShareProfile()
        RowDiscoverPeople(viewModel = viewModel)
        StoryProfile()
    }
}


