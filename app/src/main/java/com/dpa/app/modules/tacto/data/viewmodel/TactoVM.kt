package com.dpa.app.modules.tacto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.tacto.`data`.model.TactoModel
import org.koin.core.KoinComponent

class TactoVM : ViewModel(), KoinComponent {
  val tactoModel: MutableLiveData<TactoModel> = MutableLiveData(TactoModel())

  var navArguments: Bundle? = null
}
