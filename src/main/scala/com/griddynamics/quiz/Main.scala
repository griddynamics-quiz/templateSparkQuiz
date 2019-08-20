package com.griddynamics.quiz

import com.typesafe.scalalogging.LazyLogging
import org.apache.spark.sql.SparkSession

object Main extends LazyLogging {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .master("local")
      .appName("bigdata-competition")
      .getOrCreate()

    val resultDs = Processor.process(spark)

    spark.stop()
  }

}

