package com.dpa.app.modules.avisoauditivo.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityAvisoauditivoBinding
import com.dpa.app.modules.avisoauditivo.`data`.viewmodel.AvisoauditivoVM
import kotlin.String
import kotlin.Unit

class AvisoauditivoActivity :
    BaseActivity<ActivityAvisoauditivoBinding>(R.layout.activity_avisoauditivo) {
  private val viewModel: AvisoauditivoVM by viewModels<AvisoauditivoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avisoauditivoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AVISOAUDITIVO_ACTIVITY"

  }
}
