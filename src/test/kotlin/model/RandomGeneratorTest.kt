package model

import io.kotlintest.matchers.types.shouldNotBeNull
import org.junit.jupiter.api.Test

internal class RandomGeneratorTest {
    @Test
    fun `랜덤 숫자 생성`() {
        // given
        // when
        val actual = RandomGenerator.exec()
        // then
        actual.shouldNotBeNull()
    }
}