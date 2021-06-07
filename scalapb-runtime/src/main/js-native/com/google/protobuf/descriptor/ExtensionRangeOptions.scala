// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class ExtensionRangeOptions(
    uninterpretedOption: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[ExtensionRangeOptions] with _root_.scalapb.ExtendableMessage[ExtensionRangeOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      uninterpretedOption.foreach { __item =>
        val __value = __item
        __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      uninterpretedOption.foreach { __v =>
        val __m = __v
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): ExtensionRangeOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: Iterable[com.google.protobuf.descriptor.UninterpretedOption]): ExtensionRangeOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]): ExtensionRangeOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 999 => _root_.scalapb.descriptors.PRepeated(uninterpretedOption.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: com.google.protobuf.descriptor.ExtensionRangeOptions.type = com.google.protobuf.descriptor.ExtensionRangeOptions
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.ExtensionRangeOptions])
}

object ExtensionRangeOptions extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.ExtensionRangeOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.ExtensionRangeOptions] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.ExtensionRangeOptions = {
    val __uninterpretedOption: _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.descriptor.UninterpretedOption] = new _root_.scala.collection.immutable.VectorBuilder[com.google.protobuf.descriptor.UninterpretedOption]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 7994 =>
          __uninterpretedOption += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.descriptor.UninterpretedOption](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.google.protobuf.descriptor.ExtensionRangeOptions(
        uninterpretedOption = __uninterpretedOption.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.ExtensionRangeOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.ExtensionRangeOptions(
        uninterpretedOption = __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(3)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.ExtensionRangeOptions(
    uninterpretedOption = _root_.scala.Seq.empty
  )
  implicit class ExtensionRangeOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.ExtensionRangeOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.ExtensionRangeOptions](_l) {
    def uninterpretedOption: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
  def of(
    uninterpretedOption: _root_.scala.Seq[com.google.protobuf.descriptor.UninterpretedOption]
  ): _root_.com.google.protobuf.descriptor.ExtensionRangeOptions = _root_.com.google.protobuf.descriptor.ExtensionRangeOptions(
    uninterpretedOption
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.ExtensionRangeOptions])
}
