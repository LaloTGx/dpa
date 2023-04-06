package com.dpa.app.modules.iniciarsesionpaciente.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class IniciarSesionPacienteModel(
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
