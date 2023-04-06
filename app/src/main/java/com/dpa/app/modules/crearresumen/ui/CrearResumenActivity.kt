package com.dpa.app.modules.crearresumen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityCrearResumenBinding
import com.dpa.app.modules.crearresumen.`data`.viewmodel.CrearResumenVM
import com.dpa.app.modules.homeespecialista.ui.HomeEspecialistaActivity
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class CrearResumenActivity :
    BaseActivity<ActivityCrearResumenBinding>(R.layout.activity_crear_resumen) {
  private val viewModel: CrearResumenVM by viewModels<CrearResumenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.crearResumenVM = viewModel
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
  }

  companion object {
    const val TAG: String = "CREAR_RESUMEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CrearResumenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
