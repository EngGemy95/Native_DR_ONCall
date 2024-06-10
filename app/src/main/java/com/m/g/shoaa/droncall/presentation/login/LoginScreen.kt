package com.m.g.shoaa.droncall.presentation.login

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.m.g.shoaa.droncall.R
import com.m.g.shoaa.droncall.presentation.theme.MyTheme

// presentation/login/LoginScreen.kt
@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
//@Preview(showSystemUi = true , uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LoginScreen() {
    val text = remember { mutableStateOf("Create Account") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }


    val scrollState = rememberScrollState()

    MyTheme {
        Box {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    // If this removed the scroll not work
                    .padding(WindowInsets.ime.asPaddingValues())
                    .verticalScroll(scrollState),
                Arrangement.Center,
            ) {

                Image(
                    painter = painterResource(id = R.drawable.login), contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = username,
                    textStyle = MaterialTheme.typography.body2.copy(color = MaterialTheme.colors.primary),
                    shape = MaterialTheme.shapes.small,
                    onValueChange = {
                        username = it
                    },
                    label = {
                        Text(
                            stringResource(id = R.string.user_name),
                            style = MaterialTheme.typography.body2.copy(color = MaterialTheme.colors.surface)
                        )
                    },

                    isError = false,

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colors.primaryVariant,
                        unfocusedBorderColor = MaterialTheme.colors.surface,
                        textColor = MaterialTheme.colors.surface,
                        cursorColor = MaterialTheme.colors.surface
                    )
                )
//        if (state.usernameError != null) {
//            Text(state.usernameError, color = MaterialTheme.colors.error, fontSize = 12.sp)
//        }
                Spacer(modifier = Modifier.height(15.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 56.dp) // Ensures a minimum height to center text,
                    ,

                    value = password,
                    textStyle = MaterialTheme.typography.body2.copy(color = MaterialTheme.colors.primary),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done,
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = null
                    ),
                    shape = MaterialTheme.shapes.small,
                    onValueChange = {
                        password = it
                    },
                    label = {
                        Text(
                            stringResource(id = R.string.password),
                            style = MaterialTheme.typography.body2.copy(color = MaterialTheme.colors.surface)
                        )
                    },
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val icon =
                            if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                        IconButton(
                            onClick = {
                                passwordVisible = !passwordVisible
                            },

                            ) {
                            Icon(
                                imageVector = icon,
                                contentDescription = null,
                                tint = MaterialTheme.colors.primaryVariant,
                            )
                        }

                    },
                    isError = false,

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = MaterialTheme.colors.primaryVariant,
                        unfocusedBorderColor = MaterialTheme.colors.surface,
                        textColor = MaterialTheme.colors.surface,
                        cursorColor = MaterialTheme.colors.surface
                    )
                )
//        if (state.passwordError != null) {
//            Text(state.passwordError, color = MaterialTheme.colors.error, fontSize = 12.sp)
//        }
                Spacer(modifier = Modifier.height(30.dp))

                Button(
                    onClick = {

                    },
                    modifier = Modifier.fillMaxWidth(), contentPadding = PaddingValues(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.primaryVariant,
                        contentColor = MaterialTheme.colors.primary,
                    )
                ) {
                    Text(
                        style = MaterialTheme.typography.button.copy(color = Color.White),
                        text = "Login",
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier
                             .fillMaxHeight(),
                        contentAlignment = Alignment.Center // Center the content inside the Box
                    ) {
                        Text(
                            style = MaterialTheme.typography.body2.copy(
                                color = MaterialTheme.colors.primary,
                                textAlign = TextAlign.Center,
                            ),
                            text = "Don't have any account?",
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(modifier = Modifier.width(20.dp))

                  Box(
                      modifier = Modifier
                          .clickable {
                              text.value = "Clicked!!"
                          }
                       .fillMaxHeight(),
                      contentAlignment = Alignment.Center, // Center the content inside the Box

                              ){
                      Text(
                          style = MaterialTheme.typography.body1.copy(
                              color = MaterialTheme.colors.primaryVariant,
                              fontWeight = FontWeight.Bold,
                              textAlign = TextAlign.Center
                          ),
                          text = text.value,
                          modifier = Modifier
                              .clickable {

                              } ,
                          textAlign = TextAlign.Center,
                      )

                  }
                }
            }
        }
    }
}