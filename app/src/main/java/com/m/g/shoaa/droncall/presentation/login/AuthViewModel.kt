package com.m.g.shoaa.droncall.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.m.g.shoaa.droncall.domain.usecase.LoginUsecase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthViewModel @Inject constructor(
    private val loginUserCase : LoginUsecase
) : ViewModel(){
    private val _state = MutableStateFlow(AuthState())
    val state: StateFlow<AuthState> get() = _state

    private val intentChannel = Channel<AuthIntent>(Channel.UNLIMITED)

    init {
        handleIntent()
    }

    fun sendIntent(intent: AuthIntent) {
        viewModelScope.launch {
            intentChannel.send(intent)
        }
    }

    private fun handleIntent(){
        viewModelScope.launch {
            intentChannel.consumeAsFlow().collect{ intent ->
                    when(intent){
                        is AuthIntent.login ->  login(intent.username , intent.password)
                    }
            }
        }
    }

    fun login(username : String , password : String) {
        viewModelScope.launch {
            try {
                _state.value = AuthState(isLoading = true)
                val auth = loginUserCase.login(username,password)
                _state.value = AuthState(isLoading = false, auth = auth)
            }catch (e : Exception){
                _state.value = AuthState(isLoading = false, error = e.message)
            }
        }
    }
}