package model

import exception.BlankStringException
import exception.InvalidCarNamesException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class GameTest {
    @Test
    fun `게임 플레이 실패 - 자동차 이름 공백`() {
        // given
        // when
        // then
        assertThrows<BlankStringException> { Game(" ", 5) }
    }

    @Test
    fun `게임 플레이 실패 - 자동차 이름이 비어있음`() {
        // given
        // when
        // then
        assertThrows<BlankStringException> { Game("", 5) }
    }

    @Test
    fun `게임 플레이 실패 - , 가 없음`() {
        // given
        // when
        // then
        assertThrows<InvalidCarNamesException> { Game("testnames", 5) }
    }
}