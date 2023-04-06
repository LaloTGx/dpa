package com.dpa.app.modules.resultadosgenerales.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityResultadosGeneralesBinding
import com.dpa.app.modules.homeespecialista.ui.HomeEspecialistaActivity
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.resultadosgenerales.`data`.viewmodel.ResultadosGeneralesVM
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class ResultadosGeneralesActivity :
    BaseActivity<ActivityResultadosGeneralesBinding>(R.layout.activity_resultados_generales) {
  private val viewModel: ResultadosGeneralesVM by viewModels<ResultadosGeneralesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resultadosGeneralesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = HomeEspecialistaActivity.getIntent(this, null)
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
    binding.linearRowdescargar.setOnClickListener {
      val destIntent = HomeEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RESULTADOS_GENERALES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResultadosGeneralesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
