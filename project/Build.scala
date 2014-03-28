import sbt._
import sbt.Keys._

object ScalaSample002Build extends Build {

  lazy val projectSettings = Defaults.defaultSettings ++ Seq(
    organization := "com.xhachi.samples",
    version := "1.0",
    scalaVersion := "2.10.3",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.0" % "test"
    )
  )

  lazy val root = Project(
    id = "scala-sample-002",
    base = file("."),
    settings = projectSettings ++ Seq(
      name := "scala-sample-002"
    )
  ).dependsOn(project2)

  lazy val project1 = Project(
    id = "scala-sample-002-1",
    base = file("project1"),
    settings = projectSettings ++ Seq(
      name := "scala-sample-002-1"
    )
  )

  lazy val project2 = Project(
    id = "scala-sample-002-2",
    base = file("project2"),
    settings = projectSettings ++ Seq(
      name := "scala-sample-002-2"
    )
  ).dependsOn(project1)
}
