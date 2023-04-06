package com.dpa.app.modules.iniciarsesionespecialista.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.iniciarsesionespecialista.`data`.model.IniciarSesionEspecialistaModel
import org.koin.core.KoinComponent

class IniciarSesionEspecialistaVM : ViewModel(), KoinComponent {
  val iniciarSesionEspecialistaModel: MutableLiveData<IniciarSesionEspecialistaModel> =
      MutableLiveData(IniciarSesionEspecialistaModel())

  var navArguments: Bundle? = null
}
