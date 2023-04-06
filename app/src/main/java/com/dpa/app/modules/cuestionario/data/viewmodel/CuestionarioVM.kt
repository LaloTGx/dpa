package com.dpa.app.modules.cuestionario.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.cuestionario.`data`.model.CuestionarioModel
import org.koin.core.KoinComponent

class CuestionarioVM : ViewModel(), KoinComponent {
  val cuestionarioModel: MutableLiveData<CuestionarioModel> = MutableLiveData(CuestionarioModel())

  var navArguments: Bundle? = null
}
