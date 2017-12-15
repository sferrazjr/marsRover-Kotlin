package com.sf9000.marsRover

import com.sf9000.marsRover.business.Rover
import com.sf9000.marsRover.enums.PointingDirections
import com.sf9000.marsRover.enums.RoverActions
import com.sf9000.marsRover.model.Position
import org.junit.Before
import org.junit.Test

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat

class TurnRightAndLeftTest {

    private var rover: Rover? = null

    private var positionNorth: Position? = null
    private var positionEast: Position? = null
    private var positionSouth: Position? = null
    private var positionWest: Position? = null

    @Before
    fun setUpPositions() {
        positionNorth = Position(0, 0, PointingDirections.NORTH)
        positionEast = Position(0, 0, PointingDirections.EAST)
        positionSouth = Position(0, 0, PointingDirections.SOUTH)
        positionWest = Position(0, 0, PointingDirections.WEST)

        rover = Rover.create(positionNorth!!)
    }

    @Test
    fun turnRightTest() {

        rover!!.move(RoverActions.TURN_RIGHT.actionValue.toString())
        assertThat<Position>(rover!!.position, `is`<Position>(positionEast))

        rover!!.move(RoverActions.TURN_RIGHT.actionValue.toString())
        assertThat<Position>(rover!!.position, `is`<Position>(positionSouth))

        rover!!.move(RoverActions.TURN_RIGHT.actionValue.toString())
        assertThat<Position>(rover!!.position, `is`<Position>(positionWest))

        rover!!.move(RoverActions.TURN_RIGHT.actionValue.toString())
        assertThat<Position>(rover!!.position, `is`<Position>(positionNorth))

    }

    @Test
    fun turnLeftTest() {

        rover!!.move(RoverActions.TURN_LEFT.actionValue.toString())
        assertThat<Position>(rover!!.position, `is`<Position>(positionWest))

        rover!!.move(RoverActions.TURN_LEFT.actionValue.toString())
        assertThat<Position>(rover!!.position, `is`<Position>(positionSouth))

        rover!!.move(RoverActions.TURN_LEFT.actionValue.toString())
        assertThat<Position>(rover!!.position, `is`<Position>(positionEast))

        rover!!.move(RoverActions.TURN_LEFT.actionValue.toString())
        assertThat<Position>(rover!!.position, `is`<Position>(positionNorth))

    }

}
