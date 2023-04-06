package com.dpa.app.modules.avisoresultadosg.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityAvisoresultadosgBinding
import com.dpa.app.modules.avisoresultadosg.`data`.viewmodel.AvisoresultadosgVM
import kotlin.String
import kotlin.Unit

class AvisoresultadosgActivity :
    BaseActivity<ActivityAvisoresultadosgBinding>(R.layout.activity_avisoresultadosg) {
  private val viewModel: AvisoresultadosgVM by viewModels<AvisoresultadosgVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.avisoresultadosgVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AVISORESULTADOSG_ACTIVITY"

  }
}
