package com.jshvarts.kmp

import kotlinx.coroutines.runBlocking

actual fun <T> runTest(block: suspend () -> T) { runBlocking { block() } }
