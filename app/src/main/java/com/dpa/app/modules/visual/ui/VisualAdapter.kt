package com.dpa.app.modules.visual.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dpa.app.R
import com.dpa.app.databinding.RowVisualBinding
import com.dpa.app.modules.visual.`data`.model.VisualRowModel
import kotlin.Int
import kotlin.collections.List

class VisualAdapter(
  var list: List<VisualRowModel>
) : RecyclerView.Adapter<VisualAdapter.RowVisualVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowVisualVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_visual,parent,false)
    return RowVisualVH(view)
  }

  override fun onBindViewHolder(holder: RowVisualVH, position: Int) {
    val visualRowModel = VisualRowModel()
    // TODO uncomment following line after integration with data source
    // val visualRowModel = list[position]
    holder.binding.visualRowModel = visualRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<VisualRowModel>) {
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
      item: VisualRowModel
    ) {
    }
  }

  inner class RowVisualVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowVisualBinding = RowVisualBinding.bind(itemView)
  }
}
