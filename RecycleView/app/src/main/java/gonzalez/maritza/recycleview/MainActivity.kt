package gonzalez.maritza.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import lopez.pedro.recycleview.adapter.FunkosAdapter
import lopez.pedro.recycleview.model.Funkos

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaPersonaje = ArrayList<Funkos>()

        listaPersonaje.add(Funkos("Funko2", "https://i.pinimg.com/originals/8e/ac/ff/8eacff201ebfad84b0a47ccd84453729.jpg"))

        miRecycler = findViewById(R.id.recyclePersonaje)
        miRecycler.adapter = FunkosAdapter(listaPersonaje)
        miRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }
}