package com.dpa.app.modules.homepaciente.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityHomePacienteBinding
import com.dpa.app.modules.auditivo.ui.AuditivoActivity
import com.dpa.app.modules.cuestionario.ui.CuestionarioActivity
import com.dpa.app.modules.gusto.ui.GustoActivity
import com.dpa.app.modules.homepaciente.`data`.viewmodel.HomePacienteVM
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.resultado.ui.ResultadoActivity
import com.dpa.app.modules.social.ui.SocialActivity
import com.dpa.app.modules.tacto.ui.TactoActivity
import com.dpa.app.modules.visual.ui.VisualActivity
import kotlin.String
import kotlin.Unit

class HomePacienteActivity :
    BaseActivity<ActivityHomePacienteBinding>(R.layout.activity_home_paciente) {
  private val viewModel: HomePacienteVM by viewModels<HomePacienteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homePacienteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSintomas.setOnClickListener {
      val destIntent = CuestionarioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnResultados.setOnClickListener {
      val destIntent = ResultadoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnIdentifica.setOnClickListener {
      val destIntent = GustoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnOprime.setOnClickListener {
      val destIntent = TactoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnVisualiza.setOnClickListener {
      val destIntent = VisualActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEscucha.setOnClickListener {
      val destIntent = AuditivoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonTwo.setOnClickListener {
      val destIntent = SocialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonOne.setOnClickListener {
      val destIntent = NotificacionesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_PACIENTE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePacienteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
