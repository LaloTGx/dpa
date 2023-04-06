package com.dpa.app.modules.imagenfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.imagenfive.`data`.model.ImagenfiveModel
import org.koin.core.KoinComponent

class ImagenfiveVM : ViewModel(), KoinComponent {
  val imagenfiveModel: MutableLiveData<ImagenfiveModel> = MutableLiveData(ImagenfiveModel())

  var navArguments: Bundle? = null
}
