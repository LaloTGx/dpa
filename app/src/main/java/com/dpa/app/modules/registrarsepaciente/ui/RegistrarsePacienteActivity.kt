package com.dpa.app.modules.registrarsepaciente.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityRegistrarsePacienteBinding
import com.dpa.app.modules.iniciarsesionpaciente.ui.IniciarSesionPacienteActivity
import com.dpa.app.modules.registrarsepaciente.`data`.viewmodel.RegistrarsePacienteVM
import kotlin.String
import kotlin.Unit

class RegistrarsePacienteActivity :
    BaseActivity<ActivityRegistrarsePacienteBinding>(R.layout.activity_registrarse_paciente) {
  private val viewModel: RegistrarsePacienteVM by viewModels<RegistrarsePacienteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrarsePacienteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnIniciar.setOnClickListener {
      val destIntent = IniciarSesionPacienteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTRARSE_PACIENTE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrarsePacienteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
