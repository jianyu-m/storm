/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class ErrorInfo implements org.apache.thrift.TBase<ErrorInfo, ErrorInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ErrorInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ErrorInfo");

  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_TIME_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("error_time_secs", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ErrorInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ErrorInfoTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String error; // required
  private int error_time_secs; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String host; // optional
  private int port; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR((short)1, "error"),
    ERROR_TIME_SECS((short)2, "error_time_secs"),
    HOST((short)3, "host"),
    PORT((short)4, "port");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR
          return ERROR;
        case 2: // ERROR_TIME_SECS
          return ERROR_TIME_SECS;
        case 3: // HOST
          return HOST;
        case 4: // PORT
          return PORT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERROR_TIME_SECS_ISSET_ID = 0;
  private static final int __PORT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.HOST,_Fields.PORT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_TIME_SECS, new org.apache.thrift.meta_data.FieldMetaData("error_time_secs", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ErrorInfo.class, metaDataMap);
  }

  public ErrorInfo() {
  }

  public ErrorInfo(
    java.lang.String error,
    int error_time_secs)
  {
    this();
    this.error = error;
    this.error_time_secs = error_time_secs;
    set_error_time_secs_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ErrorInfo(ErrorInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_error()) {
      this.error = other.error;
    }
    this.error_time_secs = other.error_time_secs;
    if (other.is_set_host()) {
      this.host = other.host;
    }
    this.port = other.port;
  }

  public ErrorInfo deepCopy() {
    return new ErrorInfo(this);
  }

  @Override
  public void clear() {
    this.error = null;
    set_error_time_secs_isSet(false);
    this.error_time_secs = 0;
    this.host = null;
    set_port_isSet(false);
    this.port = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String get_error() {
    return this.error;
  }

  public void set_error(@org.apache.thrift.annotation.Nullable java.lang.String error) {
    this.error = error;
  }

  public void unset_error() {
    this.error = null;
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean is_set_error() {
    return this.error != null;
  }

  public void set_error_isSet(boolean value) {
    if (!value) {
      this.error = null;
    }
  }

  public int get_error_time_secs() {
    return this.error_time_secs;
  }

  public void set_error_time_secs(int error_time_secs) {
    this.error_time_secs = error_time_secs;
    set_error_time_secs_isSet(true);
  }

  public void unset_error_time_secs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERROR_TIME_SECS_ISSET_ID);
  }

  /** Returns true if field error_time_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_error_time_secs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERROR_TIME_SECS_ISSET_ID);
  }

  public void set_error_time_secs_isSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERROR_TIME_SECS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String get_host() {
    return this.host;
  }

  public void set_host(@org.apache.thrift.annotation.Nullable java.lang.String host) {
    this.host = host;
  }

  public void unset_host() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean is_set_host() {
    return this.host != null;
  }

  public void set_host_isSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int get_port() {
    return this.port;
  }

  public void set_port(int port) {
    this.port = port;
    set_port_isSet(true);
  }

  public void unset_port() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean is_set_port() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PORT_ISSET_ID);
  }

  public void set_port_isSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ERROR:
      if (value == null) {
        unset_error();
      } else {
        set_error((java.lang.String)value);
      }
      break;

    case ERROR_TIME_SECS:
      if (value == null) {
        unset_error_time_secs();
      } else {
        set_error_time_secs((java.lang.Integer)value);
      }
      break;

    case HOST:
      if (value == null) {
        unset_host();
      } else {
        set_host((java.lang.String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unset_port();
      } else {
        set_port((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR:
      return get_error();

    case ERROR_TIME_SECS:
      return get_error_time_secs();

    case HOST:
      return get_host();

    case PORT:
      return get_port();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR:
      return is_set_error();
    case ERROR_TIME_SECS:
      return is_set_error_time_secs();
    case HOST:
      return is_set_host();
    case PORT:
      return is_set_port();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ErrorInfo)
      return this.equals((ErrorInfo)that);
    return false;
  }

  public boolean equals(ErrorInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_error = true && this.is_set_error();
    boolean that_present_error = true && that.is_set_error();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (!this.error.equals(that.error))
        return false;
    }

    boolean this_present_error_time_secs = true;
    boolean that_present_error_time_secs = true;
    if (this_present_error_time_secs || that_present_error_time_secs) {
      if (!(this_present_error_time_secs && that_present_error_time_secs))
        return false;
      if (this.error_time_secs != that.error_time_secs)
        return false;
    }

    boolean this_present_host = true && this.is_set_host();
    boolean that_present_host = true && that.is_set_host();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_port = true && this.is_set_port();
    boolean that_present_port = true && that.is_set_port();
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_error()) ? 131071 : 524287);
    if (is_set_error())
      hashCode = hashCode * 8191 + error.hashCode();

    hashCode = hashCode * 8191 + error_time_secs;

    hashCode = hashCode * 8191 + ((is_set_host()) ? 131071 : 524287);
    if (is_set_host())
      hashCode = hashCode * 8191 + host.hashCode();

    hashCode = hashCode * 8191 + ((is_set_port()) ? 131071 : 524287);
    if (is_set_port())
      hashCode = hashCode * 8191 + port;

    return hashCode;
  }

  @Override
  public int compareTo(ErrorInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_error()).compareTo(other.is_set_error());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_error()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_error_time_secs()).compareTo(other.is_set_error_time_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_error_time_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_time_secs, other.error_time_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_host()).compareTo(other.is_set_host());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_host()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_port()).compareTo(other.is_set_port());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_port()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.port, other.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorInfo(");
    boolean first = true;

    sb.append("error:");
    if (this.error == null) {
      sb.append("null");
    } else {
      sb.append(this.error);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("error_time_secs:");
    sb.append(this.error_time_secs);
    first = false;
    if (is_set_host()) {
      if (!first) sb.append(", ");
      sb.append("host:");
      if (this.host == null) {
        sb.append("null");
      } else {
        sb.append(this.host);
      }
      first = false;
    }
    if (is_set_port()) {
      if (!first) sb.append(", ");
      sb.append("port:");
      sb.append(this.port);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_error()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'error' is unset! Struct:" + toString());
    }

    if (!is_set_error_time_secs()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'error_time_secs' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ErrorInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ErrorInfoStandardScheme getScheme() {
      return new ErrorInfoStandardScheme();
    }
  }

  private static class ErrorInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ErrorInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ErrorInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error = iprot.readString();
              struct.set_error_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_TIME_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.error_time_secs = iprot.readI32();
              struct.set_error_time_secs_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.set_host_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.set_port_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ErrorInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.error != null) {
        oprot.writeFieldBegin(ERROR_FIELD_DESC);
        oprot.writeString(struct.error);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ERROR_TIME_SECS_FIELD_DESC);
      oprot.writeI32(struct.error_time_secs);
      oprot.writeFieldEnd();
      if (struct.host != null) {
        if (struct.is_set_host()) {
          oprot.writeFieldBegin(HOST_FIELD_DESC);
          oprot.writeString(struct.host);
          oprot.writeFieldEnd();
        }
      }
      if (struct.is_set_port()) {
        oprot.writeFieldBegin(PORT_FIELD_DESC);
        oprot.writeI32(struct.port);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ErrorInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ErrorInfoTupleScheme getScheme() {
      return new ErrorInfoTupleScheme();
    }
  }

  private static class ErrorInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ErrorInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ErrorInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.error);
      oprot.writeI32(struct.error_time_secs);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_host()) {
        optionals.set(0);
      }
      if (struct.is_set_port()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.is_set_host()) {
        oprot.writeString(struct.host);
      }
      if (struct.is_set_port()) {
        oprot.writeI32(struct.port);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ErrorInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.error = iprot.readString();
      struct.set_error_isSet(true);
      struct.error_time_secs = iprot.readI32();
      struct.set_error_time_secs_isSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.host = iprot.readString();
        struct.set_host_isSet(true);
      }
      if (incoming.get(1)) {
        struct.port = iprot.readI32();
        struct.set_port_isSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

