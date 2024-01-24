package eltimn.ziohttpstring

import zio._
import zio.http._
import zio.http.template.Html

object MainApp extends ZIOAppDefault {

  val routes = Routes(
    Method.GET / "" -> handler(Response.html(Html.fromString("""<div class="container1 container2"><a href="http://zio.dev">ZIO Homepage</a></div>""")))
  )

  val app = routes.toHttpApp

  override def run = {
    Console.printLine("please visit http://localhost:8080") *>
    Server.serve(app).provide(Server.default)
  }
}
