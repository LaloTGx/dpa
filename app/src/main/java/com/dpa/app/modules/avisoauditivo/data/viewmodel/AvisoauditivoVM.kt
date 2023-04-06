package com.dpa.app.modules.avisoauditivo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.avisoauditivo.`data`.model.AvisoauditivoModel
import org.koin.core.KoinComponent

class AvisoauditivoVM : ViewModel(), KoinComponent {
  val avisoauditivoModel: MutableLiveData<AvisoauditivoModel> =
      MutableLiveData(AvisoauditivoModel())

  var navArguments: Bundle? = null
}
