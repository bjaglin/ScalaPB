// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.duration

/** A Duration represents a signed, fixed-length span of time represented
  * as a count of seconds and fractions of seconds at nanosecond
  * resolution. It is independent of any calendar and concepts like "day"
  * or "month". It is related to Timestamp in that the difference between
  * two Timestamp values is a Duration and it can be added or subtracted
  * from a Timestamp. Range is approximately +-10,000 years.
  *
  * # Examples
  *
  * Example 1: Compute Duration from two Timestamps in pseudo code.
  *
  *     Timestamp start = ...;
  *     Timestamp end = ...;
  *     Duration duration = ...;
  *
  *     duration.seconds = end.seconds - start.seconds;
  *     duration.nanos = end.nanos - start.nanos;
  *
  *     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {
  *       duration.seconds += 1;
  *       duration.nanos -= 1000000000;
  *     } else if (duration.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {
  *       duration.seconds -= 1;
  *       duration.nanos += 1000000000;
  *     }
  *
  * Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.
  *
  *     Timestamp start = ...;
  *     Duration duration = ...;
  *     Timestamp end = ...;
  *
  *     end.seconds = start.seconds + duration.seconds;
  *     end.nanos = start.nanos + duration.nanos;
  *
  *     if (end.nanos &lt; 0) {
  *       end.seconds -= 1;
  *       end.nanos += 1000000000;
  *     } else if (end.nanos &gt;= 1000000000) {
  *       end.seconds += 1;
  *       end.nanos -= 1000000000;
  *     }
  *
  * Example 3: Compute Duration from datetime.timedelta in Python.
  *
  *     td = datetime.timedelta(days=3, minutes=10)
  *     duration = Duration()
  *     duration.FromTimedelta(td)
  *
  * # JSON Mapping
  *
  * In JSON format, the Duration type is encoded as a string rather than an
  * object, where the string ends in the suffix "s" (indicating seconds) and
  * is preceded by the number of seconds, with nanoseconds expressed as
  * fractional seconds. For example, 3 seconds with 0 nanoseconds should be
  * encoded in JSON format as "3s", while 3 seconds and 1 nanosecond should
  * be expressed in JSON format as "3.000000001s", and 3 seconds and 1
  * microsecond should be expressed in JSON format as "3.000001s".
  *
  * @param seconds
  *   Signed seconds of the span of time. Must be from -315,576,000,000
  *   to +315,576,000,000 inclusive. Note: these bounds are computed from:
  *   60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
  * @param nanos
  *   Signed fractions of a second at nanosecond resolution of the span
  *   of time. Durations less than one second are represented with a 0
  *   `seconds` field and a positive or negative `nanos` field. For durations
  *   of one second or more, a non-zero value for the `nanos` field must be
  *   of the same sign as the `seconds` field. Must be from -999,999,999
  *   to +999,999,999 inclusive.
  */
@SerialVersionUID(0L)
final case class Duration(
    seconds: _root_.scala.Long = 0L,
    nanos: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Duration] with _root_.scalapb.DurationMethods {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = seconds
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(1, __value)
        }
      };
      
      {
        val __value = nanos
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = seconds
        if (__v != 0L) {
          _output__.writeInt64(1, __v)
        }
      };
      {
        val __v = nanos
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withSeconds(__v: _root_.scala.Long): Duration = copy(seconds = __v)
    def withNanos(__v: _root_.scala.Int): Duration = copy(nanos = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = seconds
          if (__t != 0L) __t else null
        }
        case 2 => {
          val __t = nanos
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PLong(seconds)
        case 2 => _root_.scalapb.descriptors.PInt(nanos)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.duration.Duration
}

object Duration extends scalapb.GeneratedMessageCompanion[com.google.protobuf.duration.Duration] with scalapb.JavaProtoSupport[com.google.protobuf.duration.Duration, com.google.protobuf.Duration] with scalapb.DurationCompanionMethods {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.duration.Duration] with scalapb.JavaProtoSupport[com.google.protobuf.duration.Duration, com.google.protobuf.Duration] with scalapb.DurationCompanionMethods = this
  def toJavaProto(scalaPbSource: com.google.protobuf.duration.Duration): com.google.protobuf.Duration = {
    val javaPbOut = com.google.protobuf.Duration.newBuilder
    javaPbOut.setSeconds(scalaPbSource.seconds)
    javaPbOut.setNanos(scalaPbSource.nanos)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.Duration): com.google.protobuf.duration.Duration = com.google.protobuf.duration.Duration(
    seconds = javaPbSource.getSeconds.longValue,
    nanos = javaPbSource.getNanos.intValue
  )
  def merge(`_message__`: com.google.protobuf.duration.Duration, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.duration.Duration = {
    var __seconds = `_message__`.seconds
    var __nanos = `_message__`.nanos
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __seconds = _input__.readInt64()
        case 16 =>
          __nanos = _input__.readInt32()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.duration.Duration(
        seconds = __seconds,
        nanos = __nanos,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.duration.Duration] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.duration.Duration(
        seconds = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        nanos = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DurationProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DurationProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.duration.Duration(
    seconds = 0L,
    nanos = 0
  )
  implicit class DurationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.duration.Duration]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.duration.Duration](_l) {
    def seconds: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.seconds)((c_, f_) => c_.copy(seconds = f_))
    def nanos: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.nanos)((c_, f_) => c_.copy(nanos = f_))
  }
  final val SECONDS_FIELD_NUMBER = 1
  final val NANOS_FIELD_NUMBER = 2
  def of(
    seconds: _root_.scala.Long,
    nanos: _root_.scala.Int
  ): _root_.com.google.protobuf.duration.Duration = _root_.com.google.protobuf.duration.Duration(
    seconds,
    nanos
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.Duration])
}
