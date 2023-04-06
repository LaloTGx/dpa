package com.dpa.app.modules.recuperar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.recuperar.`data`.model.RecuperarModel
import org.koin.core.KoinComponent

class RecuperarVM : ViewModel(), KoinComponent {
  val recuperarModel: MutableLiveData<RecuperarModel> = MutableLiveData(RecuperarModel())

  var navArguments: Bundle? = null
}
