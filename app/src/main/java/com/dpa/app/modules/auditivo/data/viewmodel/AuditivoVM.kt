package com.dpa.app.modules.auditivo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.auditivo.`data`.model.AuditivoModel
import org.koin.core.KoinComponent

class AuditivoVM : ViewModel(), KoinComponent {
  val auditivoModel: MutableLiveData<AuditivoModel> = MutableLiveData(AuditivoModel())

  var navArguments: Bundle? = null
}
