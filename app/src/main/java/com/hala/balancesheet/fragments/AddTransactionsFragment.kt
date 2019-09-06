package com.hala.balancesheet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hala.balancesheet.R


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2019-09-06
 */

class AddTransactionsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_transactions, container, false)
    }
}