package com.dpa.app.modules.avisoauditivo.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class AvisoauditivoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEscucha: String? = MyApp.getInstance().resources.getString(R.string.lbl_escucha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSusdatoshans: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sus_datos_han_s)

)
