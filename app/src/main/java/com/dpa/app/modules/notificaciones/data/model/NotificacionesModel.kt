package com.dpa.app.modules.notificaciones.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class NotificacionesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJuanVillavalzo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_juan_villavalzo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDPASusistema: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dpa_su_sistema)

)
