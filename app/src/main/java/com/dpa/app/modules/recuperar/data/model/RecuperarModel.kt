package com.dpa.app.modules.recuperar.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class RecuperarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCorreoElectron: String? =
      MyApp.getInstance().resources.getString(R.string.msg_correo_electron)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCodigoRecibido: String? =
      MyApp.getInstance().resources.getString(R.string.msg_codigo_recibido)

)
