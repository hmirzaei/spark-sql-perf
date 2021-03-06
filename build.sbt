// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.10.4"

sparkPackageName := "databricks/spark-sql-perf"

version := "0.0.4-SNAPSHOT"

// All Spark Packages need a license
licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

sparkVersion := "1.4.0"

sparkComponents ++= Seq("sql", "hive")