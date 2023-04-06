package com.dpa.app.modules.visual.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dpa.app.R
import com.dpa.app.appcomponents.base.BaseActivity
import com.dpa.app.databinding.ActivityVisualBinding
import com.dpa.app.modules.homepaciente.ui.HomePacienteActivity
import com.dpa.app.modules.imagenfive.ui.ImagenfiveActivity
import com.dpa.app.modules.imagenone.ui.ImagenoneActivity
import com.dpa.app.modules.imagensix.ui.ImagensixActivity
import com.dpa.app.modules.imagenthree.ui.ImagenthreeActivity
import com.dpa.app.modules.notificaciones.ui.NotificacionesActivity
import com.dpa.app.modules.social.ui.SocialActivity
import com.dpa.app.modules.visual.`data`.model.VisualRowModel
import com.dpa.app.modules.visual.`data`.viewmodel.VisualVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VisualActivity : BaseActivity<ActivityVisualBinding>(R.layout.activity_visual) {
  private val viewModel: VisualVM by viewModels<VisualVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val visualAdapter = VisualAdapter(viewModel.visualList.value?:mutableListOf())
    binding.recyclerVisual.adapter = visualAdapter
    visualAdapter.setOnItemClickListener(
    object : VisualAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : VisualRowModel) {
        onClickRecyclerVisual(view, position, item)
      }
    }
    )
    viewModel.visualList.observe(this) {
      visualAdapter.updateData(it)
    }
    binding.visualVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = HomePacienteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonOne.setOnClickListener {
      val destIntent = NotificacionesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMostrarFive.setOnClickListener {
      val destIntent = ImagenoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMostrarFour.setOnClickListener {
      val destIntent = ImagenthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMostrarThree.setOnClickListener {
      val destIntent = ImagenfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMostrarTwo.setOnClickListener {
      val destIntent = ImagensixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imagePolygonTwo.setOnClickListener {
      val destIntent = SocialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerVisual(
    view: View,
    position: Int,
    item: VisualRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VISUAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VisualActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
