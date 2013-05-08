/*
 * Copyright (c) 2012-2013 SnowPlow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
import sbt._

object Dependencies {
  
  val resolutionRepos = Seq(
    // Required for our Scalaz snapshot
    "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/releases/",
     // For some misc Scalding and Twitter libs
    "Concurrent Maven Repo" at "http://conjars.org/repo",
    // For scala-util and referer-parser
    "SnowPlow Analytics Maven repo" at "http://maven.snplow.com/releases/"
  )

  object V {
    // Java
    val http          = "4.1.1"
    val commonsLang   = "3.1"
    val commonsCodec  = "1.7"
    val yodaTime      = "2.1"
    val yodaConvert   = "1.2"
    // Scala
    val scalding      = "0.8.4"
    val scalaz7       = "7.0.0-M9" // -> "7.0.0" when released
    val argonaut      = "6.0-M7"   // -> "6.0" when released
    val scalaUtil     = "0.1.0"
    val refererParser = "0.1.0-M6" // -> "0.1.0" when released
    // Scala (test only)
    val specs2        = "1.12.3"   // -> "1.13" when we bump to Scala 2.10.0
    val scalazSpecs2  = "0.1.2"
    val scalaCheck    = "1.10.0"
    // val useragent  = "1.6" No Maven repo, so user-agent-utils is an unmanaged lib
  }

  object Libraries {
    // Java
    val httpClient    = "org.apache.httpcomponents"  %  "httpclient"          % V.http
    val commonsLang   = "org.apache.commons"         %  "commons-lang3"       % V.commonsLang
    val commonsCodec  = "commons-codec"              % "commons-codec"        % V.commonsCodec
    val yodaTime      = "joda-time"                  %  "joda-time"           % V.yodaTime
    val yodaConvert   = "org.joda"                   %  "joda-convert"        % V.yodaConvert
    
    // Scala
    val scaldingCore  = "com.twitter"                %% "scalding-core"       % V.scalding
    val scaldingArgs  = "com.twitter"                %% "scalding-args"       % V.scalding
    val scalaz7       = "org.scalaz"                 %% "scalaz-core"         % V.scalaz7
    val argonaut      = "io.argonaut"                %% "argonaut"            % V.argonaut
    val scalaUtil     = "com.snowplowanalytics"      %  "scala-util"          % V.scalaUtil
    val refererParser = "com.snowplowanalytics"      %  "referer-parser"      % V.refererParser
    // Scala (test only)
    val specs2        = "org.specs2"                 %% "specs2"              % V.specs2       % "test"
    val scalazSpecs2  = "org.typelevel"              %% "scalaz-specs2"       % V.scalazSpecs2 % "test"
    val scalaCheck    = "org.scalacheck"             %% "scalacheck"          % V.scalaCheck   % "test"
  }
}