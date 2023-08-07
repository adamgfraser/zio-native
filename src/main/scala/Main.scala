import zio._

object Main extends ZIOAppDefault {
  val run: ZIO[Any, Any, Any] =
    Console.printLine("Hello, world!")
}
