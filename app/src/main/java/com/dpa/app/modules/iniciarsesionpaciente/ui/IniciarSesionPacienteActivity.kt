package com.dpa.app.modules.iniciarsesionpaciente.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityIniciarSesionPacienteBinding
import com.dpa.app.modules.homepaciente.ui.HomePacienteActivity
import com.dpa.app.modules.iniciarsesionpaciente.`data`.viewmodel.IniciarSesionPacienteVM
import com.dpa.app.modules.registrarsepaciente.ui.RegistrarsePacienteActivity
import kotlin.String
import kotlin.Unit

class IniciarSesionPacienteActivity :
    BaseActivity<ActivityIniciarSesionPacienteBinding>(R.layout.activity_iniciar_sesion_paciente) {
  private val viewModel: IniciarSesionPacienteVM by viewModels<IniciarSesionPacienteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iniciarSesionPacienteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnIniciar.setOnClickListener {
      val destIntent = HomePacienteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnRegistrarse.setOnClickListener {
      val destIntent = RegistrarsePacienteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INICIAR_SESION_PACIENTE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IniciarSesionPacienteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
