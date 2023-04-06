package com.dpa.app.modules.notificaciones.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class NotificacionesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOscarFloresSo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_oscar_flores_so)

)
