package com.dpa.app.modules.notificaciones.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityNotificacionesBinding
import com.dpa.app.modules.homeespecialista.ui.HomeEspecialistaActivity
import com.dpa.app.modules.notificaciones.`data`.model.NotificacionesRowModel
import com.dpa.app.modules.notificaciones.`data`.viewmodel.NotificacionesVM
import com.dpa.app.modules.social.ui.SocialActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificacionesActivity :
    BaseActivity<ActivityNotificacionesBinding>(R.layout.activity_notificaciones) {
  private val viewModel: NotificacionesVM by viewModels<NotificacionesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val notificacionesAdapter =
    NotificacionesAdapter(viewModel.notificacionesList.value?:mutableListOf())
    binding.recyclerNotificaciones.adapter = notificacionesAdapter
    notificacionesAdapter.setOnItemClickListener(
    object : NotificacionesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotificacionesRowModel) {
        onClickRecyclerNotificaciones(view, position, item)
      }
    }
    )
    viewModel.notificacionesList.observe(this) {
      notificacionesAdapter.updateData(it)
    }
    binding.notificacionesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = HomeEspecialistaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonTwo.setOnClickListener {
      val destIntent = SocialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerNotificaciones(
    view: View,
    position: Int,
    item: NotificacionesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICACIONES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificacionesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
