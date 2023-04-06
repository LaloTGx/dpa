package com.dpa.app.modules.imagensix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.imagensix.`data`.model.ImagensixModel
import org.koin.core.KoinComponent

class ImagensixVM : ViewModel(), KoinComponent {
  val imagensixModel: MutableLiveData<ImagensixModel> = MutableLiveData(ImagensixModel())

  var navArguments: Bundle? = null
}
