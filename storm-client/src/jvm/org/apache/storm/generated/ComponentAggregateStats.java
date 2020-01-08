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
public class ComponentAggregateStats implements org.apache.thrift.TBase<ComponentAggregateStats, ComponentAggregateStats._Fields>, java.io.Serializable, Cloneable, Comparable<ComponentAggregateStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ComponentAggregateStats");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMMON_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("common_stats", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SPECIFIC_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("specific_stats", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField LAST_ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("last_error", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ComponentAggregateStatsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ComponentAggregateStatsTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable ComponentType type; // optional
  private @org.apache.thrift.annotation.Nullable CommonAggregateStats common_stats; // optional
  private @org.apache.thrift.annotation.Nullable SpecificAggregateStats specific_stats; // optional
  private @org.apache.thrift.annotation.Nullable ErrorInfo last_error; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ComponentType
     */
    TYPE((short)1, "type"),
    COMMON_STATS((short)2, "common_stats"),
    SPECIFIC_STATS((short)3, "specific_stats"),
    LAST_ERROR((short)4, "last_error");

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
        case 1: // TYPE
          return TYPE;
        case 2: // COMMON_STATS
          return COMMON_STATS;
        case 3: // SPECIFIC_STATS
          return SPECIFIC_STATS;
        case 4: // LAST_ERROR
          return LAST_ERROR;
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
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.COMMON_STATS,_Fields.SPECIFIC_STATS,_Fields.LAST_ERROR};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ComponentType.class)));
    tmpMap.put(_Fields.COMMON_STATS, new org.apache.thrift.meta_data.FieldMetaData("common_stats", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CommonAggregateStats.class)));
    tmpMap.put(_Fields.SPECIFIC_STATS, new org.apache.thrift.meta_data.FieldMetaData("specific_stats", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SpecificAggregateStats.class)));
    tmpMap.put(_Fields.LAST_ERROR, new org.apache.thrift.meta_data.FieldMetaData("last_error", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ErrorInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ComponentAggregateStats.class, metaDataMap);
  }

  public ComponentAggregateStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ComponentAggregateStats(ComponentAggregateStats other) {
    if (other.is_set_type()) {
      this.type = other.type;
    }
    if (other.is_set_common_stats()) {
      this.common_stats = new CommonAggregateStats(other.common_stats);
    }
    if (other.is_set_specific_stats()) {
      this.specific_stats = new SpecificAggregateStats(other.specific_stats);
    }
    if (other.is_set_last_error()) {
      this.last_error = new ErrorInfo(other.last_error);
    }
  }

  public ComponentAggregateStats deepCopy() {
    return new ComponentAggregateStats(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.common_stats = null;
    this.specific_stats = null;
    this.last_error = null;
  }

  /**
   * 
   * @see ComponentType
   */
  @org.apache.thrift.annotation.Nullable
  public ComponentType get_type() {
    return this.type;
  }

  /**
   * 
   * @see ComponentType
   */
  public void set_type(@org.apache.thrift.annotation.Nullable ComponentType type) {
    this.type = type;
  }

  public void unset_type() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean is_set_type() {
    return this.type != null;
  }

  public void set_type_isSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public CommonAggregateStats get_common_stats() {
    return this.common_stats;
  }

  public void set_common_stats(@org.apache.thrift.annotation.Nullable CommonAggregateStats common_stats) {
    this.common_stats = common_stats;
  }

  public void unset_common_stats() {
    this.common_stats = null;
  }

  /** Returns true if field common_stats is set (has been assigned a value) and false otherwise */
  public boolean is_set_common_stats() {
    return this.common_stats != null;
  }

  public void set_common_stats_isSet(boolean value) {
    if (!value) {
      this.common_stats = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public SpecificAggregateStats get_specific_stats() {
    return this.specific_stats;
  }

  public void set_specific_stats(@org.apache.thrift.annotation.Nullable SpecificAggregateStats specific_stats) {
    this.specific_stats = specific_stats;
  }

  public void unset_specific_stats() {
    this.specific_stats = null;
  }

  /** Returns true if field specific_stats is set (has been assigned a value) and false otherwise */
  public boolean is_set_specific_stats() {
    return this.specific_stats != null;
  }

  public void set_specific_stats_isSet(boolean value) {
    if (!value) {
      this.specific_stats = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public ErrorInfo get_last_error() {
    return this.last_error;
  }

  public void set_last_error(@org.apache.thrift.annotation.Nullable ErrorInfo last_error) {
    this.last_error = last_error;
  }

  public void unset_last_error() {
    this.last_error = null;
  }

  /** Returns true if field last_error is set (has been assigned a value) and false otherwise */
  public boolean is_set_last_error() {
    return this.last_error != null;
  }

  public void set_last_error_isSet(boolean value) {
    if (!value) {
      this.last_error = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unset_type();
      } else {
        set_type((ComponentType)value);
      }
      break;

    case COMMON_STATS:
      if (value == null) {
        unset_common_stats();
      } else {
        set_common_stats((CommonAggregateStats)value);
      }
      break;

    case SPECIFIC_STATS:
      if (value == null) {
        unset_specific_stats();
      } else {
        set_specific_stats((SpecificAggregateStats)value);
      }
      break;

    case LAST_ERROR:
      if (value == null) {
        unset_last_error();
      } else {
        set_last_error((ErrorInfo)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return get_type();

    case COMMON_STATS:
      return get_common_stats();

    case SPECIFIC_STATS:
      return get_specific_stats();

    case LAST_ERROR:
      return get_last_error();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return is_set_type();
    case COMMON_STATS:
      return is_set_common_stats();
    case SPECIFIC_STATS:
      return is_set_specific_stats();
    case LAST_ERROR:
      return is_set_last_error();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ComponentAggregateStats)
      return this.equals((ComponentAggregateStats)that);
    return false;
  }

  public boolean equals(ComponentAggregateStats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.is_set_type();
    boolean that_present_type = true && that.is_set_type();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_common_stats = true && this.is_set_common_stats();
    boolean that_present_common_stats = true && that.is_set_common_stats();
    if (this_present_common_stats || that_present_common_stats) {
      if (!(this_present_common_stats && that_present_common_stats))
        return false;
      if (!this.common_stats.equals(that.common_stats))
        return false;
    }

    boolean this_present_specific_stats = true && this.is_set_specific_stats();
    boolean that_present_specific_stats = true && that.is_set_specific_stats();
    if (this_present_specific_stats || that_present_specific_stats) {
      if (!(this_present_specific_stats && that_present_specific_stats))
        return false;
      if (!this.specific_stats.equals(that.specific_stats))
        return false;
    }

    boolean this_present_last_error = true && this.is_set_last_error();
    boolean that_present_last_error = true && that.is_set_last_error();
    if (this_present_last_error || that_present_last_error) {
      if (!(this_present_last_error && that_present_last_error))
        return false;
      if (!this.last_error.equals(that.last_error))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_type()) ? 131071 : 524287);
    if (is_set_type())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((is_set_common_stats()) ? 131071 : 524287);
    if (is_set_common_stats())
      hashCode = hashCode * 8191 + common_stats.hashCode();

    hashCode = hashCode * 8191 + ((is_set_specific_stats()) ? 131071 : 524287);
    if (is_set_specific_stats())
      hashCode = hashCode * 8191 + specific_stats.hashCode();

    hashCode = hashCode * 8191 + ((is_set_last_error()) ? 131071 : 524287);
    if (is_set_last_error())
      hashCode = hashCode * 8191 + last_error.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ComponentAggregateStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_type()).compareTo(other.is_set_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_common_stats()).compareTo(other.is_set_common_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_common_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.common_stats, other.common_stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_specific_stats()).compareTo(other.is_set_specific_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_specific_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.specific_stats, other.specific_stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_last_error()).compareTo(other.is_set_last_error());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_last_error()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.last_error, other.last_error);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ComponentAggregateStats(");
    boolean first = true;

    if (is_set_type()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (is_set_common_stats()) {
      if (!first) sb.append(", ");
      sb.append("common_stats:");
      if (this.common_stats == null) {
        sb.append("null");
      } else {
        sb.append(this.common_stats);
      }
      first = false;
    }
    if (is_set_specific_stats()) {
      if (!first) sb.append(", ");
      sb.append("specific_stats:");
      if (this.specific_stats == null) {
        sb.append("null");
      } else {
        sb.append(this.specific_stats);
      }
      first = false;
    }
    if (is_set_last_error()) {
      if (!first) sb.append(", ");
      sb.append("last_error:");
      if (this.last_error == null) {
        sb.append("null");
      } else {
        sb.append(this.last_error);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (common_stats != null) {
      common_stats.validate();
    }
    if (last_error != null) {
      last_error.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ComponentAggregateStatsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ComponentAggregateStatsStandardScheme getScheme() {
      return new ComponentAggregateStatsStandardScheme();
    }
  }

  private static class ComponentAggregateStatsStandardScheme extends org.apache.thrift.scheme.StandardScheme<ComponentAggregateStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ComponentAggregateStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.storm.generated.ComponentType.findByValue(iprot.readI32());
              struct.set_type_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMMON_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.common_stats = new CommonAggregateStats();
              struct.common_stats.read(iprot);
              struct.set_common_stats_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPECIFIC_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.specific_stats = new SpecificAggregateStats();
              struct.specific_stats.read(iprot);
              struct.set_specific_stats_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LAST_ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.last_error = new ErrorInfo();
              struct.last_error.read(iprot);
              struct.set_last_error_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ComponentAggregateStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.is_set_type()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.common_stats != null) {
        if (struct.is_set_common_stats()) {
          oprot.writeFieldBegin(COMMON_STATS_FIELD_DESC);
          struct.common_stats.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.specific_stats != null) {
        if (struct.is_set_specific_stats()) {
          oprot.writeFieldBegin(SPECIFIC_STATS_FIELD_DESC);
          struct.specific_stats.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.last_error != null) {
        if (struct.is_set_last_error()) {
          oprot.writeFieldBegin(LAST_ERROR_FIELD_DESC);
          struct.last_error.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ComponentAggregateStatsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ComponentAggregateStatsTupleScheme getScheme() {
      return new ComponentAggregateStatsTupleScheme();
    }
  }

  private static class ComponentAggregateStatsTupleScheme extends org.apache.thrift.scheme.TupleScheme<ComponentAggregateStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ComponentAggregateStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_type()) {
        optionals.set(0);
      }
      if (struct.is_set_common_stats()) {
        optionals.set(1);
      }
      if (struct.is_set_specific_stats()) {
        optionals.set(2);
      }
      if (struct.is_set_last_error()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.is_set_type()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.is_set_common_stats()) {
        struct.common_stats.write(oprot);
      }
      if (struct.is_set_specific_stats()) {
        struct.specific_stats.write(oprot);
      }
      if (struct.is_set_last_error()) {
        struct.last_error.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ComponentAggregateStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.type = org.apache.storm.generated.ComponentType.findByValue(iprot.readI32());
        struct.set_type_isSet(true);
      }
      if (incoming.get(1)) {
        struct.common_stats = new CommonAggregateStats();
        struct.common_stats.read(iprot);
        struct.set_common_stats_isSet(true);
      }
      if (incoming.get(2)) {
        struct.specific_stats = new SpecificAggregateStats();
        struct.specific_stats.read(iprot);
        struct.set_specific_stats_isSet(true);
      }
      if (incoming.get(3)) {
        struct.last_error = new ErrorInfo();
        struct.last_error.read(iprot);
        struct.set_last_error_isSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

