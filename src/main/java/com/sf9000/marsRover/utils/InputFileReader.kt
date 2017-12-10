package com.sf9000.marsRover.utils

import java.nio.file.Files
import java.nio.file.Paths
import java.util.stream.Collectors.toList

object InputFileReader {

    fun read(fileName: String): List<String> {

        return Files.lines(Paths.get(fileName)).collect(toList())


    }

}
