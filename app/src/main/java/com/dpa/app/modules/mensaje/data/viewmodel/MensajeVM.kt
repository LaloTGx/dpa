package com.dpa.app.modules.mensaje.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.mensaje.`data`.model.MensajeModel
import org.koin.core.KoinComponent

class MensajeVM : ViewModel(), KoinComponent {
  val mensajeModel: MutableLiveData<MensajeModel> = MutableLiveData(MensajeModel())

  var navArguments: Bundle? = null
}
