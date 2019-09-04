package com.hala.balancesheet.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.hala.balancesheet.entities.SystematicInvestmentPlan


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2019-09-03
 */

@Dao
interface SiPDao {
    @Query("SELECT * FROM systematicinvestmentplan")
    fun getAllSips(): LiveData<List<SystematicInvestmentPlan>>

    @Query("SELECT * FROM user WHERE uid IN (:sipIds)")
    fun loadAllByIds(sipIds: IntArray): List<SystematicInvestmentPlan>

    @Query(
        "SELECT * FROM systematicinvestmentplan WHERE folio_no LIKE :folioNo AND " +
                "fun_name LIKE :fundyName LIMIT 1"
    )
    fun findByName(folioNo: Long, fundName: String): SystematicInvestmentPlan

    @Insert
    fun insertAll(vararg systematicInvestmentPlan: SystematicInvestmentPlan)

    @Delete
    fun delete(systematicInvestmentPlan: SystematicInvestmentPlan)
}