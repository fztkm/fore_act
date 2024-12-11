package com.fztkm.fore_act.domain

import java.time.DayOfWeek
import java.time.Month


enum class RepeatType{
    DAILY,
    WEEKLY,
    MONTHLY,
    YEARLY;

    fun fromString(value: String): RepeatType{
        return when(value){
            "DAILY" -> DAILY
            "WEEKLY" -> WEEKLY
            "MONTHLY" -> MONTHLY
            "YEARLY" -> YEARLY
            else -> throw IllegalArgumentException("Invalid repeat type: $value")
        }
    }
}

data class NthDayOfWeek(
    val n: Int,
    val dayOfWeek: DayOfWeek,
)

data class DayOfMonth(
    val day: Int? = null,
    val nthDayOfWeek: NthDayOfWeek? = null,
)

data class WeeklyConfig(
    val dayOfWeek: Set<DayOfWeek>,
)

data class MonthlyConfig(
    val dayOfMonth: DayOfMonth,
)

data class YearlyConfig(
    val month: Month,
    val dayOfMonth: DayOfMonth,
)

data class TaskRepeat(
    val startDate: String,
    val endDate: String,
    val repeatType: RepeatType,
    val step: Int,
    val weeklyConfig: WeeklyConfig? = null,
    val monthlyConfig: MonthlyConfig? = null,
    val yearlyConfig: YearlyConfig? = null,
)