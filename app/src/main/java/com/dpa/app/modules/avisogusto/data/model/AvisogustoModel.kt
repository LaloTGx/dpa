package com.dpa.app.modules.avisogusto.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class AvisogustoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIdentifica: String? = MyApp.getInstance().resources.getString(R.string.lbl_identifica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSusdatoshans: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sus_datos_han_s)

)
