package com.dpa.app.modules.crearresumen.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class CrearResumenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPreguntas: String? = MyApp.getInstance().resources.getString(R.string.lbl_preguntas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAuditivo: String? = MyApp.getInstance().resources.getString(R.string.lbl_auditivo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVisual: String? = MyApp.getInstance().resources.getString(R.string.lbl_visual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTacto: String? = MyApp.getInstance().resources.getString(R.string.lbl_tacto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGusto: String? = MyApp.getInstance().resources.getString(R.string.lbl_gusto)
  ,
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

)
