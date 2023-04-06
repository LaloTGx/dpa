package com.dpa.app.modules.registrarsepaciente.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.registrarsepaciente.`data`.model.RegistrarsePacienteModel
import org.koin.core.KoinComponent

class RegistrarsePacienteVM : ViewModel(), KoinComponent {
  val registrarsePacienteModel: MutableLiveData<RegistrarsePacienteModel> =
      MutableLiveData(RegistrarsePacienteModel())

  var navArguments: Bundle? = null
}
