package com.sf9000.marsRover.enums

import java.util.HashMap

enum class PointingDirections constructor(val directionLetter: Char, val directionNumber: Int) {
    NORTH('N', 0),
    EAST('E', 1),
    SOUTH('S', 2),
    WEST('W', 3);

    companion object {

        val POINTING_DIRECTION_NUMBER_MAP: MutableMap<Int, PointingDirections> = HashMap()

        val POINTING_DIRECTION_LETTER_MAP: MutableMap<Char, PointingDirections> = HashMap()

        init {
            for (pointingDirections in PointingDirections.values()) {
                POINTING_DIRECTION_NUMBER_MAP.put(pointingDirections.directionNumber, pointingDirections)
            }

            for (pointingDirections in PointingDirections.values()) {
                POINTING_DIRECTION_LETTER_MAP.put(pointingDirections.directionLetter, pointingDirections)
            }
        }
    }


}
