package com.dpa.app.modules.imagenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.imagenone.`data`.model.ImagenoneModel
import org.koin.core.KoinComponent

class ImagenoneVM : ViewModel(), KoinComponent {
  val imagenoneModel: MutableLiveData<ImagenoneModel> = MutableLiveData(ImagenoneModel())

  var navArguments: Bundle? = null
}
