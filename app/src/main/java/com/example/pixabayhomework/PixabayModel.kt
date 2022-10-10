package com.example.pixabayhomework

data class PixabayModel(
    val hits: List<ImageModel>
)

data class ImageModel(
    val largeImageURL: String
)
