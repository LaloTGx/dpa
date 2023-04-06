package com.dpa.app.modules.loginpaciente.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.loginpaciente.`data`.model.LoginPacienteModel
import org.koin.core.KoinComponent

class LoginPacienteVM : ViewModel(), KoinComponent {
  val loginPacienteModel: MutableLiveData<LoginPacienteModel> =
      MutableLiveData(LoginPacienteModel())

  var navArguments: Bundle? = null
}
