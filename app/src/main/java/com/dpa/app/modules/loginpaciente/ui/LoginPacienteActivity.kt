package com.dpa.app.modules.loginpaciente.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityLoginPacienteBinding
import com.dpa.app.modules.iniciarsesionpaciente.ui.IniciarSesionPacienteActivity
import com.dpa.app.modules.loginpaciente.`data`.viewmodel.LoginPacienteVM
import com.dpa.app.modules.registrarsepaciente.ui.RegistrarsePacienteActivity
import kotlin.String
import kotlin.Unit

class LoginPacienteActivity :
    BaseActivity<ActivityLoginPacienteBinding>(R.layout.activity_login_paciente) {
  private val viewModel: LoginPacienteVM by viewModels<LoginPacienteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPacienteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnIniciar.setOnClickListener {
      val destIntent = IniciarSesionPacienteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnRegistrarse.setOnClickListener {
      val destIntent = RegistrarsePacienteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_PACIENTE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginPacienteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
