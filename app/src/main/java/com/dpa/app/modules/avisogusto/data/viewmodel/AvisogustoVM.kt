package com.dpa.app.modules.avisogusto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.avisogusto.`data`.model.AvisogustoModel
import org.koin.core.KoinComponent

class AvisogustoVM : ViewModel(), KoinComponent {
  val avisogustoModel: MutableLiveData<AvisogustoModel> = MutableLiveData(AvisogustoModel())

  var navArguments: Bundle? = null
}
