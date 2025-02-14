package com.ipritdev.uangbul.utils

import java.text.NumberFormat
import java.util.Calendar
import java.util.Locale

fun Calendar.setBudgetedAt(year: Int, month: Int) {
    this.set(Calendar.YEAR, year)
    this.set(Calendar.MONTH, month)
    this.set(Calendar.DATE, 1)
    this.set(Calendar.HOUR_OF_DAY, 0)
    this.set(Calendar.MINUTE, 0)
    this.set(Calendar.SECOND, 0)
    this.set(Calendar.MILLISECOND, 0)
}

fun Calendar.setExpensedAt(
    year: Int,
    month: Int,
    date: Int,
    hour: Int,
    minute: Int,
    second: Int
) {
    this.set(Calendar.YEAR, year)
    this.set(Calendar.MONTH, month)
    this.set(Calendar.DATE, date)
    this.set(Calendar.HOUR_OF_DAY, hour)
    this.set(Calendar.MINUTE, minute)
    this.set(Calendar.SECOND, second)
    this.set(Calendar.MILLISECOND, 0)
}

fun Long.toIDR(): String = NumberFormat.getCurrencyInstance(
    Locale("in", "ID")
).format(this)
