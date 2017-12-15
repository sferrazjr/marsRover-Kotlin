package com.sf9000.marsRover.controller

import com.sf9000.marsRover.business.MarsMissionExecution
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.Reader
import java.util.ArrayList

@RestController
@RequestMapping("/marsRoverService")
class MarsRoverController {

    @PostMapping("/move")
    fun move(@RequestPart("file") uploadedFile:MultipartFile):ResponseEntity<String> {

        val mmi = MarsMissionExecution(BufferedReader(InputStreamReader(uploadedFile.inputStream)).readLines())

        return ResponseEntity(mmi.executeMission(), HttpStatus.OK)
    }

}
