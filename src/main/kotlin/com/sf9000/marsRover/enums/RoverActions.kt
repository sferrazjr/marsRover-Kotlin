package com.sf9000.marsRover.enums

/**
 * Created by sergio on 6/18/17.
 */
enum class RoverActions private constructor(val actionValue: Char) {
    MOVE_FORWARD('M'),
    TURN_RIGHT('R'),
    TURN_LEFT('L')

}
