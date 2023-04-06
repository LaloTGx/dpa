package com.dpa.app.modules.listapacientes.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class ListaPacientesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_juan_vi2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_marcos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_oscar_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_andrea)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_karem_m)

)
