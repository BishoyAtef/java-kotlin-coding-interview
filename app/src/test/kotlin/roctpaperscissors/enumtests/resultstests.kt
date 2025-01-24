package enumtests

import enums.RESULTS
import kotlin.test.Test
import kotlin.test.assertEquals

class RESULTSTest {
    @Test
    fun `enum RESULTS has three constants only WIN, LOSE, and DRAW`(){
        val results : Array<RESULTS> = RESULTS.values()
        assertEquals(3,results.size)
        assertEquals(RESULTS.WIN, results[0])
        assertEquals(RESULTS.LOSE, results[1])
        assertEquals(RESULTS.DRAW, results[2])
    }
}