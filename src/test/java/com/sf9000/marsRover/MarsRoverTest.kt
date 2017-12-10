package com.sf9000.marsRover


import com.sf9000.marsRover.business.Rover
import com.sf9000.marsRover.enums.PointingDirections
import com.sf9000.marsRover.model.Plateau
import com.sf9000.marsRover.model.Position
import org.junit.Before
import org.junit.Test

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat

/**
 * Created by sergio on 6/18/17.
 */
class MarsRoverTest {

    private val plateau = Plateau(5, 5)

    @Before
    fun setUpRover() {

        plateau.addRover(Rover.create(POSITION_01_START))

        plateau.addRover(Rover.create(POSITION_02_START))

    }


    @Test
    fun moves() {

        assertThat(plateau.getRovers().size, `is`(2))

        plateau.getRovers()[0].move(MOVE_SEQUENCE_01)

        assertThat<Position>(plateau.getRovers()[0].position, `is`(POSITION_01_FINISH))


        plateau.getRovers()[1].move(MOVE_SEQUENCE_02)

        assertThat<Position>(plateau.getRovers()[1].position, `is`(POSITION_02_FINISH))

    }

    companion object {

        private val POSITION_01_START = Position(1, 2, PointingDirections.NORTH)
        private val POSITION_01_FINISH = Position(1, 3, PointingDirections.NORTH)

        private val POSITION_02_START = Position(3, 3, PointingDirections.EAST)
        private val POSITION_02_FINISH = Position(5, 1, PointingDirections.EAST)

        private val MOVE_SEQUENCE_01 = "LMLMLMLMM"
        private val MOVE_SEQUENCE_02 = "MMRMMRMRRM"
    }


}
