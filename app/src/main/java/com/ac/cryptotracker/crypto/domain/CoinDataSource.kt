package com.ac.cryptotracker.crypto.domain

import com.ac.cryptotracker.core.domain.util.NetworkError
import com.ac.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}