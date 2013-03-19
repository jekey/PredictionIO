import AssemblyKeys._

name := "PredictionIO-Process-ItemRec-Algorithms-Scala-Mahout-GenericUserBased"

version := "0.3-SNAPSHOT"

scalaVersion := "2.10.0"

parallelExecution in Test := false

libraryDependencies += "org.apache.mahout" % "mahout-core" % "0.7"

libraryDependencies += "com.github.scopt" %% "scopt" % "2.1.0"

libraryDependencies += "org.clapper" %% "grizzled-slf4j" % "1.0.1"

resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

resolvers += "Concurrent Maven Repo" at "http://conjars.org/repo"

resolvers += "Clojars Repository" at "http://clojars.org/repo"

assemblySettings

test in assembly := {}
