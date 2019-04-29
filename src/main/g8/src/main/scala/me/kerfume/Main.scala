package me.kerfume

import scalaz.zio._
import scalaz.zio.console._

object Main extends App {
  def run(args: List[String]) =
    myAppLogic.fold(_ => 1, _ => 0)

  val myAppLogic =
    for {
      _ <- putStrLn("Hello! What is your name?")
      n <- getStrLn
      _ <- putStrLn("Hello, %s, welcome to ZIO!".format(n))
    } yield ()
}
