package com.dpa.app.modules.social.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class SocialModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtENLINEAJuan: String? = MyApp.getInstance().resources.getString(R.string.msg_en_linea_juan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHoladocestad: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hola_doc_esta_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtENLINEAKarem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_en_linea_karem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNecesitoqueme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_necesito_que_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_hace_3min_osca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOkdocvoypar: String? = MyApp.getInstance().resources.getString(R.string.msg_ok_doc_voy_par)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHACE1DIAAnd: String? = MyApp.getInstance().resources.getString(R.string.msg_hace_1_dia_and)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSimepodriaen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_si_me_podria_en)

)
