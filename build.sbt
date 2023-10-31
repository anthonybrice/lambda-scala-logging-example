
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "lanbda-scala-logging-example",
    libraryDependencies ++= Seq(
      "com.amazonaws" % "aws-lambda-java-core" % "1.2.2",
      "com.amazonaws" % "aws-lambda-java-log4j2" % "1.5.1",
      "org.apache.logging.log4j" % "log4j-api" % "2.17.1",
      "org.apache.logging.log4j" % "log4j-core" % "2.17.1",
      "org.apache.logging.log4j" % "log4j-slf4j18-impl" % "2.17.1",
    )
  )

ThisBuild / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
