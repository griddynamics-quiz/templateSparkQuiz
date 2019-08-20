name := "quized-project"

version := "0.1"

scalaVersion := "2.11.12"


import Dependencies._
import SettingsProject._

lazy val quiz_loader = (project in file("."))
  .addCommonSettings
  .addcommonAssemblySettings
  .settings(
    version := "0.2",
    scalaVersion := VersionsCommon.projectScalaVersion,
    libraryDependencies ++= quizDependencies
  )
  .settings(projectSettings)