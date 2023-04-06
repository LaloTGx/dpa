package com.dpa.app.modules.tacto.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class TactoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPuntaje: String? = MyApp.getInstance().resources.getString(R.string.lbl_puntaje)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_300)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_puntos_16)

)
