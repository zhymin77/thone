organization := "com.example"

name := "thone"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
   "org.scala-lang" %% "scala-lang" % "2.9.2",
   "net.databinder" %% "unfiltered-netty-server" % "0.6.4",
   "net.databinder" %% "dispatch-nio" % "0.8.5",
   "org.clapper" %% "avsl" % "0.3.6",
   "net.databinder" %% "unfiltered-spec" % "0.6.4" % "test"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"
)
