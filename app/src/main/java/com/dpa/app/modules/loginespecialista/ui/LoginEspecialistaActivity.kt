package com.dpa.app.modules.loginespecialista.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityLoginEspecialistaBinding
import com.dpa.app.modules.iniciarsesionespecialista.ui.IniciarSesionEspecialistaActivity
import com.dpa.app.modules.loginespecialista.`data`.viewmodel.LoginEspecialistaVM
import com.dpa.app.modules.registrarseespecialista.ui.RegistrarseEspecialistaActivity
import kotlin.String
import kotlin.Unit

class LoginEspecialistaActivity :
    BaseActivity<ActivityLoginEspecialistaBinding>(R.layout.activity_login_especialista) {
  private val viewModel: LoginEspecialistaVM by viewModels<LoginEspecialistaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginEspecialistaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnRegistrarse.setOnClickListener {
      val destIntent = RegistrarseEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnIniciar.setOnClickListener {
      val destIntent = IniciarSesionEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ESPECIALISTA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginEspecialistaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
