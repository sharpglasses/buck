/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class StartBuildResponse implements org.apache.thrift.TBase<StartBuildResponse, StartBuildResponse._Fields>, java.io.Serializable, Cloneable, Comparable<StartBuildResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StartBuildResponse");

  private static final org.apache.thrift.protocol.TField BUILD_JOB_FIELD_DESC = new org.apache.thrift.protocol.TField("buildJob", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StartBuildResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StartBuildResponseTupleSchemeFactory();

  public BuildJob buildJob; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUILD_JOB((short)1, "buildJob");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BUILD_JOB
          return BUILD_JOB;
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
  private static final _Fields optionals[] = {_Fields.BUILD_JOB};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUILD_JOB, new org.apache.thrift.meta_data.FieldMetaData("buildJob", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJob.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StartBuildResponse.class, metaDataMap);
  }

  public StartBuildResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StartBuildResponse(StartBuildResponse other) {
    if (other.isSetBuildJob()) {
      this.buildJob = new BuildJob(other.buildJob);
    }
  }

  public StartBuildResponse deepCopy() {
    return new StartBuildResponse(this);
  }

  @Override
  public void clear() {
    this.buildJob = null;
  }

  public BuildJob getBuildJob() {
    return this.buildJob;
  }

  public StartBuildResponse setBuildJob(BuildJob buildJob) {
    this.buildJob = buildJob;
    return this;
  }

  public void unsetBuildJob() {
    this.buildJob = null;
  }

  /** Returns true if field buildJob is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildJob() {
    return this.buildJob != null;
  }

  public void setBuildJobIsSet(boolean value) {
    if (!value) {
      this.buildJob = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case BUILD_JOB:
      if (value == null) {
        unsetBuildJob();
      } else {
        setBuildJob((BuildJob)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BUILD_JOB:
      return getBuildJob();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BUILD_JOB:
      return isSetBuildJob();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof StartBuildResponse)
      return this.equals((StartBuildResponse)that);
    return false;
  }

  public boolean equals(StartBuildResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_buildJob = true && this.isSetBuildJob();
    boolean that_present_buildJob = true && that.isSetBuildJob();
    if (this_present_buildJob || that_present_buildJob) {
      if (!(this_present_buildJob && that_present_buildJob))
        return false;
      if (!this.buildJob.equals(that.buildJob))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBuildJob()) ? 131071 : 524287);
    if (isSetBuildJob())
      hashCode = hashCode * 8191 + buildJob.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(StartBuildResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetBuildJob()).compareTo(other.isSetBuildJob());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildJob()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildJob, other.buildJob);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StartBuildResponse(");
    boolean first = true;

    if (isSetBuildJob()) {
      sb.append("buildJob:");
      if (this.buildJob == null) {
        sb.append("null");
      } else {
        sb.append(this.buildJob);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (buildJob != null) {
      buildJob.validate();
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

  private static class StartBuildResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StartBuildResponseStandardScheme getScheme() {
      return new StartBuildResponseStandardScheme();
    }
  }

  private static class StartBuildResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<StartBuildResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StartBuildResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUILD_JOB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildJob = new BuildJob();
              struct.buildJob.read(iprot);
              struct.setBuildJobIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StartBuildResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.buildJob != null) {
        if (struct.isSetBuildJob()) {
          oprot.writeFieldBegin(BUILD_JOB_FIELD_DESC);
          struct.buildJob.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StartBuildResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StartBuildResponseTupleScheme getScheme() {
      return new StartBuildResponseTupleScheme();
    }
  }

  private static class StartBuildResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<StartBuildResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StartBuildResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBuildJob()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBuildJob()) {
        struct.buildJob.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StartBuildResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.buildJob = new BuildJob();
        struct.buildJob.read(iprot);
        struct.setBuildJobIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

