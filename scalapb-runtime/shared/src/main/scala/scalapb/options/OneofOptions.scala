// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

/** @param extends
  *   Additional traits to mix in to a oneof.
  */
@SerialVersionUID(0L)
final case class OneofOptions(
    `extends`: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[OneofOptions] with scalapb.lenses.Updatable[OneofOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      `extends`.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      `extends`.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.OneofOptions = {
      val __extends = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.`extends`)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __extends += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      scalapb.options.OneofOptions(
          `extends` = __extends.result()
      )
    }
    def clearExtends = copy(`extends` = _root_.scala.Seq.empty)
    def addExtends(__vs: _root_.scala.Predef.String*): OneofOptions = addAllExtends(__vs)
    def addAllExtends(__vs: Iterable[_root_.scala.Predef.String]): OneofOptions = copy(`extends` = `extends` ++ __vs)
    def withExtends(__v: _root_.scala.Seq[_root_.scala.Predef.String]): OneofOptions = copy(`extends` = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `extends`
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(`extends`.iterator.map(_root_.scalapb.descriptors.PString).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.options.OneofOptions
}

object OneofOptions extends scalapb.GeneratedMessageCompanion[scalapb.options.OneofOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.OneofOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): scalapb.options.OneofOptions = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    scalapb.options.OneofOptions(
      `extends` = __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.OneofOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.OneofOptions(
        `extends` = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes.get(5)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(5)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.options.OneofOptions(
    `extends` = _root_.scala.Seq.empty
  )
  implicit class OneofOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.OneofOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.OneofOptions](_l) {
    def `extends`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.`extends`)((c_, f_) => c_.copy(`extends` = f_))
  }
  final val EXTENDS_FIELD_NUMBER = 1
  def of(
    `extends`: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.scalapb.options.OneofOptions = _root_.scalapb.options.OneofOptions(
    `extends`
  )
}
