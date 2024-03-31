@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpackcomposeapplication

import android.graphics.Color
import android.graphics.drawable.PaintDrawable
import android.util.Log
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.SemanticsProperties.ImeAction
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.net.PasswordAuthentication


@Composable
fun LoginScreen(){

 var email by remember {
  mutableStateOf("")
 }

 var password by remember {
  mutableStateOf("")
 }
 Column(
  modifier = Modifier.fillMaxSize(),
  verticalArrangement = Arrangement.Center,
  horizontalAlignment = Alignment.CenterHorizontally
 ) {

  Image(
   painter = painterResource(id = R.drawable.kisses), contentDescription = "Login Image",
   modifier = Modifier.size(200.dp)
  )
  Text(
   text = "Welcome",
   modifier = Modifier.padding(10.dp),
   fontSize = 28.sp,
   fontFamily = FontFamily.SansSerif,
   fontWeight = FontWeight.Bold
  )

  Text(
   text = "Login to your account",
   fontSize = 20.sp,
   fontFamily = FontFamily.SansSerif,
   fontWeight = FontWeight.Medium
  )
  Spacer(modifier = Modifier.height(4.dp))
  Text("Fill the Form", fontSize = 15.sp)

  OutlinedTextField(value = email, onValueChange = {email=it}, label = {
   Text(text = "Email Address")
  })

  Spacer(modifier = Modifier.height(5.dp))

  OutlinedTextField(value = password, onValueChange = {password=it}, label = {
   Text(text = "Password")
  }, visualTransformation = PasswordVisualTransformation())
  Spacer(modifier = Modifier.height(5.dp))

  Button(onClick = {
   Log.e("email and pass",email+ " " +password)
  }) {
   Text(text = "Login")
  }

  Spacer(modifier = Modifier.height(4.dp))

  TextButton(onClick = { }) {
   Text(text = "Forget Password")
  }
  Spacer(modifier = Modifier.height(4.dp))

  Text(text = "Or sign in with", modifier = Modifier.clickable { })
  Spacer(modifier = Modifier.height(6.dp))

  Row(modifier = Modifier
   .fillMaxWidth()
   .padding(40.dp),
  horizontalArrangement = Arrangement.SpaceEvenly) {
   Image(
    painter = painterResource(R.drawable.facebook),
    contentDescription = "",
    modifier = Modifier
     .size(50.dp)
     .clickable {
      //facebook click
     })
   Image(
    painter = painterResource(R.drawable.google),
    contentDescription = "",
    modifier = Modifier
     .size(50.dp)
     .clickable {
      //google click
     })
   Image(
    painter = painterResource(R.drawable.whatsapp),
    contentDescription = "",
    modifier = Modifier
     .size(50.dp)



     .clickable {
      //whatsapp click
     })
  }
 }

}