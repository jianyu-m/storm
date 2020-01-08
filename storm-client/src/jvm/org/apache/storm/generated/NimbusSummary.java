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
public class NimbusSummary implements org.apache.thrift.TBase<NimbusSummary, NimbusSummary._Fields>, java.io.Serializable, Cloneable, Comparable<NimbusSummary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NimbusSummary");

  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("port", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField UPTIME_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("uptime_secs", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField IS_LEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("isLeader", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new NimbusSummaryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new NimbusSummaryTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String host; // required
  private int port; // required
  private int uptime_secs; // required
  private boolean isLeader; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOST((short)1, "host"),
    PORT((short)2, "port"),
    UPTIME_SECS((short)3, "uptime_secs"),
    IS_LEADER((short)4, "isLeader"),
    VERSION((short)5, "version");

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
        case 1: // HOST
          return HOST;
        case 2: // PORT
          return PORT;
        case 3: // UPTIME_SECS
          return UPTIME_SECS;
        case 4: // IS_LEADER
          return IS_LEADER;
        case 5: // VERSION
          return VERSION;
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
  private static final int __PORT_ISSET_ID = 0;
  private static final int __UPTIME_SECS_ISSET_ID = 1;
  private static final int __ISLEADER_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift.meta_data.FieldMetaData("port", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UPTIME_SECS, new org.apache.thrift.meta_data.FieldMetaData("uptime_secs", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_LEADER, new org.apache.thrift.meta_data.FieldMetaData("isLeader", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NimbusSummary.class, metaDataMap);
  }

  public NimbusSummary() {
  }

  public NimbusSummary(
    java.lang.String host,
    int port,
    int uptime_secs,
    boolean isLeader,
    java.lang.String version)
  {
    this();
    this.host = host;
    this.port = port;
    set_port_isSet(true);
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
    this.isLeader = isLeader;
    set_isLeader_isSet(true);
    this.version = version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NimbusSummary(NimbusSummary other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_host()) {
      this.host = other.host;
    }
    this.port = other.port;
    this.uptime_secs = other.uptime_secs;
    this.isLeader = other.isLeader;
    if (other.is_set_version()) {
      this.version = other.version;
    }
  }

  public NimbusSummary deepCopy() {
    return new NimbusSummary(this);
  }

  @Override
  public void clear() {
    this.host = null;
    set_port_isSet(false);
    this.port = 0;
    set_uptime_secs_isSet(false);
    this.uptime_secs = 0;
    set_isLeader_isSet(false);
    this.isLeader = false;
    this.version = null;
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

  public int get_uptime_secs() {
    return this.uptime_secs;
  }

  public void set_uptime_secs(int uptime_secs) {
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
  }

  public void unset_uptime_secs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UPTIME_SECS_ISSET_ID);
  }

  /** Returns true if field uptime_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_uptime_secs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UPTIME_SECS_ISSET_ID);
  }

  public void set_uptime_secs_isSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UPTIME_SECS_ISSET_ID, value);
  }

  public boolean is_isLeader() {
    return this.isLeader;
  }

  public void set_isLeader(boolean isLeader) {
    this.isLeader = isLeader;
    set_isLeader_isSet(true);
  }

  public void unset_isLeader() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISLEADER_ISSET_ID);
  }

  /** Returns true if field isLeader is set (has been assigned a value) and false otherwise */
  public boolean is_set_isLeader() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISLEADER_ISSET_ID);
  }

  public void set_isLeader_isSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISLEADER_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String get_version() {
    return this.version;
  }

  public void set_version(@org.apache.thrift.annotation.Nullable java.lang.String version) {
    this.version = version;
  }

  public void unset_version() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean is_set_version() {
    return this.version != null;
  }

  public void set_version_isSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
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

    case UPTIME_SECS:
      if (value == null) {
        unset_uptime_secs();
      } else {
        set_uptime_secs((java.lang.Integer)value);
      }
      break;

    case IS_LEADER:
      if (value == null) {
        unset_isLeader();
      } else {
        set_isLeader((java.lang.Boolean)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unset_version();
      } else {
        set_version((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HOST:
      return get_host();

    case PORT:
      return get_port();

    case UPTIME_SECS:
      return get_uptime_secs();

    case IS_LEADER:
      return is_isLeader();

    case VERSION:
      return get_version();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HOST:
      return is_set_host();
    case PORT:
      return is_set_port();
    case UPTIME_SECS:
      return is_set_uptime_secs();
    case IS_LEADER:
      return is_set_isLeader();
    case VERSION:
      return is_set_version();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof NimbusSummary)
      return this.equals((NimbusSummary)that);
    return false;
  }

  public boolean equals(NimbusSummary that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_host = true && this.is_set_host();
    boolean that_present_host = true && that.is_set_host();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_uptime_secs = true;
    boolean that_present_uptime_secs = true;
    if (this_present_uptime_secs || that_present_uptime_secs) {
      if (!(this_present_uptime_secs && that_present_uptime_secs))
        return false;
      if (this.uptime_secs != that.uptime_secs)
        return false;
    }

    boolean this_present_isLeader = true;
    boolean that_present_isLeader = true;
    if (this_present_isLeader || that_present_isLeader) {
      if (!(this_present_isLeader && that_present_isLeader))
        return false;
      if (this.isLeader != that.isLeader)
        return false;
    }

    boolean this_present_version = true && this.is_set_version();
    boolean that_present_version = true && that.is_set_version();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_host()) ? 131071 : 524287);
    if (is_set_host())
      hashCode = hashCode * 8191 + host.hashCode();

    hashCode = hashCode * 8191 + port;

    hashCode = hashCode * 8191 + uptime_secs;

    hashCode = hashCode * 8191 + ((isLeader) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((is_set_version()) ? 131071 : 524287);
    if (is_set_version())
      hashCode = hashCode * 8191 + version.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(NimbusSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(is_set_uptime_secs()).compareTo(other.is_set_uptime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_uptime_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uptime_secs, other.uptime_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_isLeader()).compareTo(other.is_set_isLeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_isLeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isLeader, other.isLeader);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_version()).compareTo(other.is_set_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("NimbusSummary(");
    boolean first = true;

    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("uptime_secs:");
    sb.append(this.uptime_secs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isLeader:");
    sb.append(this.isLeader);
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_host()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'host' is unset! Struct:" + toString());
    }

    if (!is_set_port()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'port' is unset! Struct:" + toString());
    }

    if (!is_set_uptime_secs()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uptime_secs' is unset! Struct:" + toString());
    }

    if (!is_set_isLeader()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'isLeader' is unset! Struct:" + toString());
    }

    if (!is_set_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' is unset! Struct:" + toString());
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

  private static class NimbusSummaryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NimbusSummaryStandardScheme getScheme() {
      return new NimbusSummaryStandardScheme();
    }
  }

  private static class NimbusSummaryStandardScheme extends org.apache.thrift.scheme.StandardScheme<NimbusSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NimbusSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.set_host_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.port = iprot.readI32();
              struct.set_port_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPTIME_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.uptime_secs = iprot.readI32();
              struct.set_uptime_secs_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_LEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isLeader = iprot.readBool();
              struct.set_isLeader_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.set_version_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NimbusSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        oprot.writeString(struct.host);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PORT_FIELD_DESC);
      oprot.writeI32(struct.port);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPTIME_SECS_FIELD_DESC);
      oprot.writeI32(struct.uptime_secs);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_LEADER_FIELD_DESC);
      oprot.writeBool(struct.isLeader);
      oprot.writeFieldEnd();
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeString(struct.version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NimbusSummaryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NimbusSummaryTupleScheme getScheme() {
      return new NimbusSummaryTupleScheme();
    }
  }

  private static class NimbusSummaryTupleScheme extends org.apache.thrift.scheme.TupleScheme<NimbusSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NimbusSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.host);
      oprot.writeI32(struct.port);
      oprot.writeI32(struct.uptime_secs);
      oprot.writeBool(struct.isLeader);
      oprot.writeString(struct.version);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NimbusSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.host = iprot.readString();
      struct.set_host_isSet(true);
      struct.port = iprot.readI32();
      struct.set_port_isSet(true);
      struct.uptime_secs = iprot.readI32();
      struct.set_uptime_secs_isSet(true);
      struct.isLeader = iprot.readBool();
      struct.set_isLeader_isSet(true);
      struct.version = iprot.readString();
      struct.set_version_isSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

