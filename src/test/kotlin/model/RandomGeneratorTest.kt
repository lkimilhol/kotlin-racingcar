package model

import io.kotlintest.matchers.numerics.shouldBeGreaterThanOrEqual
import io.kotlintest.matchers.numerics.shouldBeLessThanOrEqual
import org.junit.jupiter.api.Test

internal class RandomGeneratorTest {
    @Test
    fun `랜덤 숫자 생성`() {
        // given
        val expect = RandomGenerator.create()
        // when
        // then
        expect shouldBeGreaterThanOrEqual 0
        expect shouldBeLessThanOrEqual 9
    }
}