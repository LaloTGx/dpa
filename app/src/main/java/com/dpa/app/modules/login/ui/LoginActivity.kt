package com.dpa.app.modules.login.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityLoginBinding
import com.dpa.app.modules.login.`data`.viewmodel.LoginVM
import com.dpa.app.modules.loginespecialista.ui.LoginEspecialistaActivity
import com.dpa.app.modules.loginpaciente.ui.LoginPacienteActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPaciente.setOnClickListener {
      val destIntent = LoginPacienteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEspecialista.setOnClickListener {
      val destIntent = LoginEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"

  }
}
