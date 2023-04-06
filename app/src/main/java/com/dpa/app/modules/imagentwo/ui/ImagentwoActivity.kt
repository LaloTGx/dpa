package com.dpa.app.modules.imagentwo.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityImagentwoBinding
import com.dpa.app.modules.imagentwo.`data`.viewmodel.ImagentwoVM
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class ImagentwoActivity : BaseActivity<ActivityImagentwoBinding>(R.layout.activity_imagentwo) {
  private val viewModel: ImagentwoVM by viewModels<ImagentwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.imagentwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePolygonOne.setOnClickListener {
      val destIntent = NotificacionesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonTwo.setOnClickListener {
      val destIntent = SocialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IMAGENTWO_ACTIVITY"

  }
}
