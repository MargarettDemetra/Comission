import org.junit.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun testVisaCardNormal() {
        val cardType = "VISA"
        val amount = 10_000
        val amountMonth = 0

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(75, result)
    }

    @Test
    fun testVisaCardMin() {
        val cardType = "VISA"
        val amount = 1_000
        val amountMonth = 0

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(35, result)
    }

    @Test
    fun testWorldCardLimit() {
        val cardType = "МИР"
        val amount = 34_875
        val amountMonth = 643_000

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(-1, result)
    }

    @Test
    fun testWorldCardNormal() {
        val cardType = "МИР"
        val amount = 12_000
        val amountMonth = 0

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(90, result)
    }

    @Test
    fun testWorldCardMin() {
        val cardType = "МИР"
        val amount = 439
        val amountMonth = 0

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(35, result)
    }

    @Test
    fun testVisaCardLimit() {
        val cardType = "VISA"
        val amount = 10_000
        val amountMonth = 601_000

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(-1, result)
    }

    @Test
    fun testMasterCardNormal() {
        val cardType = "Mastercard"
        val amount = 2_000
        val amountMonth = 76_000

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(32, result)
    }

    @Test
    fun testMasterCardLimit() {
        val cardType = "Mastercard"
        val amount = 2_000
        val amountMonth = 601_000

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(-1, result)
    }

    @Test
    fun testMasterCardFirst() {
        val cardType = "Mastercard"
        val amount = 2_000
        val amountMonth = 0

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(0, result)
    }

    @Test
    fun testMaestroCardFirst() {
        val cardType = "Maestro"
        val amount = 2_000
        val amountMonth = 0

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(0, result)
    }

    @Test
    fun testMaestroCardLimit() {
        val cardType = "Maestro"
        val amount = 2_000
        val amountMonth = 601_000

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(-1, result)
    }

    @Test
    fun testMaestroCardNormal() {
        val cardType = "Maestro"
        val amount = 4_000
        val amountMonth = 76_000

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(44, result)
    }


    @Test
    fun testVKpay() {
        val cardType = "VKPay"
        val amount = 10_000
        val amountMonth = 0

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(0, result)
    }

    @Test
    fun testWrongCard() {
        val cardType = "VTB"
        val amount = 10_000
        val amountMonth = 0

        val result = comission(cardType = cardType, amount = amount, amountMonth = amountMonth)
        assertEquals(-2, result)
    }

}