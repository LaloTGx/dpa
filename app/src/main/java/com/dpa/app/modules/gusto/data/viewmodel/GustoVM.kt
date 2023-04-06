package com.dpa.app.modules.gusto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.gusto.`data`.model.GustoModel
import org.koin.core.KoinComponent

class GustoVM : ViewModel(), KoinComponent {
  val gustoModel: MutableLiveData<GustoModel> = MutableLiveData(GustoModel())

  var navArguments: Bundle? = null
}
