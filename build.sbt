scalaVersion := "2.13.10"

enablePlugins(ScalaNativePlugin)

// set to Debug for compilation details (Info is default)
logLevel := Level.Info

// import to add Scala Native options
import scala.scalanative.build._

// defaults set with common options shown
nativeConfig ~= { c =>
  c.withLTO(LTO.none) // thin
    .withMode(Mode.debug) // releaseFast
    .withGC(GC.immix) // commix
}

libraryDependencies += "dev.zio" % "zio_native0.4_2.13" % "2.0.15"
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.4.0"
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time-tzdb" % "2.4.0"
