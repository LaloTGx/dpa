package com.dpa.app.modules.listapacientes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.listapacientes.`data`.model.ListaPacientesModel
import org.koin.core.KoinComponent

class ListaPacientesVM : ViewModel(), KoinComponent {
  val listaPacientesModel: MutableLiveData<ListaPacientesModel> =
      MutableLiveData(ListaPacientesModel())

  var navArguments: Bundle? = null
}
