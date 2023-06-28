package com.hellcorp.shoppinglist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hellcorp_studio.shoppinglist.R
import com.hellcorp_studio.shoppinglist.databinding.FragmentNoteBinding
import com.hellcorp_studio.shoppinglist.databinding.NoteListItemBinding

class NoteFragment : BaseFragment() {

    private lateinit var binding: FragmentNoteBinding
    override fun onClickNew() {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = NoteFragment()
    }
}