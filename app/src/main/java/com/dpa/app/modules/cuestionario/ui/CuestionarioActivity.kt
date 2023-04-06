package com.dpa.app.modules.cuestionario.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityCuestionarioBinding
import com.dpa.app.modules.cuestionario.`data`.viewmodel.CuestionarioVM
import com.dpa.app.modules.homepaciente.ui.HomePacienteActivity
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class CuestionarioActivity :
    BaseActivity<ActivityCuestionarioBinding>(R.layout.activity_cuestionario) {
  private val viewModel: CuestionarioVM by viewModels<CuestionarioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cuestionarioVM = viewModel
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
    const val TAG: String = "CUESTIONARIO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CuestionarioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
