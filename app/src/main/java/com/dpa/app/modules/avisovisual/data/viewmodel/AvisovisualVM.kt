package com.dpa.app.modules.avisovisual.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.avisovisual.`data`.model.AvisovisualModel
import org.koin.core.KoinComponent

class AvisovisualVM : ViewModel(), KoinComponent {
  val avisovisualModel: MutableLiveData<AvisovisualModel> = MutableLiveData(AvisovisualModel())

  var navArguments: Bundle? = null
}
