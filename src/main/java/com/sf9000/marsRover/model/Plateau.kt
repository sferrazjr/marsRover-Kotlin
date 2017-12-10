package com.sf9000.marsRover.model

import com.sf9000.marsRover.business.Rover

import java.util.ArrayList
import java.util.stream.Collector
import java.util.stream.Collectors

/**
 * Created by sergio on 6/18/17.
 */
class Plateau(private val gridLimitX: Int, private val gridLimitY: Int) {

    private val rovers: MutableList<Rover>

    val positionOfAllRovers: String
        get() {
            return rovers.stream().map { rover -> rover.printablePosition }.toString()
        }

    init {

        rovers = ArrayList()
    }


    fun addRover(rover: Rover) {
        rovers.add(rover)
    }

    fun getRovers(): List<Rover> {
        return rovers
    }
}
