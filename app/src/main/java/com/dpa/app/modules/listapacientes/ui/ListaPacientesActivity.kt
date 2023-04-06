package com.dpa.app.modules.listapacientes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityListaPacientesBinding
import com.dpa.app.modules.homeespecialista.ui.HomeEspecialistaActivity
import com.dpa.app.modules.listapacientes.`data`.viewmodel.ListaPacientesVM
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.String
import kotlin.Unit

class ListaPacientesActivity :
    BaseActivity<ActivityListaPacientesBinding>(R.layout.activity_lista_pacientes) {
  private val viewModel: ListaPacientesVM by viewModels<ListaPacientesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.listaPacientesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = HomeEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonOne.setOnClickListener {
      val destIntent = NotificacionesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonTwo.setOnClickListener {
      val destIntent = SocialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LISTA_PACIENTES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ListaPacientesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
