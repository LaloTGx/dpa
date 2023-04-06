package com.dpa.app.modules.resultadosgenerales.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.resultadosgenerales.`data`.model.ResultadosGeneralesModel
import org.koin.core.KoinComponent

class ResultadosGeneralesVM : ViewModel(), KoinComponent {
  val resultadosGeneralesModel: MutableLiveData<ResultadosGeneralesModel> =
      MutableLiveData(ResultadosGeneralesModel())

  var navArguments: Bundle? = null
}
