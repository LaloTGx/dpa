package com.dpa.app.modules.imagenfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.imagenfour.`data`.model.ImagenfourModel
import org.koin.core.KoinComponent

class ImagenfourVM : ViewModel(), KoinComponent {
  val imagenfourModel: MutableLiveData<ImagenfourModel> = MutableLiveData(ImagenfourModel())

  var navArguments: Bundle? = null
}
