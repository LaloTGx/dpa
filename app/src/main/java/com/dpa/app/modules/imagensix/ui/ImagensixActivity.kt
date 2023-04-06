package com.dpa.app.modules.imagensix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityImagensixBinding
import com.dpa.app.modules.imagensix.`data`.viewmodel.ImagensixVM
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class ImagensixActivity : BaseActivity<ActivityImagensixBinding>(R.layout.activity_imagensix) {
  private val viewModel: ImagensixVM by viewModels<ImagensixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.imagensixVM = viewModel
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
    const val TAG: String = "IMAGENSIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ImagensixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
