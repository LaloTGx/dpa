package com.dpa.app.modules.iniciarsesionpaciente.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.iniciarsesionpaciente.`data`.model.IniciarSesionPacienteModel
import org.koin.core.KoinComponent

class IniciarSesionPacienteVM : ViewModel(), KoinComponent {
  val iniciarSesionPacienteModel: MutableLiveData<IniciarSesionPacienteModel> =
      MutableLiveData(IniciarSesionPacienteModel())

  var navArguments: Bundle? = null
}
