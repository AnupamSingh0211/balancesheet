package com.hala.balancesheet.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hala.balancesheet.entities.User
import com.hala.balancesheet.dao.UserDao


/**
 * @author Anupam Singh
 * @version 1.0
 * @since 2019-09-03
 */

@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}