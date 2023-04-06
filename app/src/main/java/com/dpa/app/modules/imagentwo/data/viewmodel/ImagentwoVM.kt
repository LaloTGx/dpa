package com.dpa.app.modules.imagentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.imagentwo.`data`.model.ImagentwoModel
import org.koin.core.KoinComponent

class ImagentwoVM : ViewModel(), KoinComponent {
  val imagentwoModel: MutableLiveData<ImagentwoModel> = MutableLiveData(ImagentwoModel())

  var navArguments: Bundle? = null
}
