package model

import exception.NegativeNumberException
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("자동차 위치로 사용될 양수 테스트")
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

    @Test
    fun `정상 생성 테스트`() {
        // given
        // when
        val expect = Positive.create(5)
        // then
        expect shouldBe Positive.create(5)
    }

    @Test
    fun `큰 값인지 비교`() {
        // given
        val positive = Positive.create(5)
        val target = Positive.create(4)
        // when
        val actual = positive.isGraterThan(target)
        // then
        actual shouldBe true
    }
}
