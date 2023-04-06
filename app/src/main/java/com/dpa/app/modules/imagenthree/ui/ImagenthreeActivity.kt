package com.dpa.app.modules.imagenthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityImagenthreeBinding
import com.dpa.app.modules.imagenthree.`data`.viewmodel.ImagenthreeVM
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class ImagenthreeActivity : BaseActivity<ActivityImagenthreeBinding>(R.layout.activity_imagenthree)
    {
  private val viewModel: ImagenthreeVM by viewModels<ImagenthreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.imagenthreeVM = viewModel
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
    const val TAG: String = "IMAGENTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ImagenthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
