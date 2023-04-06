package com.dpa.app.modules.resultado.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityResultadoBinding
import com.dpa.app.modules.homepaciente.ui.HomePacienteActivity
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.resultado.`data`.viewmodel.ResultadoVM
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class ResultadoActivity : BaseActivity<ActivityResultadoBinding>(R.layout.activity_resultado) {
  private val viewModel: ResultadoVM by viewModels<ResultadoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resultadoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = HomePacienteActivity.getIntent(this, null)
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
    const val TAG: String = "RESULTADO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResultadoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
