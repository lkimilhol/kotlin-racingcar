package model

import io.kotlintest.matchers.numerics.shouldBeGreaterThan
import io.kotlintest.matchers.numerics.shouldBeLessThan
import org.junit.jupiter.api.Test

internal class RandomGeneratorTest {
    @Test
    fun `랜덤 숫자 생성`() {
        // given
        val expect = RandomGenerator.create()
        // when
        // then
        expect shouldBeGreaterThan 0
        expect shouldBeLessThan 15
    }
}