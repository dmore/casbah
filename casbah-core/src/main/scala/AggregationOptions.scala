package com.mongodb.casbah

import com.mongodb.{ AggregationOptions => JAggregationOptions }
import scala.concurrent.duration.Duration

/**
 * Helper object for `com.mongodb.AggregationOptions`
 *
 * @since 2.7
 */
object AggregationOptions {

  val INLINE = JAggregationOptions.OutputMode.INLINE
  val CURSOR = JAggregationOptions.OutputMode.CURSOR

  val default =  JAggregationOptions.builder().build()

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param batchSize if positive, is the # of objects per batch sent back from the db.  all objects that match will be returned.  if batchSize < 0, its a hard limit, and only 1 batch will either batchSize or the # that fit in a batch
   */
  def apply(batchSize: Int) = JAggregationOptions.builder().batchSize(batchSize).build()

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param allowDiskUsage if true enables external sorting that can write data to the _tmp sub-directory in the dbpath directory
   */
  def apply(allowDiskUsage: Boolean) = JAggregationOptions.builder().allowDiskUsage(allowDiskUsage).build()

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param outputMode either OutputMode.INLINE or OutputMode.CURSOR
   */
  def apply(outputMode: JAggregationOptions.OutputMode) = JAggregationOptions.builder().outputMode(outputMode).build()

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param maxTime the maximum duration that the server will allow this operation to execute before killing it
   */
  def apply(maxTime: Duration) =
    JAggregationOptions.builder().maxTime(maxTime.length, maxTime.unit).build()

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param batchSize if positive, is the # of objects per batch sent back from the db.  all objects that match will be returned.  if batchSize < 0, its a hard limit, and only 1 batch will either batchSize or the # that fit in a batch
   * @param allowDiskUsage if true enables external sorting that can write data to the _tmp sub-directory in the dbpath directory
   */
  def apply(batchSize: Int, allowDiskUsage: Boolean) = {
    val builder = JAggregationOptions.builder()
    builder.batchSize(batchSize)
    builder.allowDiskUsage(allowDiskUsage)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param batchSize if positive, is the # of objects per batch sent back from the db.  all objects that match will be returned.  if batchSize < 0, its a hard limit, and only 1 batch will either batchSize or the # that fit in a batch
   * @param outputMode either OutputMode.INLINE or OutputMode.CURSOR
   */
  def apply(batchSize: Int, outputMode: JAggregationOptions.OutputMode) = {
    val builder = JAggregationOptions.builder()
    builder.batchSize(batchSize)
    builder.outputMode(outputMode)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param allowDiskUsage if true enables external sorting that can write data to the _tmp sub-directory in the dbpath directory
   * @param outputMode either OutputMode.INLINE or OutputMode.CURSOR
   */
  def apply(allowDiskUsage: Boolean, outputMode: JAggregationOptions.OutputMode) = {
    val builder = JAggregationOptions.builder()
    builder.allowDiskUsage(allowDiskUsage)
    builder.outputMode(outputMode)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param batchSize   if positive, is the # of objects per batch sent back from the db.  all objects that match will be returned.  if batchSize < 0, its a hard limit, and only 1 batch will either batchSize or the # that fit in a batch
   * @param maxTime the maximum duration that the server will allow this operation to execute before killing it
   */
  def apply(batchSize: Int, maxTime: Duration) = {
    val builder = JAggregationOptions.builder()
    builder.batchSize(batchSize)
    builder.maxTime(maxTime.length, maxTime.unit)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param allowDiskUsage if true enables external sorting that can write data to the _tmp sub-directory in the dbpath directory
   * @param maxTime    the maximum duration that the server will allow this operation to execute before killing it
   */
  def apply(allowDiskUsage: Boolean, maxTime: Duration) = {
    val builder = JAggregationOptions.builder()
    builder.allowDiskUsage(allowDiskUsage)
    builder.maxTime(maxTime.length, maxTime.unit)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param outputMode  either OutputMode.INLINE or OutputMode.CURSOR
   * @param maxTime the maximum duration that the server will allow this operation to execute before killing it
   */
  def apply(outputMode: JAggregationOptions.OutputMode, maxTime: Duration) = {
    val builder = JAggregationOptions.builder()
    builder.outputMode(outputMode)
    builder.maxTime(maxTime.length, maxTime.unit)
    builder.build()
  }


  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param batchSize if positive, is the # of objects per batch sent back from the db.  all objects that match will be returned.  if batchSize < 0, its a hard limit, and only 1 batch will either batchSize or the # that fit in a batch
   * @param allowDiskUsage if true enables external sorting that can write data to the _tmp sub-directory in the dbpath directory
   * @param outputMode either OutputMode.INLINE or OutputMode.CURSOR
   */
  def apply(batchSize: Int, allowDiskUsage: Boolean, outputMode: JAggregationOptions.OutputMode): JAggregationOptions = {
    val builder = JAggregationOptions.builder()
    builder.batchSize(batchSize)
    builder.allowDiskUsage(allowDiskUsage)
    builder.outputMode(outputMode)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param batchSize      if positive, is the # of objects per batch sent back from the db.  all objects that match will be returned.  if batchSize < 0, its a hard limit, and only 1 batch will either batchSize or the # that fit in a batch
   * @param allowDiskUsage if true enables external sorting that can write data to the _tmp sub-directory in the dbpath directory
   * @param maxTime    the maximum duration that the server will allow this operation to execute before killing it
   */
  def apply(batchSize: Int, allowDiskUsage: Boolean, maxTime: Duration) = {
    val builder = JAggregationOptions.builder()
    builder.batchSize(batchSize)
    builder.allowDiskUsage(allowDiskUsage)
    builder.maxTime(maxTime.length, maxTime.unit)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param allowDiskUsage if true enables external sorting that can write data to the _tmp sub-directory in the dbpath directory
   * @param outputMode     either OutputMode.INLINE or OutputMode.CURSOR
   * @param maxTime    the maximum duration that the server will allow this operation to execute before killing it
   */
  def apply(allowDiskUsage: Boolean, outputMode: JAggregationOptions.OutputMode, maxTime: Duration) = {
    val builder = JAggregationOptions.builder()
    builder.allowDiskUsage(allowDiskUsage)
    builder.outputMode(outputMode)
    builder.maxTime(maxTime.length, maxTime.unit)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param batchSize   if positive, is the # of objects per batch sent back from the db.  all objects that match will be returned.  if batchSize < 0, its a hard limit, and only 1 batch will either batchSize or the # that fit in a batch
   * @param outputMode  either OutputMode.INLINE or OutputMode.CURSOR
   * @param maxTime the maximum duration that the server will allow this operation to execute before killing it
   */
  def apply(batchSize: Int, outputMode: JAggregationOptions.OutputMode, maxTime: Duration) = {
    val builder = JAggregationOptions.builder()
    builder.batchSize(batchSize)
    builder.outputMode(outputMode)
    builder.maxTime(maxTime.length, maxTime.unit)
    builder.build()
  }

  /**
   * Instantiate a new AggregationOptions instance
   *
   * @param batchSize       if positive, is the # of objects per batch sent back from the db.
   *                        All objects that match will be returned.  if batchSize < 0, its a hard limit
   *                        and only 1 batch will either batchSize or the # that fit in a batch.
   * @param allowDiskUsage  if true enables external sorting that can write data to the _tmp sub-directory in the dbpath directory
   * @param outputMode      either OutputMode.INLINE or OutputMode.CURSOR
   * @param maxTime     the maximum duration that the server will allow this operation to execute before killing it
   */
  def apply(batchSize: Int, allowDiskUsage: Boolean, outputMode: JAggregationOptions.OutputMode,
            maxTime: Duration) = {
    val builder = JAggregationOptions.builder()
    builder.batchSize(batchSize)
    builder.allowDiskUsage(allowDiskUsage)
    builder.outputMode(outputMode)
    builder.maxTime(maxTime.length, maxTime.unit)
    builder.build()
  }
}