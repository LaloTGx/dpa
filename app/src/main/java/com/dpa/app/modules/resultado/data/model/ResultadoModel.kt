package com.dpa.app.modules.resultado.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class ResultadoModel(
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
  var txtAnsiedadalta: String? = MyApp.getInstance().resources.getString(R.string.lbl_ansiedad_alta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_miedo_p_nico)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUltimaConsulta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ultima_consulta)

)
