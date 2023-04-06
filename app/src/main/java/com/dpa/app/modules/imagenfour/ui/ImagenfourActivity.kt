package com.dpa.app.modules.imagenfour.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityImagenfourBinding
import com.dpa.app.modules.imagenfour.`data`.viewmodel.ImagenfourVM
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class ImagenfourActivity : BaseActivity<ActivityImagenfourBinding>(R.layout.activity_imagenfour) {
  private val viewModel: ImagenfourVM by viewModels<ImagenfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.imagenfourVM = viewModel
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
  }

  companion object {
    const val TAG: String = "IMAGENFOUR_ACTIVITY"

  }
}
