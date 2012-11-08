package com.example

import unfiltered.request._
import unfiltered.response._

import unfiltered.netty._

/** Asynchronous plan that gets the time in a ridiculous fashion.
 *  (But imagine that it's using a vital external HTTP service to
 *  inform its response--this is a fine way to do that.) */
object Time extends async.Plan
  with ServerErrorResponse {
  
  def intent = {
    case req @ GET(Path("/time")) => 
      req.respond(ResponseString("Hahahha, wo chenggongle"))
    case req @ POST(Path("/time")) =>
      // since we don't have to do any blocking IO for this request
      // we can call respond right way
      req.respond(ResponseString(new java.util.Date().toString))
  }
  def view(time: String) = {
    Html(
     <html><body>
       The current time is: { time }
     </body></html>
   )
  }
}
