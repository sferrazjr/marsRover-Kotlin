package com.sf9000.marsRover.business

import com.sf9000.marsRover.enums.PointingDirections
import com.sf9000.marsRover.model.Position
import java.util.stream.IntStream


class Rover private constructor() {
    var position: Position? = null
        private set

    val printablePosition: String
        get() = position!!.positionX.toString() + " " + position!!.positionY + " " + position!!.direction!!.directionLetter

    fun move(sequence: String) {


        sequence.chars().mapToObj { c -> c.toChar() }.forEach { moveAction ->

            moveOneAction(moveAction!!)

        }

    }

    private fun moveOneAction(moveAction: Char) {

        if (moveAction == 'M') {
            moveForward()
        }
        if (moveAction == 'R') {
            turnRight()
        }
        if (moveAction == 'L') {
            turnLeft()
        }

    }

    private fun turnRight() {

        if (position!!.direction!!.directionLetter == 'W') {
            position!!.direction = PointingDirections.NORTH
        } else {

            position!!.direction = PointingDirections.values()[getCurrentDirectionIndex()+1]

        }

    }

    private fun turnLeft() {

        if (position!!.direction!!.directionLetter == 'N') {
            position!!.direction = PointingDirections.WEST
        } else {

            position!!.direction = PointingDirections.values()[getCurrentDirectionIndex()-1]

        }

    }

    private fun getCurrentDirectionIndex(): Int {
        return IntStream.range(0, PointingDirections.values().size)
                .filter { index -> PointingDirections.values()[index].directionLetter == position!!.direction!!.directionLetter }
                .findFirst()
                .asInt
    }


    private fun moveForward() {

        if (position!!.direction == PointingDirections.NORTH) {
            position!!.positionYAddOne()
        }
        if (position!!.direction == PointingDirections.EAST) {
            position!!.positionXAddOne()
        }
        if (position!!.direction == PointingDirections.SOUTH) {
            position!!.positionYRemoveOne()
        }
        if (position!!.direction == PointingDirections.WEST) {
            position!!.positionXRemoveOne()
        }

    }

    companion object {

        fun create(startPosition: Position): Rover {
            val rover = Rover()
            rover.position = startPosition
            return rover
        }
    }
}
