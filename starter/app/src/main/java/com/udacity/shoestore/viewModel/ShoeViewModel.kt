package com.udacity.shoestore.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//Use a LiveData field that returns the list of shoes

class ShoeViewModel:ViewModel() {
    var shoeName = MutableLiveData<String>()



}