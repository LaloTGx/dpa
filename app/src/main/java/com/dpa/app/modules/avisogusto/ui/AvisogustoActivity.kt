package com.dpa.app.modules.avisogusto.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityAvisogustoBinding
import com.dpa.app.modules.avisogusto.`data`.viewmodel.AvisogustoVM
import kotlin.String
import kotlin.Unit

class AvisogustoActivity : BaseActivity<ActivityAvisogustoBinding>(R.layout.activity_avisogusto) {
  private val viewModel: AvisogustoVM by viewModels<AvisogustoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avisogustoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AVISOGUSTO_ACTIVITY"

  }
}
