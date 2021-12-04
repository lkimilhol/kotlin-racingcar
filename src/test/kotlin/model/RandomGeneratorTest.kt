package model

import io.kotlintest.matchers.numerics.shouldBeGreaterThanOrEqual
import io.kotlintest.matchers.numerics.shouldBeLessThanOrEqual
import org.junit.jupiter.api.Test

internal class RandomGeneratorTest {
    @Test
    fun `랜덤 숫자 생성`() {
        // given
        val expect = RandomGenerator.exec()
        // when
        // then
        expect shouldBeGreaterThanOrEqual Car.MIN
        expect shouldBeLessThanOrEqual Car.MAX
    }
}