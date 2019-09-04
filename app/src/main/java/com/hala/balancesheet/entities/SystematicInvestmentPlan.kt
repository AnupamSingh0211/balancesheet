package com.hala.balancesheet.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2019-09-03
 */

@Entity
data class SystematicInvestmentPlan(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "folio_no") val folio_no: Long?,
    @ColumnInfo(name = "fund_name") val fundName: String?,
    @ColumnInfo(name = "sip_amount") val sip_amount: Date?,
    @ColumnInfo(name = "duration") val duration: Date?,
    @ColumnInfo(name = "startDate") val startDate: Long?,
    @ColumnInfo(name = "end_date") val endDate: String?,
    @ColumnInfo(name = "payment_type") val paymentType: Long?,
    @ColumnInfo(name = "current_value") val currentValue: Long?

)