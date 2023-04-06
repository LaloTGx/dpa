package com.dpa.app.modules.avisotacto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.avisotacto.`data`.model.AvisotactoModel
import org.koin.core.KoinComponent

class AvisotactoVM : ViewModel(), KoinComponent {
  val avisotactoModel: MutableLiveData<AvisotactoModel> = MutableLiveData(AvisotactoModel())

  var navArguments: Bundle? = null
}
