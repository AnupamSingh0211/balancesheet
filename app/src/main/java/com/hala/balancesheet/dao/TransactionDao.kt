package com.hala.balancesheet.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.hala.balancesheet.entities.InsurancePlan
import com.hala.balancesheet.entities.Transaction


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2019-09-03
 */

@Dao
interface TransactionDao {
    @Query("SELECT * FROM `transaction`")
    fun getAllTransactions(): LiveData<List<Transaction>>

    @Query(
        "SELECT * FROM transaction WHERE type LIKE :type AND " +
                "amount LIKE :transaction_amount LIMIT 1"
    )
    fun findByName(type: String, amount: Int): InsurancePlan

    @Insert
    fun insertAll(vararg transaction: Transaction)

    @Delete
    fun delete(transaction: Transaction)
}