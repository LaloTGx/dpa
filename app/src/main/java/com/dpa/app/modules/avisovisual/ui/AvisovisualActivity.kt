package com.dpa.app.modules.avisovisual.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityAvisovisualBinding
import com.dpa.app.modules.avisovisual.`data`.viewmodel.AvisovisualVM
import kotlin.String
import kotlin.Unit

class AvisovisualActivity : BaseActivity<ActivityAvisovisualBinding>(R.layout.activity_avisovisual)
    {
  private val viewModel: AvisovisualVM by viewModels<AvisovisualVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avisovisualVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AVISOVISUAL_ACTIVITY"

  }
}
