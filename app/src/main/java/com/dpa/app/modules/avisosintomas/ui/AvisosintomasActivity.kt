package com.dpa.app.modules.avisosintomas.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityAvisosintomasBinding
import com.dpa.app.modules.avisosintomas.`data`.viewmodel.AvisosintomasVM
import kotlin.String
import kotlin.Unit

class AvisosintomasActivity :
    BaseActivity<ActivityAvisosintomasBinding>(R.layout.activity_avisosintomas) {
  private val viewModel: AvisosintomasVM by viewModels<AvisosintomasVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avisosintomasVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AVISOSINTOMAS_ACTIVITY"

  }
}
