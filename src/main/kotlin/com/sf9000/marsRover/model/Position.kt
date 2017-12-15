package com.sf9000.marsRover.model

import com.sf9000.marsRover.enums.PointingDirections

import java.util.Objects

/**
 * Created by sergio on 6/18/17.
 */
class Position(positionX: Int, positionY: Int, var direction: PointingDirections?) {

    var positionX: Int = 0
        private set
    var positionY: Int = 0
        private set


    init {

        this.positionX = positionX
        this.positionY = positionY

    }

    override fun toString(): String {
        return "Position{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", direction=" + direction +
                '}'
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val position = o as Position?
        return positionX == position!!.positionX &&
                positionY == position.positionY &&
                direction === position.direction
    }

    override fun hashCode(): Int {
        return Objects.hash(positionX, positionY, direction)
    }

    fun positionYAddOne() {
        positionY++
    }

    fun positionXAddOne() {
        positionX++
    }

    fun positionYRemoveOne() {
        positionY--
    }

    fun positionXRemoveOne() {
        positionX--
    }
}
