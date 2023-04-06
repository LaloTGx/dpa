package com.dpa.app.modules.avisodescarga.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityAvisodescargaBinding
import com.dpa.app.modules.avisodescarga.`data`.viewmodel.AvisodescargaVM
import kotlin.String
import kotlin.Unit

class AvisodescargaActivity :
    BaseActivity<ActivityAvisodescargaBinding>(R.layout.activity_avisodescarga) {
  private val viewModel: AvisodescargaVM by viewModels<AvisodescargaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avisodescargaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AVISODESCARGA_ACTIVITY"

  }
}
