ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "me.kerfume"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    trapExit := false,
    libraryDependencies ++= Seq(
      "org.scalaz" %% "scalaz-zio" % "1.0-RC4",
      "org.scalatest" %% "scalatest" % "3.0.5" % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
