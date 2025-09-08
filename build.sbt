scalaVersion := "2.13.16"

val jsoniterVersion  = "2.37.10"
val scalatestVersion = "3.2.19"

libraryDependencies ++= Seq(
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core" % jsoniterVersion,
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % jsoniterVersion,
  "org.scalatest" %% "scalatest" % scalatestVersion
)
