package com.dpa.app.modules.social.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dpa.app.modules.social.`data`.model.SocialModel
import org.koin.core.KoinComponent

class SocialVM : ViewModel(), KoinComponent {
  val socialModel: MutableLiveData<SocialModel> = MutableLiveData(SocialModel())

  var navArguments: Bundle? = null
}
