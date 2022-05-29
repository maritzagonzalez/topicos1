package gonzalez.maritza.volley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val queue = Volley.newRequestQueue(this)
        val url = "https://es-la.facebook.com/"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                Log.d("tag",response.substring(0, 500))
            },
            Response.ErrorListener { Log.d  ("tag","error" )})

        // Add the request to the RequestQueue.
        queue.add(stringRequest)
    }
}