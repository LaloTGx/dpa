package com.dpa.app.modules.iniciarsesionespecialista.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class IniciarSesionEspecialistaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCorreoElectron: String? =
      MyApp.getInstance().resources.getString(R.string.msg_correo_electron)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContrasea: String? = MyApp.getInstance().resources.getString(R.string.lbl_contrase_a)

)
