package com.sf9000.marsRover.controller

import com.sf9000.marsRover.business.MarsMissionExecution
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.Reader
import java.util.ArrayList

/**
 * Created by sergio on 6/23/17.
 */
@RestController
@RequestMapping(value = "/marsRoverService")
class MarsRoverController {

    @RequestMapping(value = "/move", method = arrayOf(RequestMethod.POST))
    @Throws(IOException::class)
    fun move(@RequestPart("file") uploadedFile:MultipartFile):ResponseEntity<String> {

        var br:BufferedReader? = null

        br = BufferedReader(InputStreamReader(uploadedFile.inputStream))

        val mmi = MarsMissionExecution(br.readLines())

        return ResponseEntity(mmi.executeMission(), HttpStatus.OK)
    }

}
