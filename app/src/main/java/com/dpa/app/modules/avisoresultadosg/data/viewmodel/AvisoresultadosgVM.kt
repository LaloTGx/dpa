package com.dpa.app.modules.avisoresultadosg.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.avisoresultadosg.`data`.model.AvisoresultadosgModel
import org.koin.core.KoinComponent

class AvisoresultadosgVM : ViewModel(), KoinComponent {
  val avisoresultadosgModel: MutableLiveData<AvisoresultadosgModel> =
      MutableLiveData(AvisoresultadosgModel())

  var navArguments: Bundle? = null
}
