package com.hala.balancesheet.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2019-09-06
 */

@Entity
data class Transaction(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "type") val type: String?,
    @ColumnInfo(name = "transaction_amount") val transactionAmount: Int?,
    @ColumnInfo(name = "date") val date: Date?,
    @ColumnInfo(name = "purpose") val purpose: String?,
    @ColumnInfo(name = "item_info") val itemInfo: String?,
    @ColumnInfo(name = "payment_from") val paymentFrom: String?
)