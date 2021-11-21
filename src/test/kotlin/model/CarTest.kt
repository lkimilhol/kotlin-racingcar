package model

import io.kotlintest.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("자동차 테스트")
internal class CarTest {
    @Test
    fun `자동차 생성`() {
        // given
        val car = Car(Positive.create(5), Name.create("car"))
        // when
        // then
        car.position shouldBe Positive.create(5)
        car.name shouldBe Name.create("car")
    }
}