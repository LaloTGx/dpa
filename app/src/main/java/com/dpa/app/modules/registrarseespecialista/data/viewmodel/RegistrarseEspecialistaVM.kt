package com.dpa.app.modules.registrarseespecialista.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.registrarseespecialista.`data`.model.RegistrarseEspecialistaModel
import org.koin.core.KoinComponent

class RegistrarseEspecialistaVM : ViewModel(), KoinComponent {
  val registrarseEspecialistaModel: MutableLiveData<RegistrarseEspecialistaModel> =
      MutableLiveData(RegistrarseEspecialistaModel())

  var navArguments: Bundle? = null
}
