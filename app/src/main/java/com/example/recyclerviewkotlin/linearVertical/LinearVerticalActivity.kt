package com.example.recyclerviewkotlin.linearVertical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewkotlin.databinding.ActivityLinearVerticalBinding
import com.example.recyclerviewkotlin.commons.Movie
import com.example.recyclerviewkotlin.linearVertical.MovieLinearVerticalAdapter
import com.example.recyclerviewkotlin.linearVertical.MovieOnClickListener

class LinearVerticalActivity : AppCompatActivity(), MovieOnClickListener {

    private lateinit var binding: ActivityLinearVerticalBinding

    private lateinit var adapterMovies: MovieLinearVerticalAdapter

    private val data = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearVerticalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initRecyclerView()
        initData()
    }

    private fun initRecyclerView() {
        adapterMovies = MovieLinearVerticalAdapter(data, this)
        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@LinearVerticalActivity)
            adapter = adapterMovies

        }
    }

    private fun initData() {
        val newData = getData()
        data.clear()
        data.addAll(newData)
        adapterMovies.notifyDataSetChanged()
    }

    override fun onClick(movie: Movie) {
        Toast.makeText(this, movie.toString(), Toast.LENGTH_LONG).show()
    }

    private fun getData(): List<Movie> {
        return listOf(
            Movie(
                url = "https://www.aceprensa.com/wp-content/uploads/2016/11/363676-0.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://media.filmelier.com/tit/69klfB/poster/los-croods-2-una-nueva-era_g4ThBII.jpeg",
                title = "Los Croods",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Era de Hielo",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://media.filmelier.com/tit/MMUHbS/poster/un-disfraz-para-nicolas_ZCTb9Cg.jpeg",
                title = "Un disfraz para nicolas",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://media.filmelier.com/images/filmes/cartaz/the-fast-and-the-furious73665.jpeg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://media.filmelier.com/tit/9613/poster/de-padres-e-hijos_RxEsz2U.jpeg",
                title = "De padres e Hijos",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/top_gun_maverick_93017.jpg",
                title = "Top Gun: Maverick",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/avatar_el_sentido_del_agua_93560.jpeg",
                title = "Avatar: El sentido del agua",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/uncharted_91788.jpeg",
                title = "Uncharted",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/the_batman_92011.jpg",
                title = "The Batman",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/morbius_92173.jpg",
                title = "Morbius",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/minions_el_origen_de_gru_93433.jpg",
                title = "Minions: El origen de Gru",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/muerte_en_el_nilo_91613.jpg",
                title = "Muerte en el Nilo",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/doctor_strange_en_el_multiverso_de_la_locura_93159.jpeg",
                title = "Doctor Strange en el multiverso de la locura",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/animales_fantasticos_los_secretos_de_dumbledore_92664.jpeg",
                title = "Animales fantásticos: Los secretos de Dumbledore",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/hotel_transilvania_transformania_91792.jpg",
                title = "Hotel Transilvania: Transformanía",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/thor_love_and_thunder_93712.jpg",
                title = "Thor: Love and Thunder",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/el_gato_con_botas_el_ultimo_deseo_92762.jpg",
                title = "El gato con botas: El último deseo",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/paws_of_fury_the_legend_of_hank_93186.jpg",
                title = "Un héroe samurái: La leyenda de Hank",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/red_92599.jpeg",
                title = "Red",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.aceprensa.com/wp-content/uploads/2016/11/363676-0.jpg",
                title = "Sully",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://media.filmelier.com/tit/69klfB/poster/los-croods-2-una-nueva-era_g4ThBII.jpeg",
                title = "Los Croods",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.themoviedb.org/t/p/w220_and_h330_face/iDah4ZcDX3F316LcLlmNNAzsRqF.jpg",
                title = "Era de Hielo",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://media.filmelier.com/tit/MMUHbS/poster/un-disfraz-para-nicolas_ZCTb9Cg.jpeg",
                title = "Un disfraz para nicolas",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://es.web.img3.acsta.net/c_310_420/pictures/14/05/28/11/24/435900.jpg",
                title = "Cars",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://media.filmelier.com/images/filmes/cartaz/the-fast-and-the-furious73665.jpeg",
                title = "Rapido y furioso",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://media.filmelier.com/tit/9613/poster/de-padres-e-hijos_RxEsz2U.jpeg",
                title = "De padres e Hijos",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/top_gun_maverick_93017.jpg",
                title = "Top Gun: Maverick",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/avatar_el_sentido_del_agua_93560.jpeg",
                title = "Avatar: El sentido del agua",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/uncharted_91788.jpeg",
                title = "Uncharted",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/the_batman_92011.jpg",
                title = "The Batman",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/morbius_92173.jpg",
                title = "Morbius",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/minions_el_origen_de_gru_93433.jpg",
                title = "Minions: El origen de Gru",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/muerte_en_el_nilo_91613.jpg",
                title = "Muerte en el Nilo",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/doctor_strange_en_el_multiverso_de_la_locura_93159.jpeg",
                title = "Doctor Strange en el multiverso de la locura",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/animales_fantasticos_los_secretos_de_dumbledore_92664.jpeg",
                title = "Animales fantásticos: Los secretos de Dumbledore",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/hotel_transilvania_transformania_91792.jpg",
                title = "Hotel Transilvania: Transformanía",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/thor_love_and_thunder_93712.jpg",
                title = "Thor: Love and Thunder",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/el_gato_con_botas_el_ultimo_deseo_92762.jpg",
                title = "El gato con botas: El último deseo",
                rating = 5.0F,
                type = "HD",
                year = 2020
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/paws_of_fury_the_legend_of_hank_93186.jpg",
                title = "Un héroe samurái: La leyenda de Hank",
                rating = 3.5F,
                type = "HD",
                year = 2010
            ),
            Movie(
                url = "https://www.elseptimoarte.net/carteles/341/red_92599.jpeg",
                title = "Red",
                rating = 1.0F,
                type = "Full HD",
                year = 2000
            )
        )
    }
}