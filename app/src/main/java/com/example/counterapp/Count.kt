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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showSystemUi=true, showBackground = true)
@Composable
fun Counter() {

    var num by remember { mutableStateOf(0)}

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = "$num",
            fontSize = 95.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "The Button Clicked $num Times",
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth().
            padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(10.dp),
                onClick ={
                    num++
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
                    num = 0
                }
            ) {
                Text(text = "Reset",
                    fontSize = 20.sp)

            }

        }


    }

}