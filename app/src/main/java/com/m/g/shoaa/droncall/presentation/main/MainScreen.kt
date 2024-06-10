package com.m.g.shoaa.droncall.presentation.main

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.m.g.shoaa.droncall.R
import com.m.g.shoaa.droncall.presentation.theme.MyTheme


//@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun MainScreen() {

    MyTheme {
        Box {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Box(
                        modifier = Modifier
                            .clickable {
                                       
                            },
                    ) {
                        Text(
                            style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .padding(10.dp),
                            text = stringResource(R.string.skip),
                            color = MaterialTheme.colors.primaryVariant,
                        )
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.doctors), contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                )

                Text(
                    style = MaterialTheme.typography.h1.copy(
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colors.primaryVariant,
                    ),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .clickable {

                        },
                    text = stringResource(R.string.doctors_appointment),
                )

                Text(
                    style = MaterialTheme.typography.body2.copy(
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colors.onSurface,
                    ),
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .clickable {

                        },
                    text = stringResource(R.string.appointment_your_doctor),
                )

                Spacer(modifier = Modifier.height(20.dp))

//        if (state.passwordError != null) {
//            Text(state.passwordError, color = MaterialTheme.colors.error, fontSize = 12.sp)
//        }
                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(), Arrangement.Absolute.SpaceAround
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = MaterialTheme.colors.primaryVariant,
                            contentColor = MaterialTheme.colors.primary,
                        )
                    ) {
                        Text(
                            style = MaterialTheme.typography.button.copy(color = Color.White),
                            text = stringResource(id = R.string.login),
                        )
                    }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = MaterialTheme.colors.primaryVariant,
                            contentColor = MaterialTheme.colors.primary,
                        )
                    ) {
                        Text(
                            style = MaterialTheme.typography.button.copy(color = Color.White),
                            text = stringResource(R.string.sign_up),
                        )
                    }
                }
                Spacer(modifier = Modifier.height(60.dp))

            }
        }
    }

}