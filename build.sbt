name := """scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  cache,
  ws,
  "com.typesafe.play" % "play-slick_2.11" % "2.0.2",
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc4",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

