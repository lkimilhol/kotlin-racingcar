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

    @Test
    fun `자동차 이동 테스트`() {
        // given
        val car = Car(Positive.create(0), Name.create("test"))
        // when
        car.move(Positive.create(Car.MAX))
        // then
        car.position shouldBe Positive.create(1)
    }
}