import sbt._
import sbt.Keys._

object Epub4sBuild extends Build {

  lazy val epub4s = Project(
    id = "epub4s",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "epub4s",
      organization := "epub4s",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0",
      libraryDependencies ++= Seq(
        "com.github.nscala-time" %% "nscala-time" % "0.2.0",
        "org.scalatest" %% "scalatest" % "1.9.1" % "test"
      )
    )
  )
}
