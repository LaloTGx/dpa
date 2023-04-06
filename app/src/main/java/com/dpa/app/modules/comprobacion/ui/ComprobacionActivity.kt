package com.dpa.app.modules.comprobacion.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityComprobacionBinding
import com.dpa.app.modules.comprobacion.`data`.viewmodel.ComprobacionVM
import com.dpa.app.modules.crearresumen.ui.CrearResumenActivity
import com.dpa.app.modules.homeespecialista.ui.HomeEspecialistaActivity
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class ComprobacionActivity :
    BaseActivity<ActivityComprobacionBinding>(R.layout.activity_comprobacion) {
  private val viewModel: ComprobacionVM by viewModels<ComprobacionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.comprobacionVM = viewModel
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
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = HomeEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackiconssiete.setOnClickListener {
      val destIntent = CrearResumenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COMPROBACION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ComprobacionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
