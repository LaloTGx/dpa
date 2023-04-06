package com.dpa.app.modules.homeespecialista.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.homeespecialista.`data`.model.HomeEspecialistaModel
import org.koin.core.KoinComponent

class HomeEspecialistaVM : ViewModel(), KoinComponent {
  val homeEspecialistaModel: MutableLiveData<HomeEspecialistaModel> =
      MutableLiveData(HomeEspecialistaModel())

  var navArguments: Bundle? = null
}
