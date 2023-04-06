package com.dpa.app.modules.avisotacto.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class AvisotactoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOprime: String? = MyApp.getInstance().resources.getString(R.string.lbl_oprime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSusdatoshans: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sus_datos_han_s)

)
