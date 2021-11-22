package com.example.tp3_star.dataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tp3_star.dataBase.dao.*
import com.example.tp3_star.dataBase.entities.*

@Database(entities = [BusRoutes::class, Calendar::class, Stops::class, StopTimes::class, Trips::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun busRoutesDao() : BusRoutesDao
    abstract fun calendarDao() : CalendarDao
    abstract fun stopsDao() : StopsDao
    abstract fun stopTimesDao() : StopTimesDao
    abstract fun tripsDao() : TripsDao
}
