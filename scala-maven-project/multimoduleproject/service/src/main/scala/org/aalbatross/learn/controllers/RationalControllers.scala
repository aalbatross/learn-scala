package org.aalbatross.learn.controllers

import org.aalbatross.learn.Rational
import org.aalbatross.learn.model.BiOperationRequest
import org.springframework.web.bind.annotation.{
  GetMapping,
  PostMapping,
  RequestBody,
  RequestMapping,
  RestController
}

@RestController
@RequestMapping(path = Array("/"))
class RationalControllers {

  @PostMapping(path = Array("/add"))
  def add(@RequestBody biOperationRequest: BiOperationRequest): Rational = {
    return biOperationRequest.r1Param.+(biOperationRequest.r2Param)
  }

  @PostMapping(path = Array("/diff"))
  def diff(@RequestBody biOperationRequest: BiOperationRequest): Rational = {
    return biOperationRequest.r1Param.-(biOperationRequest.r2Param)
  }

  @GetMapping
  def greeting(): String = {
    return "Hello World welcome to scala services"
  }
}
