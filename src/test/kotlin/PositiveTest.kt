import exception.NegativeNumberException
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("자동차 이름 테스트")
internal class PositiveTest {
    @Test
    fun `음수를 가지는 Positive는 생성 불가능 하다`() {
        // given
        // when
        // then
        assertThrows(NegativeNumberException::class.java) {
            Positive.create(-5)
        }
    }
}