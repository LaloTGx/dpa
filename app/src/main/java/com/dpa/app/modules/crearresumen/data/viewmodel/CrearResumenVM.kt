package com.dpa.app.modules.crearresumen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.crearresumen.`data`.model.CrearResumenModel
import org.koin.core.KoinComponent

class CrearResumenVM : ViewModel(), KoinComponent {
  val crearResumenModel: MutableLiveData<CrearResumenModel> = MutableLiveData(CrearResumenModel())

  var navArguments: Bundle? = null
}
