name := "ODataUriParser"

version := "0.1"

scalaVersion := "2.11.7"

val MavenRepo    =   "Maven repository" at "http://repo1.maven.org/maven2/"
val JBossRepo    =   "JBoss repository" at "https://repository.jboss.org/nexus/content/groups/public/"

resolvers ++= Seq(MavenRepo, JBossRepo)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"
)

mainClass := Some("Main")
