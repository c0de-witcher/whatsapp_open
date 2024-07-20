package com.example.whatsapp_opener

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.text.isDigitsOnly
import com.example.whatsapp_opener.ui.theme.Whatsapp_openerTheme
import view

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var number : String? = null
        if (intent.action == Intent.ACTION_PROCESS_TEXT){
            number = intent.getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT).toString()

        }

        numbercheck(number)


        setContent {
            view(){
                numbercheck(it)
            }


        }
    }

    private fun openwhatsapp(number: String) {
        val i = Intent(Intent.ACTION_VIEW)
        i.setPackage("com.whatsapp")
        val data = if(number.length==10){
            "91$number"
        }
        else{
            number
        }

        i.data = Uri.parse("https://wa.me/$data")
        if(packageManager.resolveActivity(intent,0)!=null){
            startActivity(i)
            finish()
        }
        else{
            Toast.makeText(this,"WhatsApp Not Installed",Toast.LENGTH_SHORT).show()
        }
        }

    fun removeSpaces(input: String): String {
        return input.replace(" ", "")
    }

     fun numbercheck( numbers : String?){


        var number = numbers
        if(number!=null ){
            number= removeSpaces(number)
            if(number[0]=='+'){
                number=number.substring(1)
            }
            if (number.isDigitsOnly()){
                openwhatsapp(number)
            }
            else{
                Toast.makeText(this,"Invalid Number",Toast.LENGTH_SHORT).show()
            }
        }
    }
    }

