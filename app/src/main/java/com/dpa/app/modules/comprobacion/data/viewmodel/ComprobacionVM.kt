package com.dpa.app.modules.comprobacion.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.comprobacion.`data`.model.ComprobacionModel
import org.koin.core.KoinComponent

class ComprobacionVM : ViewModel(), KoinComponent {
  val comprobacionModel: MutableLiveData<ComprobacionModel> = MutableLiveData(ComprobacionModel())

  var navArguments: Bundle? = null
}
