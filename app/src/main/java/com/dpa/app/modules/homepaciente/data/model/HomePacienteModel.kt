package com.dpa.app.modules.homepaciente.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class HomePacienteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHometitu: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
