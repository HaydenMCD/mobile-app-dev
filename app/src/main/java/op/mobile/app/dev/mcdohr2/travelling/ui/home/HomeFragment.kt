package op.mobile.app.dev.mcdohr2.travelling.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import op.mobile.app.dev.mcdohr2.travelling.IOnClickListener
import op.mobile.app.dev.mcdohr2.travelling.R
import op.mobile.app.dev.mcdohr2.travelling.ServiceAdapter
import op.mobile.app.dev.mcdohr2.travelling.databinding.FragmentHomeBinding

/**
 * Class displays the home fragment and handles the onClick event for routing to
 * settings, translation and map fragments
 */
class HomeFragment : Fragment(), IOnClickListener {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false
        )

        val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            homeViewModel = viewModel
            rvJobs.adapter = ServiceAdapter(this@HomeFragment)
            btnSettings.setOnClickListener {
                val action =
                    HomeFragmentDirections.actionHomeFragmentToSettingsFragment()
                findNavController().navigate(action)
            }

            btnTranslate.setOnClickListener {
                val action =
                    HomeFragmentDirections.actionHomeFragmentToTranslateFragment()
                findNavController().navigate(action)
            }
            return root
        }
    }

    /**
     * When a country is clicked this function is triggered.
     *
     * It routes to the map fragment with the location of each point of interest for that country.
     */
    override fun onItemClick(position: Int) {
        val item = binding.homeViewModel!!.response.value!![position]
        val action =
            HomeFragmentDirections.actionHomeFragmentToMapFragment(item.attractions.toTypedArray())
        findNavController().navigate(action)
    }
}
