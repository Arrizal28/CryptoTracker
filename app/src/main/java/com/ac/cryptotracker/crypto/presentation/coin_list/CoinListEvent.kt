package com.ac.cryptotracker.crypto.presentation.coin_list

import com.ac.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}