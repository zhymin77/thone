package com.example

/** embedded server */
object Server {
//  val http = new dispatch.nio.Http

  def main(args: Array[String]) {
    unfiltered.netty.Http(8080)
      .handler(Palindrome)
      .handler(Time)
      .run { s =>
        unfiltered.util.Browser.open(
          "http://127.0.0.1:%d/time".format(s.port))
      }
//    http.shutdown()
  }
}
