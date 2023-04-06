package com.dpa.app.modules.notificaciones.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.notificaciones.`data`.model.NotificacionesModel
import com.dpa.app.modules.notificaciones.`data`.model.NotificacionesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificacionesVM : ViewModel(), KoinComponent {
  val notificacionesModel: MutableLiveData<NotificacionesModel> =
      MutableLiveData(NotificacionesModel())

  var navArguments: Bundle? = null

  val notificacionesList: MutableLiveData<MutableList<NotificacionesRowModel>> =
      MutableLiveData(mutableListOf())
}
