package UI

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable

fun MainControl()
{
    Column(modifier = Modifier.fillMaxHeight()) {
        Row {
            Menu()
            InitialControl()
        }
    }
}