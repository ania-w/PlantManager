package pl.aniaw.plantmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pl.aniaw.plantmanager.data.remote.RetrofitInstance
import pl.aniaw.plantmanager.ui.theme.PlantManagerTheme


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlantManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

    // The plant API key
    val plantApiKey = BuildConfig.PLANT_API_KEY

    // Coroutine to call the API
    val coroutineScope = rememberCoroutineScope()

    // Launch the suspend function inside a Composable with LaunchedEffect
    LaunchedEffect(Unit) {
        val plantList = try {
            // Replace `pl ?: ""` with the correct parameter if needed
            RetrofitInstance.api.getPlantList(plantApiKey)
        } catch (e: Exception) {
            // Handle exceptions (like network errors)
            e
        }

        // Do something with the plantList, for example, show it in the UI
        println(plantList)
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlantManagerTheme {
        Greeting("Android")
    }
}