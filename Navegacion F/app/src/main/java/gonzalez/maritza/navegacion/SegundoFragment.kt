package lopez.pedro.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class SegundoFragment : Fragment() {
   lateinit var btnB:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vistaB = inflater.inflate(R.layout.fragment_segundo, container, false)
        btnB = vistaB.findViewById(R.id.btn_B)
        btnB.setOnClickListener {
            findNavController().navigate(R.id.action_segundoFragment2_to_primerFragment22)
        }
        return vistaB
    }
}