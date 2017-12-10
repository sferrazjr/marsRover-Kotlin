package com.sf9000.marsRover.business

import com.sf9000.marsRover.enums.PointingDirections
import com.sf9000.marsRover.model.Plateau
import com.sf9000.marsRover.model.Position


class MarsMissionExecution(private val inputs: List<String>) {

    fun executeMission(): String {
        val plateauSize = inputs[0].split(" ".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()

        var startPosition = arrayOfNulls<String>(3)

        val plateau = Plateau(Integer.valueOf(plateauSize[0]), Integer.valueOf(plateauSize[1]))

        for (i in 1 until inputs.size) {

            if (i % 2 != 0) {
                startPosition = inputs[i].split(" ".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
            } else {

                val position = Position(
                        Integer.valueOf(startPosition[0]), Integer.valueOf(startPosition[1]), PointingDirections.POINTING_DIRECTION_LETTER_MAP[startPosition[2]?.get(0)])

                val rover = Rover.create(position)

                plateau.addRover(rover)

                rover.move(inputs[i])

            }
        }
        return plateau.positionOfAllRovers
    }

}
