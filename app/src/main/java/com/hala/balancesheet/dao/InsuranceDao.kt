package com.hala.balancesheet.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.hala.balancesheet.entities.InsurancePlan


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2019-09-03
 */

@Dao
interface InsuranceDao {
    @Query("SELECT * FROM insuranceplan")
    fun getAllInsurances(): LiveData<List<InsurancePlan>>

    @Query("SELECT * FROM user WHERE uid IN (:insuranceIds)")
    fun loadAllByIds(insuranceIds: IntArray): List<InsurancePlan>

    @Query(
        "SELECT * FROM insuranceplan WHERE policy_no LIKE :policyNo AND " +
                "policy_name LIKE :policyName LIMIT 1"
    )
    fun findByName(policyNo: Long, policyName: String): InsurancePlan

    @Insert
    fun insertAll(vararg insurancePlans: InsurancePlan)

    @Delete
    fun delete(insurancePlan: InsurancePlan)
}