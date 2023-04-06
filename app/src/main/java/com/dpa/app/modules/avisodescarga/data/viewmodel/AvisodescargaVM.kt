package com.dpa.app.modules.avisodescarga.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.avisodescarga.`data`.model.AvisodescargaModel
import org.koin.core.KoinComponent

class AvisodescargaVM : ViewModel(), KoinComponent {
  val avisodescargaModel: MutableLiveData<AvisodescargaModel> =
      MutableLiveData(AvisodescargaModel())

  var navArguments: Bundle? = null
}
