package com.sf9000.marsRover.enums

import java.util.HashMap

enum class PointingDirections constructor(val directionLetter: Char) {
    NORTH('N'),
    EAST('E'),
    SOUTH('S'),
    WEST('W');

    companion object {

        val POINTING_DIRECTION_LETTER_MAP: MutableMap<Char, PointingDirections> = HashMap()

        init {

            for (pointingDirections in PointingDirections.values()) {
                POINTING_DIRECTION_LETTER_MAP.put(pointingDirections.directionLetter, pointingDirections)
            }
        }
    }


}
