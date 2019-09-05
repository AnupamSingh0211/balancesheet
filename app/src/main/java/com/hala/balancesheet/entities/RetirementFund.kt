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
data class RetirementFund(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "policy_no") val policyNo: Long?,
    @ColumnInfo(name = "policy_name") val policyName: String?,
    @ColumnInfo(name = "start_date") val startDate: Date?,
    @ColumnInfo(name = "end_date") val endDate: Date?,
    @ColumnInfo(name = "premium_amount") val premiumAmount: Long?,
    @ColumnInfo(name = "payments_type") val paymentType: String?,
    @ColumnInfo(name = "maturity_amount") val maturityAmount: Long?,
    @ColumnInfo(name = "life_cover_value") val lifeCoverValue: Long?,
    @ColumnInfo(name = "tax_benefits") val taxBenefits: Long?
)