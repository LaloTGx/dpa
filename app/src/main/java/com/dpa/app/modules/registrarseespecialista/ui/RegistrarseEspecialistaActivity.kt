package com.dpa.app.modules.registrarseespecialista.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityRegistrarseEspecialistaBinding
import com.dpa.app.modules.iniciarsesionespecialista.ui.IniciarSesionEspecialistaActivity
import com.dpa.app.modules.registrarseespecialista.`data`.viewmodel.RegistrarseEspecialistaVM
import kotlin.String
import kotlin.Unit

class RegistrarseEspecialistaActivity :
    BaseActivity<ActivityRegistrarseEspecialistaBinding>(R.layout.activity_registrarse_especialista)
    {
  private val viewModel: RegistrarseEspecialistaVM by viewModels<RegistrarseEspecialistaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrarseEspecialistaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnIniciar.setOnClickListener {
      val destIntent = IniciarSesionEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTRARSE_ESPECIALISTA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrarseEspecialistaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
