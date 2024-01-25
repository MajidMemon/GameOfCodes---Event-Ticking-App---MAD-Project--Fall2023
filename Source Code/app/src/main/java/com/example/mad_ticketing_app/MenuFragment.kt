import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mad_ticketing_app.R

class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Enable options menu for this fragment
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // In this method, you typically inflate your fragment's layout,
        // but since this fragment doesn't have a layout, you can return null.
        return null
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        // Inflate the menu layout
        inflater.inflate(R.layout.menu_container, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle menu item clicks here
        when (item.itemId) {
            R.id.home -> {
                // Handle the home item click
                return true
            }
            R.id.events -> {
                // Handle the events item click
                return true
            }
            R.id.favorites -> {
                // Handle the favorites item click
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
