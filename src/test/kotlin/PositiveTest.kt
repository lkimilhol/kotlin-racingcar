import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class PositiveTest {
    @Test
    fun `음수를 가지는 Positive는 생성 불가능 하다`() {
        // given
        // when
        // then
        assertThrows(RuntimeException::class.java) {
            Positive.create(-5)
        }
    }
}