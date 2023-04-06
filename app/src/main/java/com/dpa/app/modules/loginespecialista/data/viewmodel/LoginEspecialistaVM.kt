package com.dpa.app.modules.loginespecialista.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.loginespecialista.`data`.model.LoginEspecialistaModel
import org.koin.core.KoinComponent

class LoginEspecialistaVM : ViewModel(), KoinComponent {
  val loginEspecialistaModel: MutableLiveData<LoginEspecialistaModel> =
      MutableLiveData(LoginEspecialistaModel())

  var navArguments: Bundle? = null
}
