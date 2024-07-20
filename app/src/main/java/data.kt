import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.savedstate.R
import com.example.whatsapp_opener.ui.theme.dark_green
import com.example.whatsapp_opener.ui.theme.dark_white
import com.example.whatsapp_opener.ui.theme.light_green


@Composable
fun view(click:(String?)->Unit) {
    var numbers = remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp, 100.dp),
        contentAlignment = Alignment.TopCenter
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier,
            ) {

                TextField(value = numbers.value, onValueChange = {
                    numbers.value = it

                },
                    label = {
                        Text(text = "Enter mobile number")
                    })

            }
            Button(
                onClick = {click(numbers.value)},
                colors = ButtonColors(dark_green, Color.White, Color.Black, Color.White),
                modifier = Modifier.padding(30.dp, 20.dp, 30.dp, 10.dp)
            ) {
                Text(text = "Search")

            }

        }

    }



}




@Preview(showSystemUi = true)
@Composable
fun preview(){
    //view()
}