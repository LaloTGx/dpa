package com.dpa.app.modules.resultadosgenerales.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class ResultadosGeneralesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTDAH: String? = MyApp.getInstance().resources.getString(R.string.lbl_tdah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTemperatura: String? = MyApp.getInstance().resources.getString(R.string.lbl_temperatura)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBPM: String? = MyApp.getInstance().resources.getString(R.string.lbl_bpm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPreocupacin: String? = MyApp.getInstance().resources.getString(R.string.lbl_preocupaci_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInquietud: String? = MyApp.getInstance().resources.getString(R.string.lbl_inquietud)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesguanse: String? = MyApp.getInstance().resources.getString(R.string.lbl_desguanse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_estadisticas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTemperaturaThirty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_temperatura_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInquietudForty: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_inquietud_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBPM60s: String? = MyApp.getInstance().resources.getString(R.string.lbl_bpm_60_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPreocupacionFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_preocupacion_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesguanseThirtyTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_desguanse_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTDAHOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tdah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDESCARGAR: String? = MyApp.getInstance().resources.getString(R.string.lbl_descargar)

)
