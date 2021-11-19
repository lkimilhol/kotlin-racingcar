package model

import exception.EmptyNameException
import exception.TooLongNameException
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("자동차 이름 생성 테스트")
internal class NameTest {
    @Test
    fun `이름 생성은 빈 문자열 일 수 없다`() {
        // given
        // when
        // then
        assertThrows(EmptyNameException::class.java) {
            Name.create("")
        }
    }

    @Test
    fun `이름이 5글자를 넘길 수 없다`() {
        // given
        // when
        // then
        assertThrows(TooLongNameException::class.java) {
            Name.create("123456")
        }
    }

    @Test
    fun `이름 정상 생성`() {
        // given
        // when
        val expect = Name.create("test")
        // then
        expect shouldBe Name.create("test")
    }
}