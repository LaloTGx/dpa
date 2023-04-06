package com.dpa.app.modules.avisovisual.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class AvisovisualModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVisualiza: String? = MyApp.getInstance().resources.getString(R.string.lbl_visualiza)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSusdatoshans: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sus_datos_han_s)

)
