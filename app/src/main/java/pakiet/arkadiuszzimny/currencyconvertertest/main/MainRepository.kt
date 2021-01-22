package pakiet.arkadiuszzimny.currencyconvertertest.main

import pakiet.arkadiuszzimny.currencyconvertertest.data.models.CurrencyResponse
import pakiet.arkadiuszzimny.currencyconvertertest.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}