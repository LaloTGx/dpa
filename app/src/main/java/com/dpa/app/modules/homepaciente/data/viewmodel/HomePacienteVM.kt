package com.dpa.app.modules.homepaciente.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.homepaciente.`data`.model.HomePacienteModel
import org.koin.core.KoinComponent

class HomePacienteVM : ViewModel(), KoinComponent {
  val homePacienteModel: MutableLiveData<HomePacienteModel> = MutableLiveData(HomePacienteModel())

  var navArguments: Bundle? = null
}
