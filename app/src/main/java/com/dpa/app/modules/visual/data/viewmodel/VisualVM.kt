package com.dpa.app.modules.visual.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.visual.`data`.model.VisualModel
import com.dpa.app.modules.visual.`data`.model.VisualRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VisualVM : ViewModel(), KoinComponent {
  val visualModel: MutableLiveData<VisualModel> = MutableLiveData(VisualModel())

  var navArguments: Bundle? = null

  val visualList: MutableLiveData<MutableList<VisualRowModel>> = MutableLiveData(mutableListOf())
}
