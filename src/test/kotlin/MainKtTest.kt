import org.junit.Assert.*
import org.junit.Test

class MainKtTest{
    @Test
    fun typeComissionMaestroMastercardComission() {
        val amount = 78000
        val type = "maestro"
        val prevAmount = 0
        val expectedComission = 48800

        val resultComission = (typeComission(type = type, amount = amount, prevAmount = prevAmount)).toInt()
        assertEquals(expectedComission, resultComission)
    }
    @Test
    fun typeComissionMaestroMastercardWithoutComission() {
        val amount = 60000
        val type = "masterCard"
        val prevAmount = 5000
        val expectedComission = 0

        val resultComission = (typeComission(type = type, amount = amount, prevAmount = prevAmount)).toInt()
        assertEquals(expectedComission, resultComission)
    }
    @Test
    fun typeComissionVisaMirLess35() {
        val amount = 1000
        val type = "visa"
        val prevAmount = 0
        val expectedComission = 3500

        val resultComission = (typeComission(type = type, amount = amount, prevAmount = prevAmount)).toInt()
        assertEquals(expectedComission, resultComission)
    }
    @Test
    fun typeComissionVisaMirMore35() {
        val amount = 10000
        val type = "mir"
        val prevAmount = 0
        val expectedComission = 7500

        val resultComission = (typeComission(type = type, amount = amount, prevAmount = prevAmount)).toInt()
        assertEquals(expectedComission, resultComission)
    }
    @Test
    fun typeComissionVkpay() {
        val amount = 10000
        val type = "vk pay"
        val prevAmount = 2000
        val expectedComission = 0

        val resultComission = (typeComission(type = type, amount = amount, prevAmount = prevAmount)).toInt()
        assertEquals(expectedComission, resultComission)
    }
}