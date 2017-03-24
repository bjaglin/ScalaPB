// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.`type`



/** A single field of a message type.
  *
  * @param kind
  *   The field type.
  * @param cardinality
  *   The field cardinality.
  * @param number
  *   The field number.
  * @param name
  *   The field name.
  * @param typeUrl
  *   The field type URL, without the scheme, for message or enumeration
  *   types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
  * @param oneofIndex
  *   The index of the field type in `Type.oneofs`, for message or enumeration
  *   types. The first type has index 1; zero means the type is not in the list.
  * @param packed
  *   Whether to use alternative packed wire representation.
  * @param options
  *   The protocol buffer options.
  * @param jsonName
  *   The field JSON name.
  * @param defaultValue
  *   The string value of the default value of this field. Proto2 syntax only.
  */
@SerialVersionUID(0L)
final case class Field(
    kind: com.google.protobuf.`type`.Field.Kind = com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN,
    cardinality: com.google.protobuf.`type`.Field.Cardinality = com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN,
    number: Int = 0,
    name: String = "",
    typeUrl: String = "",
    oneofIndex: Int = 0,
    packed: Boolean = false,
    options: _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto] = _root_.scala.collection.Seq.empty,
    jsonName: String = "",
    defaultValue: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Field] with com.trueaccord.lenses.Updatable[Field] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (kind != com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, kind.value) }
      if (cardinality != com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, cardinality.value) }
      if (number != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, number) }
      if (name != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, name) }
      if (typeUrl != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, typeUrl) }
      if (oneofIndex != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(7, oneofIndex) }
      if (packed != false) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(8, packed) }
      options.foreach(options => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.serializedSize) + options.serializedSize)
      if (jsonName != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, jsonName) }
      if (defaultValue != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(11, defaultValue) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = kind
        if (__v != com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN) {
          _output__.writeEnum(1, __v.value)
        }
      };
      {
        val __v = cardinality
        if (__v != com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN) {
          _output__.writeEnum(2, __v.value)
        }
      };
      {
        val __v = number
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = typeUrl
        if (__v != "") {
          _output__.writeString(6, __v)
        }
      };
      {
        val __v = oneofIndex
        if (__v != 0) {
          _output__.writeInt32(7, __v)
        }
      };
      {
        val __v = packed
        if (__v != false) {
          _output__.writeBool(8, __v)
        }
      };
      options.foreach { __v =>
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      {
        val __v = jsonName
        if (__v != "") {
          _output__.writeString(10, __v)
        }
      };
      {
        val __v = defaultValue
        if (__v != "") {
          _output__.writeString(11, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.`type`.Field = {
      var __kind = this.kind
      var __cardinality = this.cardinality
      var __number = this.number
      var __name = this.name
      var __typeUrl = this.typeUrl
      var __oneofIndex = this.oneofIndex
      var __packed = this.packed
      val __options = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.OptionProto] ++= this.options)
      var __jsonName = this.jsonName
      var __defaultValue = this.defaultValue
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __kind = com.google.protobuf.`type`.Field.Kind.fromValue(_input__.readEnum())
          case 16 =>
            __cardinality = com.google.protobuf.`type`.Field.Cardinality.fromValue(_input__.readEnum())
          case 24 =>
            __number = _input__.readInt32()
          case 34 =>
            __name = _input__.readString()
          case 50 =>
            __typeUrl = _input__.readString()
          case 56 =>
            __oneofIndex = _input__.readInt32()
          case 64 =>
            __packed = _input__.readBool()
          case 74 =>
            __options += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.`type`.OptionProto.defaultInstance)
          case 82 =>
            __jsonName = _input__.readString()
          case 90 =>
            __defaultValue = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.`type`.Field(
          kind = __kind,
          cardinality = __cardinality,
          number = __number,
          name = __name,
          typeUrl = __typeUrl,
          oneofIndex = __oneofIndex,
          packed = __packed,
          options = __options.result(),
          jsonName = __jsonName,
          defaultValue = __defaultValue
      )
    }
    def withKind(__v: com.google.protobuf.`type`.Field.Kind): Field = copy(kind = __v)
    def withCardinality(__v: com.google.protobuf.`type`.Field.Cardinality): Field = copy(cardinality = __v)
    def withNumber(__v: Int): Field = copy(number = __v)
    def withName(__v: String): Field = copy(name = __v)
    def withTypeUrl(__v: String): Field = copy(typeUrl = __v)
    def withOneofIndex(__v: Int): Field = copy(oneofIndex = __v)
    def withPacked(__v: Boolean): Field = copy(packed = __v)
    def clearOptions = copy(options = _root_.scala.collection.Seq.empty)
    def addOptions(__vs: com.google.protobuf.`type`.OptionProto*): Field = addAllOptions(__vs)
    def addAllOptions(__vs: TraversableOnce[com.google.protobuf.`type`.OptionProto]): Field = copy(options = options ++ __vs)
    def withOptions(__v: _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]): Field = copy(options = __v)
    def withJsonName(__v: String): Field = copy(jsonName = __v)
    def withDefaultValue(__v: String): Field = copy(defaultValue = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      __fieldNumber match {
        case 1 => {
          val __t = kind.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 2 => {
          val __t = cardinality.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 3 => {
          val __t = number
          if (__t != 0) __t else null
        }
        case 4 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = typeUrl
          if (__t != "") __t else null
        }
        case 7 => {
          val __t = oneofIndex
          if (__t != 0) __t else null
        }
        case 8 => {
          val __t = packed
          if (__t != false) __t else null
        }
        case 9 => options
        case 10 => {
          val __t = jsonName
          if (__t != "") __t else null
        }
        case 11 => {
          val __t = defaultValue
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      __field.number match {
        case 1 => _root_.scalapb.descriptors.PEnum(kind.scalaValueDescriptor)
        case 2 => _root_.scalapb.descriptors.PEnum(cardinality.scalaValueDescriptor)
        case 3 => _root_.scalapb.descriptors.PInt(number)
        case 4 => _root_.scalapb.descriptors.PString(name)
        case 6 => _root_.scalapb.descriptors.PString(typeUrl)
        case 7 => _root_.scalapb.descriptors.PInt(oneofIndex)
        case 8 => _root_.scalapb.descriptors.PBoolean(packed)
        case 9 => _root_.scalapb.descriptors.PRepeated(options.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 10 => _root_.scalapb.descriptors.PString(jsonName)
        case 11 => _root_.scalapb.descriptors.PString(defaultValue)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.`type`.Field
}

object Field extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Field] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Field] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.`type`.Field = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.`type`.Field(
      com.google.protobuf.`type`.Field.Kind.fromValue(__fieldsMap.getOrElse(__fields.get(0), com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      com.google.protobuf.`type`.Field.Cardinality.fromValue(__fieldsMap.getOrElse(__fields.get(1), com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(4), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(5), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(6), false).asInstanceOf[Boolean],
      __fieldsMap.getOrElse(__fields.get(7), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]],
      __fieldsMap.getOrElse(__fields.get(8), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(9), "").asInstanceOf[String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.`type`.Field] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.`type`.Field(
        com.google.protobuf.`type`.Field.Kind.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN.scalaValueDescriptor).number),
        com.google.protobuf.`type`.Field.Cardinality.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[Boolean]).getOrElse(false),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).map(_.as[String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TypeProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TypeProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __fieldNumber match {
      case 9 => __out = com.google.protobuf.`type`.OptionProto
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    __fieldNumber match {
      case 1 => com.google.protobuf.`type`.Field.Kind
      case 2 => com.google.protobuf.`type`.Field.Cardinality
    }
  }
  lazy val defaultInstance = com.google.protobuf.`type`.Field(
  )
  sealed trait Kind extends _root_.com.trueaccord.scalapb.GeneratedEnum {
    type EnumType = Kind
    def isTypeUnknown: Boolean = false
    def isTypeDouble: Boolean = false
    def isTypeFloat: Boolean = false
    def isTypeInt64: Boolean = false
    def isTypeUint64: Boolean = false
    def isTypeInt32: Boolean = false
    def isTypeFixed64: Boolean = false
    def isTypeFixed32: Boolean = false
    def isTypeBool: Boolean = false
    def isTypeString: Boolean = false
    def isTypeGroup: Boolean = false
    def isTypeMessage: Boolean = false
    def isTypeBytes: Boolean = false
    def isTypeUint32: Boolean = false
    def isTypeEnum: Boolean = false
    def isTypeSfixed32: Boolean = false
    def isTypeSfixed64: Boolean = false
    def isTypeSint32: Boolean = false
    def isTypeSint64: Boolean = false
    def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Kind] = com.google.protobuf.`type`.Field.Kind
  }
  
  object Kind extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Kind] {
    implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Kind] = this
    @SerialVersionUID(0L)
    case object TYPE_UNKNOWN extends Kind {
      val value = 0
      val index = 0
      val name = "TYPE_UNKNOWN"
      override def isTypeUnknown: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_DOUBLE extends Kind {
      val value = 1
      val index = 1
      val name = "TYPE_DOUBLE"
      override def isTypeDouble: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FLOAT extends Kind {
      val value = 2
      val index = 2
      val name = "TYPE_FLOAT"
      override def isTypeFloat: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_INT64 extends Kind {
      val value = 3
      val index = 3
      val name = "TYPE_INT64"
      override def isTypeInt64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_UINT64 extends Kind {
      val value = 4
      val index = 4
      val name = "TYPE_UINT64"
      override def isTypeUint64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_INT32 extends Kind {
      val value = 5
      val index = 5
      val name = "TYPE_INT32"
      override def isTypeInt32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FIXED64 extends Kind {
      val value = 6
      val index = 6
      val name = "TYPE_FIXED64"
      override def isTypeFixed64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FIXED32 extends Kind {
      val value = 7
      val index = 7
      val name = "TYPE_FIXED32"
      override def isTypeFixed32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_BOOL extends Kind {
      val value = 8
      val index = 8
      val name = "TYPE_BOOL"
      override def isTypeBool: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_STRING extends Kind {
      val value = 9
      val index = 9
      val name = "TYPE_STRING"
      override def isTypeString: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_GROUP extends Kind {
      val value = 10
      val index = 10
      val name = "TYPE_GROUP"
      override def isTypeGroup: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_MESSAGE extends Kind {
      val value = 11
      val index = 11
      val name = "TYPE_MESSAGE"
      override def isTypeMessage: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_BYTES extends Kind {
      val value = 12
      val index = 12
      val name = "TYPE_BYTES"
      override def isTypeBytes: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_UINT32 extends Kind {
      val value = 13
      val index = 13
      val name = "TYPE_UINT32"
      override def isTypeUint32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_ENUM extends Kind {
      val value = 14
      val index = 14
      val name = "TYPE_ENUM"
      override def isTypeEnum: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SFIXED32 extends Kind {
      val value = 15
      val index = 15
      val name = "TYPE_SFIXED32"
      override def isTypeSfixed32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SFIXED64 extends Kind {
      val value = 16
      val index = 16
      val name = "TYPE_SFIXED64"
      override def isTypeSfixed64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SINT32 extends Kind {
      val value = 17
      val index = 17
      val name = "TYPE_SINT32"
      override def isTypeSint32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SINT64 extends Kind {
      val value = 18
      val index = 18
      val name = "TYPE_SINT64"
      override def isTypeSint64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case class Unrecognized(value: Int) extends Kind with _root_.com.trueaccord.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(TYPE_UNKNOWN, TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64)
    def fromValue(value: Int): Kind = value match {
      case 0 => TYPE_UNKNOWN
      case 1 => TYPE_DOUBLE
      case 2 => TYPE_FLOAT
      case 3 => TYPE_INT64
      case 4 => TYPE_UINT64
      case 5 => TYPE_INT32
      case 6 => TYPE_FIXED64
      case 7 => TYPE_FIXED32
      case 8 => TYPE_BOOL
      case 9 => TYPE_STRING
      case 10 => TYPE_GROUP
      case 11 => TYPE_MESSAGE
      case 12 => TYPE_BYTES
      case 13 => TYPE_UINT32
      case 14 => TYPE_ENUM
      case 15 => TYPE_SFIXED32
      case 16 => TYPE_SFIXED64
      case 17 => TYPE_SINT32
      case 18 => TYPE_SINT64
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.`type`.Field.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.`type`.Field.scalaDescriptor.enums(0)
  }
  sealed trait Cardinality extends _root_.com.trueaccord.scalapb.GeneratedEnum {
    type EnumType = Cardinality
    def isCardinalityUnknown: Boolean = false
    def isCardinalityOptional: Boolean = false
    def isCardinalityRequired: Boolean = false
    def isCardinalityRepeated: Boolean = false
    def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Cardinality] = com.google.protobuf.`type`.Field.Cardinality
  }
  
  object Cardinality extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Cardinality] {
    implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Cardinality] = this
    @SerialVersionUID(0L)
    case object CARDINALITY_UNKNOWN extends Cardinality {
      val value = 0
      val index = 0
      val name = "CARDINALITY_UNKNOWN"
      override def isCardinalityUnknown: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CARDINALITY_OPTIONAL extends Cardinality {
      val value = 1
      val index = 1
      val name = "CARDINALITY_OPTIONAL"
      override def isCardinalityOptional: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CARDINALITY_REQUIRED extends Cardinality {
      val value = 2
      val index = 2
      val name = "CARDINALITY_REQUIRED"
      override def isCardinalityRequired: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CARDINALITY_REPEATED extends Cardinality {
      val value = 3
      val index = 3
      val name = "CARDINALITY_REPEATED"
      override def isCardinalityRepeated: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case class Unrecognized(value: Int) extends Cardinality with _root_.com.trueaccord.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(CARDINALITY_UNKNOWN, CARDINALITY_OPTIONAL, CARDINALITY_REQUIRED, CARDINALITY_REPEATED)
    def fromValue(value: Int): Cardinality = value match {
      case 0 => CARDINALITY_UNKNOWN
      case 1 => CARDINALITY_OPTIONAL
      case 2 => CARDINALITY_REQUIRED
      case 3 => CARDINALITY_REPEATED
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.`type`.Field.javaDescriptor.getEnumTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.`type`.Field.scalaDescriptor.enums(1)
  }
  implicit class FieldLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.`type`.Field]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.`type`.Field](_l) {
    def kind: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.`type`.Field.Kind] = field(_.kind)((c_, f_) => c_.copy(kind = f_))
    def cardinality: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.`type`.Field.Cardinality] = field(_.cardinality)((c_, f_) => c_.copy(cardinality = f_))
    def number: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.number)((c_, f_) => c_.copy(number = f_))
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def typeUrl: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.typeUrl)((c_, f_) => c_.copy(typeUrl = f_))
    def oneofIndex: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.oneofIndex)((c_, f_) => c_.copy(oneofIndex = f_))
    def packed: _root_.com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.packed)((c_, f_) => c_.copy(packed = f_))
    def options: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def jsonName: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.jsonName)((c_, f_) => c_.copy(jsonName = f_))
    def defaultValue: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.defaultValue)((c_, f_) => c_.copy(defaultValue = f_))
  }
  final val KIND_FIELD_NUMBER = 1
  final val CARDINALITY_FIELD_NUMBER = 2
  final val NUMBER_FIELD_NUMBER = 3
  final val NAME_FIELD_NUMBER = 4
  final val TYPE_URL_FIELD_NUMBER = 6
  final val ONEOF_INDEX_FIELD_NUMBER = 7
  final val PACKED_FIELD_NUMBER = 8
  final val OPTIONS_FIELD_NUMBER = 9
  final val JSON_NAME_FIELD_NUMBER = 10
  final val DEFAULT_VALUE_FIELD_NUMBER = 11
}
