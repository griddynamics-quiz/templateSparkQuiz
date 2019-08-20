import sbt.Keys._
import sbt._
import sbtassembly.AssemblyPlugin.autoImport.{MergeStrategy, assembly, assemblyMergeStrategy}
import sbtassembly.PathList


object SettingsProject {

  implicit class projectCommon(project: Project) {
    def addCommonSettings = project.settings(commonSettings)

    def addcommonAssemblySettings = project.settings(commonAssemblySettings)
  }

  val compilerOptions = Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xlint",
    "-Yno-adapted-args",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture",
    "-language:existentials"
  )

  val commonSettings = Seq(
    organization := "com.griddynamics",
    scalacOptions := compilerOptions,
    scalaModuleInfo := scalaModuleInfo.value.map(_.withOverrideScalaVersion(true))

  )

  val commonAssemblySettings = Seq(
    assemblyMergeStrategy in assembly := {
      case PathList("javax", "inject", xs @ _*) => MergeStrategy.last
      case PathList("javax", "servlet", xs @ _*) => MergeStrategy.last
      case PathList("javax", "activation", xs @ _*) => MergeStrategy.last
      case PathList("org", "apache", xs @ _*) => MergeStrategy.last
      case "about.html" => MergeStrategy.rename
      case "META-INF/ECLIPSEF.RSA" => MergeStrategy.last
      case "META-INF/mailcap" => MergeStrategy.last
      case "META-INF/mimetypes.default" => MergeStrategy.last
      case "plugin.properties" => MergeStrategy.last
      case "log4j.properties" => MergeStrategy.last
      case PathList("META-INF", "services", xs@_ *) => MergeStrategy.concat
      case PathList("META-INF", xs@_ *) => MergeStrategy.discard
      case "reference.conf" => MergeStrategy.concat
      case x => MergeStrategy.first
    }
  )

  val projectSettings = Seq(
    mainClass in assembly := Some("com.griddynamics.quiz.Main")
  )
}
