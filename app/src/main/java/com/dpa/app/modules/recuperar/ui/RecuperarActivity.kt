package com.dpa.app.modules.recuperar.ui

import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityRecuperarBinding
import com.dpa.app.modules.recuperar.`data`.viewmodel.RecuperarVM
import kotlin.String
import kotlin.Unit

class RecuperarActivity : BaseActivity<ActivityRecuperarBinding>(R.layout.activity_recuperar) {
  private val viewModel: RecuperarVM by viewModels<RecuperarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recuperarVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RECUPERAR_ACTIVITY"

  }
}
