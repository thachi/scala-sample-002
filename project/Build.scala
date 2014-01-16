import sbt._

object ScalaSample002Build extends Build {
  lazy val root = Project(
    id = "scala-sample-002",
    base = file(".")
  ) aggregate(project1, project2)

  lazy val project1 = Project(
    id = "scala-sample-002-1",
    base = file("project1")
  )

  lazy val project2 = Project(
    id = "scala-sample-002-2",
    base = file("project2")
  )
}
