package com.dpa.app.modules.comprobacion.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class ComprobacionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreJuanVi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_juan_vi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNAcinco: String? = MyApp.getInstance().resources.getString(R.string.msg_nivel_de_ansied)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreMarcos: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_marcos2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNAcuatro: String? = MyApp.getInstance().resources.getString(R.string.msg_nivel_de_ansied)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreOscarF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_oscar_f2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNAtres: String? = MyApp.getInstance().resources.getString(R.string.msg_nivel_de_ansied)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreAndrea: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_andrea2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNAdos: String? = MyApp.getInstance().resources.getString(R.string.msg_nivel_de_ansied)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreKaremM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nombre_karem_m2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNAuno: String? = MyApp.getInstance().resources.getString(R.string.msg_nivel_de_ansied)

)
