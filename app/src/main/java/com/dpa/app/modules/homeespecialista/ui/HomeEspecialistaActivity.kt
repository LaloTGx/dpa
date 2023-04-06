package com.dpa.app.modules.homeespecialista.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityHomeEspecialistaBinding
import com.dpa.app.modules.comprobacion.ui.ComprobacionActivity
import com.dpa.app.modules.homeespecialista.`data`.viewmodel.HomeEspecialistaVM
import com.dpa.app.modules.listapacientes.ui.ListaPacientesActivity
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.resultadosgenerales.ui.ResultadosGeneralesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class HomeEspecialistaActivity :
    BaseActivity<ActivityHomeEspecialistaBinding>(R.layout.activity_home_especialista) {
  private val viewModel: HomeEspecialistaVM by viewModels<HomeEspecialistaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeEspecialistaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePolygonTwo.setOnClickListener {
      val destIntent = SocialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonOne.setOnClickListener {
      val destIntent = NotificacionesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnComprobacin.setOnClickListener {
      val destIntent = ComprobacionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnResultados.setOnClickListener {
      val destIntent = ResultadosGeneralesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnPacientes.setOnClickListener {
      val destIntent = ListaPacientesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ESPECIALISTA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeEspecialistaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
