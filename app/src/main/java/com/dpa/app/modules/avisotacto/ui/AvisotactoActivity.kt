package com.dpa.app.modules.avisotacto.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityAvisotactoBinding
import com.dpa.app.modules.avisotacto.`data`.viewmodel.AvisotactoVM
import kotlin.String
import kotlin.Unit

class AvisotactoActivity : BaseActivity<ActivityAvisotactoBinding>(R.layout.activity_avisotacto) {
  private val viewModel: AvisotactoVM by viewModels<AvisotactoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avisotactoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AVISOTACTO_ACTIVITY"

  }
}
