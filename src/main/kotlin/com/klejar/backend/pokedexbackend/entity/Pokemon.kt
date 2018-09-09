package com.klejar.backend.pokedexbackend.entity


import javax.persistence.*

/*
  {
    "abilities": [
      "Overgrow"
    ],
    "detailPageURL": "/us/pokedex/bulbasaur",
    "weight": 15.2,
    "weakness": [
      "Fire",
      "Flying",
      "Ice",
      "Psychic"
    ],
    "number": "001",
    "height": 28.0,
    "collectibles_slug": "bulbasaur",
    "featured": "true",
    "slug": "bulbasaur",
    "name": "Bulbasaur",
    "ThumbnailAltText": "Bulbasaur",
    "ThumbnailImage": "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png",
    "id": 1,
    "type": [
      "grass",
      "poison"
    ]
  },*/
@Entity
@Table(name = "pokemon")
class Pokemon(
        @Id
        @GeneratedValue
        val id: Long? = null,
        val abilities: Array<String>,
        val weight: Number,
        val weakness: Array<String>,
        val number: Number,
        val height: Number,
        val collectibles_slug:String,
        val featured: String,
        val slug: String,
        val name: String,
        val ThumbnailAltText: String,
        val ThumbnailImage: String,
        val type: Array<String>

        ) {


}
