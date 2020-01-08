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
public class SupervisorPageInfo implements org.apache.thrift.TBase<SupervisorPageInfo, SupervisorPageInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SupervisorPageInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SupervisorPageInfo");

  private static final org.apache.thrift.protocol.TField SUPERVISOR_SUMMARIES_FIELD_DESC = new org.apache.thrift.protocol.TField("supervisor_summaries", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField WORKER_SUMMARIES_FIELD_DESC = new org.apache.thrift.protocol.TField("worker_summaries", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SupervisorPageInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SupervisorPageInfoTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<SupervisorSummary> supervisor_summaries; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<WorkerSummary> worker_summaries; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUPERVISOR_SUMMARIES((short)1, "supervisor_summaries"),
    WORKER_SUMMARIES((short)2, "worker_summaries");

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
        case 1: // SUPERVISOR_SUMMARIES
          return SUPERVISOR_SUMMARIES;
        case 2: // WORKER_SUMMARIES
          return WORKER_SUMMARIES;
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
  private static final _Fields optionals[] = {_Fields.SUPERVISOR_SUMMARIES,_Fields.WORKER_SUMMARIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUPERVISOR_SUMMARIES, new org.apache.thrift.meta_data.FieldMetaData("supervisor_summaries", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SupervisorSummary.class))));
    tmpMap.put(_Fields.WORKER_SUMMARIES, new org.apache.thrift.meta_data.FieldMetaData("worker_summaries", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WorkerSummary.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SupervisorPageInfo.class, metaDataMap);
  }

  public SupervisorPageInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SupervisorPageInfo(SupervisorPageInfo other) {
    if (other.is_set_supervisor_summaries()) {
      java.util.List<SupervisorSummary> __this__supervisor_summaries = new java.util.ArrayList<SupervisorSummary>(other.supervisor_summaries.size());
      for (SupervisorSummary other_element : other.supervisor_summaries) {
        __this__supervisor_summaries.add(new SupervisorSummary(other_element));
      }
      this.supervisor_summaries = __this__supervisor_summaries;
    }
    if (other.is_set_worker_summaries()) {
      java.util.List<WorkerSummary> __this__worker_summaries = new java.util.ArrayList<WorkerSummary>(other.worker_summaries.size());
      for (WorkerSummary other_element : other.worker_summaries) {
        __this__worker_summaries.add(new WorkerSummary(other_element));
      }
      this.worker_summaries = __this__worker_summaries;
    }
  }

  public SupervisorPageInfo deepCopy() {
    return new SupervisorPageInfo(this);
  }

  @Override
  public void clear() {
    this.supervisor_summaries = null;
    this.worker_summaries = null;
  }

  public int get_supervisor_summaries_size() {
    return (this.supervisor_summaries == null) ? 0 : this.supervisor_summaries.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SupervisorSummary> get_supervisor_summaries_iterator() {
    return (this.supervisor_summaries == null) ? null : this.supervisor_summaries.iterator();
  }

  public void add_to_supervisor_summaries(SupervisorSummary elem) {
    if (this.supervisor_summaries == null) {
      this.supervisor_summaries = new java.util.ArrayList<SupervisorSummary>();
    }
    this.supervisor_summaries.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SupervisorSummary> get_supervisor_summaries() {
    return this.supervisor_summaries;
  }

  public void set_supervisor_summaries(@org.apache.thrift.annotation.Nullable java.util.List<SupervisorSummary> supervisor_summaries) {
    this.supervisor_summaries = supervisor_summaries;
  }

  public void unset_supervisor_summaries() {
    this.supervisor_summaries = null;
  }

  /** Returns true if field supervisor_summaries is set (has been assigned a value) and false otherwise */
  public boolean is_set_supervisor_summaries() {
    return this.supervisor_summaries != null;
  }

  public void set_supervisor_summaries_isSet(boolean value) {
    if (!value) {
      this.supervisor_summaries = null;
    }
  }

  public int get_worker_summaries_size() {
    return (this.worker_summaries == null) ? 0 : this.worker_summaries.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<WorkerSummary> get_worker_summaries_iterator() {
    return (this.worker_summaries == null) ? null : this.worker_summaries.iterator();
  }

  public void add_to_worker_summaries(WorkerSummary elem) {
    if (this.worker_summaries == null) {
      this.worker_summaries = new java.util.ArrayList<WorkerSummary>();
    }
    this.worker_summaries.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<WorkerSummary> get_worker_summaries() {
    return this.worker_summaries;
  }

  public void set_worker_summaries(@org.apache.thrift.annotation.Nullable java.util.List<WorkerSummary> worker_summaries) {
    this.worker_summaries = worker_summaries;
  }

  public void unset_worker_summaries() {
    this.worker_summaries = null;
  }

  /** Returns true if field worker_summaries is set (has been assigned a value) and false otherwise */
  public boolean is_set_worker_summaries() {
    return this.worker_summaries != null;
  }

  public void set_worker_summaries_isSet(boolean value) {
    if (!value) {
      this.worker_summaries = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SUPERVISOR_SUMMARIES:
      if (value == null) {
        unset_supervisor_summaries();
      } else {
        set_supervisor_summaries((java.util.List<SupervisorSummary>)value);
      }
      break;

    case WORKER_SUMMARIES:
      if (value == null) {
        unset_worker_summaries();
      } else {
        set_worker_summaries((java.util.List<WorkerSummary>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUPERVISOR_SUMMARIES:
      return get_supervisor_summaries();

    case WORKER_SUMMARIES:
      return get_worker_summaries();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUPERVISOR_SUMMARIES:
      return is_set_supervisor_summaries();
    case WORKER_SUMMARIES:
      return is_set_worker_summaries();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SupervisorPageInfo)
      return this.equals((SupervisorPageInfo)that);
    return false;
  }

  public boolean equals(SupervisorPageInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_supervisor_summaries = true && this.is_set_supervisor_summaries();
    boolean that_present_supervisor_summaries = true && that.is_set_supervisor_summaries();
    if (this_present_supervisor_summaries || that_present_supervisor_summaries) {
      if (!(this_present_supervisor_summaries && that_present_supervisor_summaries))
        return false;
      if (!this.supervisor_summaries.equals(that.supervisor_summaries))
        return false;
    }

    boolean this_present_worker_summaries = true && this.is_set_worker_summaries();
    boolean that_present_worker_summaries = true && that.is_set_worker_summaries();
    if (this_present_worker_summaries || that_present_worker_summaries) {
      if (!(this_present_worker_summaries && that_present_worker_summaries))
        return false;
      if (!this.worker_summaries.equals(that.worker_summaries))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_supervisor_summaries()) ? 131071 : 524287);
    if (is_set_supervisor_summaries())
      hashCode = hashCode * 8191 + supervisor_summaries.hashCode();

    hashCode = hashCode * 8191 + ((is_set_worker_summaries()) ? 131071 : 524287);
    if (is_set_worker_summaries())
      hashCode = hashCode * 8191 + worker_summaries.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SupervisorPageInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_supervisor_summaries()).compareTo(other.is_set_supervisor_summaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_supervisor_summaries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.supervisor_summaries, other.supervisor_summaries);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_worker_summaries()).compareTo(other.is_set_worker_summaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_worker_summaries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.worker_summaries, other.worker_summaries);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SupervisorPageInfo(");
    boolean first = true;

    if (is_set_supervisor_summaries()) {
      sb.append("supervisor_summaries:");
      if (this.supervisor_summaries == null) {
        sb.append("null");
      } else {
        sb.append(this.supervisor_summaries);
      }
      first = false;
    }
    if (is_set_worker_summaries()) {
      if (!first) sb.append(", ");
      sb.append("worker_summaries:");
      if (this.worker_summaries == null) {
        sb.append("null");
      } else {
        sb.append(this.worker_summaries);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SupervisorPageInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SupervisorPageInfoStandardScheme getScheme() {
      return new SupervisorPageInfoStandardScheme();
    }
  }

  private static class SupervisorPageInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SupervisorPageInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SupervisorPageInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // SUPERVISOR_SUMMARIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list466 = iprot.readListBegin();
                struct.supervisor_summaries = new java.util.ArrayList<SupervisorSummary>(_list466.size);
                @org.apache.thrift.annotation.Nullable SupervisorSummary _elem467;
                for (int _i468 = 0; _i468 < _list466.size; ++_i468)
                {
                  _elem467 = new SupervisorSummary();
                  _elem467.read(iprot);
                  struct.supervisor_summaries.add(_elem467);
                }
                iprot.readListEnd();
              }
              struct.set_supervisor_summaries_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WORKER_SUMMARIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list469 = iprot.readListBegin();
                struct.worker_summaries = new java.util.ArrayList<WorkerSummary>(_list469.size);
                @org.apache.thrift.annotation.Nullable WorkerSummary _elem470;
                for (int _i471 = 0; _i471 < _list469.size; ++_i471)
                {
                  _elem470 = new WorkerSummary();
                  _elem470.read(iprot);
                  struct.worker_summaries.add(_elem470);
                }
                iprot.readListEnd();
              }
              struct.set_worker_summaries_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SupervisorPageInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.supervisor_summaries != null) {
        if (struct.is_set_supervisor_summaries()) {
          oprot.writeFieldBegin(SUPERVISOR_SUMMARIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.supervisor_summaries.size()));
            for (SupervisorSummary _iter472 : struct.supervisor_summaries)
            {
              _iter472.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.worker_summaries != null) {
        if (struct.is_set_worker_summaries()) {
          oprot.writeFieldBegin(WORKER_SUMMARIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.worker_summaries.size()));
            for (WorkerSummary _iter473 : struct.worker_summaries)
            {
              _iter473.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SupervisorPageInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SupervisorPageInfoTupleScheme getScheme() {
      return new SupervisorPageInfoTupleScheme();
    }
  }

  private static class SupervisorPageInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SupervisorPageInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SupervisorPageInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_supervisor_summaries()) {
        optionals.set(0);
      }
      if (struct.is_set_worker_summaries()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.is_set_supervisor_summaries()) {
        {
          oprot.writeI32(struct.supervisor_summaries.size());
          for (SupervisorSummary _iter474 : struct.supervisor_summaries)
          {
            _iter474.write(oprot);
          }
        }
      }
      if (struct.is_set_worker_summaries()) {
        {
          oprot.writeI32(struct.worker_summaries.size());
          for (WorkerSummary _iter475 : struct.worker_summaries)
          {
            _iter475.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SupervisorPageInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list476 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.supervisor_summaries = new java.util.ArrayList<SupervisorSummary>(_list476.size);
          @org.apache.thrift.annotation.Nullable SupervisorSummary _elem477;
          for (int _i478 = 0; _i478 < _list476.size; ++_i478)
          {
            _elem477 = new SupervisorSummary();
            _elem477.read(iprot);
            struct.supervisor_summaries.add(_elem477);
          }
        }
        struct.set_supervisor_summaries_isSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list479 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.worker_summaries = new java.util.ArrayList<WorkerSummary>(_list479.size);
          @org.apache.thrift.annotation.Nullable WorkerSummary _elem480;
          for (int _i481 = 0; _i481 < _list479.size; ++_i481)
          {
            _elem480 = new WorkerSummary();
            _elem480.read(iprot);
            struct.worker_summaries.add(_elem480);
          }
        }
        struct.set_worker_summaries_isSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

