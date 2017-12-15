package com.sf9000.marsRover

import com.sf9000.marsRover.business.MarsMissionExecution
import com.sf9000.marsRover.utils.InputFileReader

import java.io.IOException

/**
 * Created by sergio on 6/18/17.
 */
object MarsRoverApp {

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {

        val inputs = InputFileReader.read(args[0])

        val mmi = MarsMissionExecution(inputs)

        println(mmi.executeMission())

    }

}


