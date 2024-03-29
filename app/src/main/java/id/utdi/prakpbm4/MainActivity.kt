package id.utdi.prakpbm4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.utdi.prakpbm4.ui.theme.PrakPBM4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrakPBM4Theme {
                //Surface container yang menggunakan warna 'latar belakang' dari tema
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProyekNandaCard()
                }
            }
        }
    }
}

@Composable
fun ProyekNandaCard() {
    // Layout kolom dengan modifier dan warna background
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White),
        verticalArrangement = Arrangement.Center, // Menyusun elemen vertikal ke tengah
        horizontalAlignment = Alignment.CenterHorizontally // Menyusun elemen horizontal ke tengah
    ) {
        // Elemen gambar untuk foto progfil dengan modifier
        MyImage(imageResource = R.drawable.profil)

        // Elemen Spacer
        Spacer(modifier = Modifier.height(16.dp))

        // Elemen text untuk nama dengan modifier
        Text(
            text = "Nanda Hidayat",
            modifier = Modifier.padding(8.dp),
            fontSize = 24.sp,
            color = Color.Black
        )

        // Elemen text untuk nomor telepon dengan modifier
        Text(
            text = "Phone: +628 123 456 789",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )

        // Elemen text untuk Twitter dengan modifier
        Text(
            text = "Twitter: @Nannnnyatiga",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )

        // Elemen text untuk email dengan modifier
        Text(
            text = "Email: nandahidayatttnyatiga@gmail.com",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}


@Composable
fun MyImage(imageResource: Int) {
    // Elemen image dengan modifier
    Image(
        painter = painterResource(id = imageResource),
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
            .padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun NandaPreview() {
    PrakPBM4Theme {
        ProyekNandaCard()
    }
}
