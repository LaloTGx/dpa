package com.dpa.app.modules.avisosintomas.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class AvisosintomasModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSintomas: String? = MyApp.getInstance().resources.getString(R.string.lbl_sintomas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSusdatoshans: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sus_datos_han_s)

)
