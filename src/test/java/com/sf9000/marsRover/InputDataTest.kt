package com.sf9000.marsRover

import com.sf9000.marsRover.utils.InputFileReader
import org.junit.Test

import java.io.IOException

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat

/**
 * Created by sergio on 6/18/17.
 */
class InputDataTest {

    private val INPUT_DATA = "inputData/inputData.txt"

    @Test
    @Throws(IOException::class)
    fun inputDataTest() {

        val classLoader = this.javaClass.classLoader

        val inputs = InputFileReader.read(classLoader.getResource(INPUT_DATA)!!.file)

        assertThat(inputs[0], `is`("5 5"))
        assertThat(inputs[1], `is`("1 2 N"))
        assertThat(inputs[2], `is`("LMLMLMLMM"))
        assertThat(inputs[3], `is`("3 3 E"))
        assertThat(inputs[4], `is`("MMRMMRMRRM"))

    }


}
