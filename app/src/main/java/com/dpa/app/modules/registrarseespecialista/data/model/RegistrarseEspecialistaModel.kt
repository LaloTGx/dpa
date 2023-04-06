package com.dpa.app.modules.registrarseespecialista.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrarseEspecialistaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNombre: String? = MyApp.getInstance().resources.getString(R.string.lbl_nombre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApellido: String? = MyApp.getInstance().resources.getString(R.string.lbl_apellido)
  ,
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCedlaProfesio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ced_la_profesio)

)
