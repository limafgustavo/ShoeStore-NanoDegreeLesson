package com.udacity.shoestore.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//Use a LiveData field that returns the list of shoes

class ShoeViewModel : ViewModel() {
    var shoeName = MutableLiveData<String>()

    private lateinit var shoeNameList: MutableList<String>

    init {
        shoeNameList = mutableListOf(
            "Adidas Ultraboost",
            "Nike Air Max 270",
            "Puma RS-X",
            "Reebok Classic Leather",
            "New Balance Fresh Foam Cruz",
            "Converse Chuck Taylor All Star",
            "Vans Old Skool",
            "Asics Gel-Kayano 27",
            "Under Armour HOVR Phantom",
            "Skechers Memory Foam Flex Appeal",
            "Fila Disruptor II",
            "Mizuno Wave Rider",
            "Brooks Ghost 13",
            "Salomon Speedcross 5",
            "Merrell Moab 2 Waterproof"
        )
    }
    fun getShoeList():List<String>{
        return shoeNameList
    }


}