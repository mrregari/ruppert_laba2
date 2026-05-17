package com.example.laba2.ui.listen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laba2.R
import com.example.laba2.data.Mood
import com.example.laba2.databinding.FragmentListenBinding
import com.example.laba2.recadapters.FeelRecycler

class ListenFragment : Fragment() {
    private var _binding: FragmentListenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentListenBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//        binding.recyclerView.adapter = FeelRecycler(listOf(
//            Mood("Calm", R.drawable.calm),
//            Mood("Happy", R.drawable.happy)
//        ))
    }
    override fun onDestroyView() { _binding = null; super.onDestroyView() }
}