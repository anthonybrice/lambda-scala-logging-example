import org.slf4j.LoggerFactory

object Foobar:
  final val logger = LoggerFactory.getLogger("Main")

  @main
  def main(): Unit = {

    logger.info("Hello world!")
  }
