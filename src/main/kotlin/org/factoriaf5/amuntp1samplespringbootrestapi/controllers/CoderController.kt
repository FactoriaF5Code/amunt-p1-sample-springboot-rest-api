package org.factoriaf5.amuntp1samplespringbootrestapi.controllers

import org.factoriaf5.amuntp1samplespringbootrestapi.repositories.Coder
import org.factoriaf5.amuntp1samplespringbootrestapi.repositories.CoderRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
class CoderController(private val coderRepository: CoderRepository) {

    @GetMapping("/coders")
    fun allCoders(): List<Coder?>? {
        return coderRepository.findAll()
    }

    @GetMapping("/coders/{id}")
    fun findCoder(@PathVariable id: Long): Coder? {
        return coderRepository.findById(id).orElseThrow { CoderNotFoundException() }
    }

    @PostMapping("/coders")
    fun addCoder(@RequestBody coder: Coder): Coder? {
        return coderRepository.save(coder)
    }

    @DeleteMapping("/coders/{id}")
    fun deleteCoderById(@PathVariable id: Long): Coder? {
        val coder: Coder = coderRepository.findById(id).orElseThrow { CoderNotFoundException() }
        coderRepository.deleteById(id)
        return coder
    }

    @PutMapping("/coders")
    fun updateCoderById(@RequestBody coder: Coder): Coder? {
        coder.id?.let { coderRepository.findById(it).orElseThrow { CoderNotFoundException() } }
        return coderRepository.save(coder)
    }
}

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "coder not found")
class CoderNotFoundException : RuntimeException()