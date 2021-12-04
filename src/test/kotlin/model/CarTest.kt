package model

import io.kotlintest.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("자동차 테스트")
internal class CarTest {
    @Test
    fun `자동차 생성 범위 테스트`() {
        // given
        // when
        // then
        Car.MIN shouldBe 0
        Car.MAX shouldBe 9
    }
}