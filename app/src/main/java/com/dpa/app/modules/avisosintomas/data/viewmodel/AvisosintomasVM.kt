package com.dpa.app.modules.avisosintomas.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.avisosintomas.`data`.model.AvisosintomasModel
import org.koin.core.KoinComponent

class AvisosintomasVM : ViewModel(), KoinComponent {
  val avisosintomasModel: MutableLiveData<AvisosintomasModel> =
      MutableLiveData(AvisosintomasModel())

  var navArguments: Bundle? = null
}
