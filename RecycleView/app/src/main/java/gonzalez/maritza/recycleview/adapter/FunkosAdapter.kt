package gonzalez.maritza.recycleview.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import lopez.pedro.recycleview.R
import lopez.pedro.recycleview.model.Funkos

class FunkosAdapter( private val ListaFunkos:ArrayList<Funkos>): RecyclerView.Adapter<FunkosAdapter.FunkosHolder>(){





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FunkosHolder {
        val vistaIndi = LayoutInflater.from(parent.context).inflate(R.layout.vista_individual,parent,false)
        return FunkosHolder(vistaIndi)
    }

    override fun onBindViewHolder(holder: FunkosAdapter.FunkosHolder, position: Int) {
        holder.tvNombre.text = ListaFunkos[position].nombre
        Picasso.get().load(ListaFunkos[position].foto).into(holder.ivFondo)
    }

    override fun getItemCount(): Int {
        return ListaFunkos.size
    }

    class FunkosHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val ivFondo:ImageView
        val tvNombre:TextView

        init {
            ivFondo = itemView.findViewById(R.id.ivFondo)
            tvNombre = itemView.findViewById(R.id.tvNombre)
        }
    }

}