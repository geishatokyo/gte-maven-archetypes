package com.geishatokyo.tradeclient

import com.geishatokyo.tradecore.msgpack.service.TradeInterface
import org.msgpack.ScalaMessagePack
import org.apache.log4j.PropertyConfigurator
import com.geishatokyo.scalamsgpack.client.{ClientContainer, MessagePackClient}

object App extends MessagePackClient[TradeInterface]("trade"){

  def main(args : Array[String]) : Unit = {
    ScalaMessagePack.init
    //Registration.register
    PropertyConfigurator.configure(getClass.getClassLoader.getResource("log4j.properties"))
    val container = new ClientContainer("trade")
    this.connect("localhost",12485)
    container.add(this)
    container.consoleLoop
  }

  protected def _help = """This message is shown for help"""

  /**
   * You can match console command.
   * Command is passed separated by space.
   * {{{
   * connect "hoge.geishatokyo.com with space" 1100
   *  -> List("connect","hoge.geishatokyo.com with space","1100")
   * }}}
   *
   */
  protected def _commandMatch = {
    case List("connect",host,port) => connect(host,port.toInt)
  }
}