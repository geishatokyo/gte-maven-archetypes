package com.geishatokyo.tradeserver

import org.apache.log4j.xml.DOMConfigurator
import com.geishatokyo.scalamsgpack.server.RunServer

/**
 * easily run server by
 * {{{
 * mvn exec:java
 * }}}
 */
object App{

  def main(args : Array[String]) : Unit = {
    DOMConfigurator.configure(getClass.getClassLoader.getResource("log4j.xml"))
    RunServer(null /* new HogeServer() */,args) // pass server instance
  }

}