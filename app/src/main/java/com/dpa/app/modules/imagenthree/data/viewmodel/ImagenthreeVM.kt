package com.dpa.app.modules.imagenthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.imagenthree.`data`.model.ImagenthreeModel
import org.koin.core.KoinComponent

class ImagenthreeVM : ViewModel(), KoinComponent {
  val imagenthreeModel: MutableLiveData<ImagenthreeModel> = MutableLiveData(ImagenthreeModel())

  var navArguments: Bundle? = null
}
