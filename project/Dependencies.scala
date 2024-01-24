import sbt._

object Dependencies {

  val zioVersion = "2.0.21"
  // val zioHttpVersion = "3.0.0-RC4"
  val zioHttpVersion = "3.0.0-RC4+56-5c9b8c71-SNAPSHOT"

  val zioHttp     = "dev.zio" %% "zio-http"     % zioHttpVersion

  val zioTest     = "dev.zio" %% "zio-test"     % zioVersion % Test
  val zioTestSBT = "dev.zio" %% "zio-test-sbt" % zioVersion % Test
  val zioTestMagnolia = "dev.zio" %% "zio-test-magnolia" % zioVersion % Test
}
