package com.sf9000.marsRover

import com.sf9000.marsRover.business.Rover
import com.sf9000.marsRover.enums.PointingDirections
import com.sf9000.marsRover.enums.RoverActions
import com.sf9000.marsRover.model.Position
import org.junit.Before
import org.junit.Test

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat

class MoveForwardTest {


    private var positionNorth: Position? = null
    private var positionNorthAfterMove: Position? = null

    private var positionEast: Position? = null
    private var positionEastAfterMove: Position? = null

    private var positionSouth: Position? = null
    private var positionSouthAfterMove: Position? = null

    private var positionWest: Position? = null
    private var positionWestAfterMove: Position? = null


    @Before
    fun setUpPositions() {

        positionNorth = Position(3, 3, PointingDirections.NORTH)
        positionNorthAfterMove = Position(3, 4, PointingDirections.NORTH)

        positionEast = Position(3, 3, PointingDirections.EAST)
        positionEastAfterMove = Position(4, 3, PointingDirections.EAST)

        positionSouth = Position(3, 3, PointingDirections.SOUTH)
        positionSouthAfterMove = Position(3, 2, PointingDirections.SOUTH)

        positionWest = Position(3, 3, PointingDirections.WEST)
        positionWestAfterMove = Position(2, 3, PointingDirections.WEST)

    }

    @Test
    fun moveToAllDirection() {

        var rover = Rover.create(positionNorth!!)

        rover.move(RoverActions.MOVE_FORWARD.actionValue.toString())
        assertThat<Position>(rover.position, `is`<Position>(positionNorthAfterMove))

        rover = Rover.create(positionEast!!)
        rover.move(RoverActions.MOVE_FORWARD.actionValue.toString())
        assertThat<Position>(rover.position, `is`<Position>(positionEastAfterMove))

        rover = Rover.create(positionWest!!)
        rover.move(RoverActions.MOVE_FORWARD.actionValue.toString())
        assertThat<Position>(rover.position, `is`<Position>(positionWestAfterMove))

        rover = Rover.create(positionSouth!!)
        rover.move(RoverActions.MOVE_FORWARD.actionValue.toString())
        assertThat<Position>(rover.position, `is`<Position>(positionSouthAfterMove))

    }


}
