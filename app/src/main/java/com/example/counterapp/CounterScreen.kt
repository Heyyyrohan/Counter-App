import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.counterapp.CounterViewModel



@Composable
fun CounterScreen(vm : CounterViewModel = viewModel()) {

    val count = vm.count.collectAsState().value


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = "$count",
            fontSize = 95.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "The Button Clicked $count Times",
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(10.dp),
                onClick ={
                    vm.increace()
                    // num= num+1
                }
            ) {
                Text(text = "Increase",
                    fontSize = 20.sp)

            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(10.dp),
                onClick ={
                    vm.reset()
                }
            ) {
                Text(text = "Reset",
                    fontSize = 20.sp)


            }

        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCounterScreen() {
    CounterScreen()
}

