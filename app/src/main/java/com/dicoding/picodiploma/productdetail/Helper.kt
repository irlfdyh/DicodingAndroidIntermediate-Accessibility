package com.dicoding.picodiploma.productdetail

import java.text.NumberFormat

fun String.withNumberFormat(): String {
    return NumberFormat.getNumberInstance().format(this.toDouble())
}