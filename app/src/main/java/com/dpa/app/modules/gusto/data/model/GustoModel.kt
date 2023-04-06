package com.dpa.app.modules.gusto.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class GustoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHapercibidoa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ha_percibido_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMetalico: String? = MyApp.getInstance().resources.getString(R.string.lbl_metalico)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmargo: String? = MyApp.getInstance().resources.getString(R.string.lbl_amargo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSinsabor: String? = MyApp.getInstance().resources.getString(R.string.lbl_sin_sabor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNingunodelas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ninguno_de_las)

)
