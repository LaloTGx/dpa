package com.dpa.app.modules.homeespecialista.`data`.model

import com.dpa.app.R
import com.dpa.app.appcomponents.di.MyApp
import kotlin.String

data class HomeEspecialistaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHometit: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
