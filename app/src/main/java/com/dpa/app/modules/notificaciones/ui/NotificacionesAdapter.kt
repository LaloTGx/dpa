package com.dpa.app.modules.notificaciones.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dpa.app.R
import com.dpa.app.databinding.RowNotificacionesBinding
import com.dpa.app.modules.notificaciones.`data`.model.NotificacionesRowModel
import kotlin.Int
import kotlin.collections.List

class NotificacionesAdapter(
  var list: List<NotificacionesRowModel>
) : RecyclerView.Adapter<NotificacionesAdapter.RowNotificacionesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotificacionesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notificaciones,parent,false)
    return RowNotificacionesVH(view)
  }

  override fun onBindViewHolder(holder: RowNotificacionesVH, position: Int) {
    val notificacionesRowModel = NotificacionesRowModel()
    // TODO uncomment following line after integration with data source
    // val notificacionesRowModel = list[position]
    holder.binding.notificacionesRowModel = notificacionesRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NotificacionesRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: NotificacionesRowModel
    ) {
    }
  }

  inner class RowNotificacionesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNotificacionesBinding = RowNotificacionesBinding.bind(itemView)
  }
}
