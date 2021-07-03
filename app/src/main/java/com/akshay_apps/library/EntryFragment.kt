package com.akshay_apps.library

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.akshay_apps.library.databinding.FragmentEntryBinding


class EntryFragment : Fragment() {


    //Reference to FragmentEntryBinding
    private var _binding: FragmentEntryBinding? = null

    //get() means this property is "get-only". Means we can get the value,
    //but once assigned, we can't assign it to something else.
    private val binding get() = _binding!!

    //Property for recyclerview
    private lateinit var recyclerView: RecyclerView


    //To display options menu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


    //With fragments, the layout is inflated in onCreateView()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEntryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    fun guestExploration() {
        findNavController().navigate(R.id.action_entryFragment_to_genreFragment)
    }

    fun signUp() {
        Toast.makeText(requireActivity(), "Under Making, will complete soon!!!", Toast.LENGTH_SHORT).show()
    }


}