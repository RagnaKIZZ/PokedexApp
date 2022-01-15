package com.amd.pokedexapp.data.remote.responses

import com.google.gson.annotations.SerializedName

data class Pokemon(

	@field:SerializedName("location_area_encounters")
	val locationAreaEncounters: String,

	@field:SerializedName("types")
	val types: List<TypesItem>,

	@field:SerializedName("base_experience")
	val baseExperience: Int,

	@field:SerializedName("held_items")
	val heldItems: List<Any>,

	@field:SerializedName("weight")
	val weight: Int,

	@field:SerializedName("is_default")
	val isDefault: Boolean,

	@field:SerializedName("past_types")
	val pastTypes: List<Any>,

	@field:SerializedName("sprites")
	val sprites: Sprites? = null,

	@field:SerializedName("abilities")
	val abilities: List<AbilitiesItem>,

	@field:SerializedName("game_indices")
	val gameIndices: List<GameIndicesItem>,

	@field:SerializedName("species")
	val species: Species,

	@field:SerializedName("stats")
	val stats: List<StatsItem>,

	@field:SerializedName("moves")
	val moves: List<MovesItem>,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("forms")
	val forms: List<FormsItem>,

	@field:SerializedName("height")
	val height: Int,

	@field:SerializedName("order")
	val order: Int
)

data class DiamondPearl(

	@field:SerializedName("back_shiny_female")
	val backShinyFemale: Any,

	@field:SerializedName("back_female")
	val backFemale: Any,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class Stat(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class Move(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class UltraSunUltraMoon(

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class Type(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class AbilitiesItem(

	@field:SerializedName("is_hidden")
	val isHidden: Boolean,

	@field:SerializedName("ability")
	val ability: Ability,

	@field:SerializedName("slot")
	val slot: Int
)

data class VersionGroup(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class TypesItem(

	@field:SerializedName("slot")
	val slot: Int,

	@field:SerializedName("type")
	val type: Type
)

data class GenerationVi(

	@field:SerializedName("omegaruby-alphasapphire")
	val omegarubyAlphasapphire: OmegarubyAlphasapphire,

	@field:SerializedName("x-y")
	val xY: XY
)

data class FireredLeafgreen(

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class Ability(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class DreamWorld(

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any
)

data class RubySapphire(

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class Animated(

	@field:SerializedName("back_shiny_female")
	val backShinyFemale: Any,

	@field:SerializedName("back_female")
	val backFemale: Any,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class OfficialArtwork(

	@field:SerializedName("front_default")
	val frontDefault: String
)

data class Crystal(

	@field:SerializedName("back_transparent")
	val backTransparent: String,

	@field:SerializedName("back_shiny_transparent")
	val backShinyTransparent: String,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_transparent")
	val frontTransparent: String,

	@field:SerializedName("front_shiny_transparent")
	val frontShinyTransparent: String,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class OmegarubyAlphasapphire(

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class StatsItem(

	@field:SerializedName("stat")
	val stat: Stat,

	@field:SerializedName("base_stat")
	val baseStat: Int,

	@field:SerializedName("effort")
	val effort: Int
)

data class Gold(

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_transparent")
	val frontTransparent: String,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class GenerationV(

	@field:SerializedName("black-white")
	val blackWhite: BlackWhite
)

data class HeartgoldSoulsilver(

	@field:SerializedName("back_shiny_female")
	val backShinyFemale: Any,

	@field:SerializedName("back_female")
	val backFemale: Any,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class GenerationIv(

	@field:SerializedName("platinum")
	val platinum: Platinum,

	@field:SerializedName("diamond-pearl")
	val diamondPearl: DiamondPearl,

	@field:SerializedName("heartgold-soulsilver")
	val heartgoldSoulsilver: HeartgoldSoulsilver
)

data class Icons(

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any
)

data class GenerationViii(

	@field:SerializedName("icons")
	val icons: Icons
)

data class Sprites(

	@field:SerializedName("back_shiny_female")
	val backShinyFemale: Any,

	@field:SerializedName("back_female")
	val backFemale: Any,

	@field:SerializedName("other")
	val other: Other,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("versions")
	val versions: Versions,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class MoveLearnMethod(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class FormsItem(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class Platinum(

	@field:SerializedName("back_shiny_female")
	val backShinyFemale: Any,

	@field:SerializedName("back_female")
	val backFemale: Any,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class Silver(

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_transparent")
	val frontTransparent: String,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class RedBlue(

	@field:SerializedName("front_gray")
	val frontGray: String,

	@field:SerializedName("back_transparent")
	val backTransparent: String,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("back_gray")
	val backGray: String,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_transparent")
	val frontTransparent: String
)

data class XY(

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class GameIndicesItem(

	@field:SerializedName("game_index")
	val gameIndex: Int,

	@field:SerializedName("version")
	val version: Version
)

data class Versions(

	@field:SerializedName("generation-iii")
	val generationIii: GenerationIii,

	@field:SerializedName("generation-ii")
	val generationIi: GenerationIi,

	@field:SerializedName("generation-v")
	val generationV: GenerationV,

	@field:SerializedName("generation-iv")
	val generationIv: GenerationIv,

	@field:SerializedName("generation-vii")
	val generationVii: GenerationVii,

	@field:SerializedName("generation-i")
	val generationI: GenerationI,

	@field:SerializedName("generation-viii")
	val generationViii: GenerationViii,

	@field:SerializedName("generation-vi")
	val generationVi: GenerationVi
)

data class Version(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class Emerald(

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class Species(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("url")
	val url: String
)

data class Other(

	@field:SerializedName("dream_world")
	val dreamWorld: DreamWorld,

	@field:SerializedName("official-artwork")
	val officialArtwork: OfficialArtwork,

	@field:SerializedName("home")
	val home: Home
)

data class GenerationVii(

	@field:SerializedName("icons")
	val icons: Icons,

	@field:SerializedName("ultra-sun-ultra-moon")
	val ultraSunUltraMoon: UltraSunUltraMoon
)

data class GenerationIii(

	@field:SerializedName("firered-leafgreen")
	val fireredLeafgreen: FireredLeafgreen,

	@field:SerializedName("ruby-sapphire")
	val rubySapphire: RubySapphire,

	@field:SerializedName("emerald")
	val emerald: Emerald
)

data class GenerationIi(

	@field:SerializedName("gold")
	val gold: Gold,

	@field:SerializedName("crystal")
	val crystal: Crystal,

	@field:SerializedName("silver")
	val silver: Silver
)

data class BlackWhite(

	@field:SerializedName("back_shiny_female")
	val backShinyFemale: Any,

	@field:SerializedName("back_female")
	val backFemale: Any,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("animated")
	val animated: Animated,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("back_shiny")
	val backShiny: String,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class Home(

	@field:SerializedName("front_shiny_female")
	val frontShinyFemale: Any,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_female")
	val frontFemale: Any,

	@field:SerializedName("front_shiny")
	val frontShiny: String
)

data class MovesItem(

	@field:SerializedName("version_group_details")
	val versionGroupDetails: List<VersionGroupDetailsItem>,

	@field:SerializedName("move")
	val move: Move
)

data class Yellow(

	@field:SerializedName("front_gray")
	val frontGray: String,

	@field:SerializedName("back_transparent")
	val backTransparent: String,

	@field:SerializedName("back_default")
	val backDefault: String,

	@field:SerializedName("back_gray")
	val backGray: String,

	@field:SerializedName("front_default")
	val frontDefault: String,

	@field:SerializedName("front_transparent")
	val frontTransparent: String
)

data class VersionGroupDetailsItem(

	@field:SerializedName("level_learned_at")
	val levelLearnedAt: Int,

	@field:SerializedName("version_group")
	val versionGroup: VersionGroup,

	@field:SerializedName("move_learn_method")
	val moveLearnMethod: MoveLearnMethod
)

data class GenerationI(

	@field:SerializedName("yellow")
	val yellow: Yellow,

	@field:SerializedName("red-blue")
	val redBlue: RedBlue
)
