package com.dpa.app.modules.avisodescarga.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class AvisodescargaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResultados: String? = MyApp.getInstance().resources.getString(R.string.lbl_resultados)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtElArchivohas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_el_archivo_ha_s)

)
