package com.dpa.app.modules.iniciarsesionespecialista.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityIniciarSesionEspecialistaBinding
import com.dpa.app.modules.homeespecialista.ui.HomeEspecialistaActivity
import com.dpa.app.modules.iniciarsesionespecialista.`data`.viewmodel.IniciarSesionEspecialistaVM
import com.dpa.app.modules.registrarseespecialista.ui.RegistrarseEspecialistaActivity
import kotlin.String
import kotlin.Unit

class IniciarSesionEspecialistaActivity :
    BaseActivity<ActivityIniciarSesionEspecialistaBinding>(R.layout.activity_iniciar_sesion_especialista)
    {
  private val viewModel: IniciarSesionEspecialistaVM by viewModels<IniciarSesionEspecialistaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iniciarSesionEspecialistaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameIniciarSesion.setOnClickListener {
      val destIntent = RegistrarseEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnIniciar.setOnClickListener {
      val destIntent = HomeEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INICIAR_SESION_ESPECIALISTA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IniciarSesionEspecialistaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
