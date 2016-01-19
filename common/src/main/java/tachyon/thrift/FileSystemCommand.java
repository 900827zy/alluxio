/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-19")
public class FileSystemCommand implements org.apache.thrift.TBase<FileSystemCommand, FileSystemCommand._Fields>, java.io.Serializable, Cloneable, Comparable<FileSystemCommand> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FileSystemCommand");

  private static final org.apache.thrift.protocol.TField COMMAND_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("commandType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COMMAND_OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("commandOptions", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FileSystemCommandStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FileSystemCommandTupleSchemeFactory());
  }

  /**
   * 
   * @see tachyon.thrift.CommandType
   */
  public tachyon.thrift.CommandType commandType; // required
  public FileSystemCommandOptions commandOptions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see tachyon.thrift.CommandType
     */
    COMMAND_TYPE((short)1, "commandType"),
    COMMAND_OPTIONS((short)2, "commandOptions");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COMMAND_TYPE
          return COMMAND_TYPE;
        case 2: // COMMAND_OPTIONS
          return COMMAND_OPTIONS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMAND_TYPE, new org.apache.thrift.meta_data.FieldMetaData("commandType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, tachyon.thrift.CommandType.class)));
    tmpMap.put(_Fields.COMMAND_OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("commandOptions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "FileSystemCommandOptions")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FileSystemCommand.class, metaDataMap);
  }

  public FileSystemCommand() {
  }

  public FileSystemCommand(
    tachyon.thrift.CommandType commandType,
    FileSystemCommandOptions commandOptions)
  {
    this();
    this.commandType = commandType;
    this.commandOptions = commandOptions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FileSystemCommand(FileSystemCommand other) {
    if (other.isSetCommandType()) {
      this.commandType = other.commandType;
    }
    if (other.isSetCommandOptions()) {
      this.commandOptions = other.commandOptions;
    }
  }

  public FileSystemCommand deepCopy() {
    return new FileSystemCommand(this);
  }

  @Override
  public void clear() {
    this.commandType = null;
    this.commandOptions = null;
  }

  /**
   * 
   * @see tachyon.thrift.CommandType
   */
  public tachyon.thrift.CommandType getCommandType() {
    return this.commandType;
  }

  /**
   * 
   * @see tachyon.thrift.CommandType
   */
  public FileSystemCommand setCommandType(tachyon.thrift.CommandType commandType) {
    this.commandType = commandType;
    return this;
  }

  public void unsetCommandType() {
    this.commandType = null;
  }

  /** Returns true if field commandType is set (has been assigned a value) and false otherwise */
  public boolean isSetCommandType() {
    return this.commandType != null;
  }

  public void setCommandTypeIsSet(boolean value) {
    if (!value) {
      this.commandType = null;
    }
  }

  public FileSystemCommandOptions getCommandOptions() {
    return this.commandOptions;
  }

  public FileSystemCommand setCommandOptions(FileSystemCommandOptions commandOptions) {
    this.commandOptions = commandOptions;
    return this;
  }

  public void unsetCommandOptions() {
    this.commandOptions = null;
  }

  /** Returns true if field commandOptions is set (has been assigned a value) and false otherwise */
  public boolean isSetCommandOptions() {
    return this.commandOptions != null;
  }

  public void setCommandOptionsIsSet(boolean value) {
    if (!value) {
      this.commandOptions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMMAND_TYPE:
      if (value == null) {
        unsetCommandType();
      } else {
        setCommandType((tachyon.thrift.CommandType)value);
      }
      break;

    case COMMAND_OPTIONS:
      if (value == null) {
        unsetCommandOptions();
      } else {
        setCommandOptions((FileSystemCommandOptions)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMAND_TYPE:
      return getCommandType();

    case COMMAND_OPTIONS:
      return getCommandOptions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMMAND_TYPE:
      return isSetCommandType();
    case COMMAND_OPTIONS:
      return isSetCommandOptions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FileSystemCommand)
      return this.equals((FileSystemCommand)that);
    return false;
  }

  public boolean equals(FileSystemCommand that) {
    if (that == null)
      return false;

    boolean this_present_commandType = true && this.isSetCommandType();
    boolean that_present_commandType = true && that.isSetCommandType();
    if (this_present_commandType || that_present_commandType) {
      if (!(this_present_commandType && that_present_commandType))
        return false;
      if (!this.commandType.equals(that.commandType))
        return false;
    }

    boolean this_present_commandOptions = true && this.isSetCommandOptions();
    boolean that_present_commandOptions = true && that.isSetCommandOptions();
    if (this_present_commandOptions || that_present_commandOptions) {
      if (!(this_present_commandOptions && that_present_commandOptions))
        return false;
      if (!this.commandOptions.equals(that.commandOptions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_commandType = true && (isSetCommandType());
    list.add(present_commandType);
    if (present_commandType)
      list.add(commandType.getValue());

    boolean present_commandOptions = true && (isSetCommandOptions());
    list.add(present_commandOptions);
    if (present_commandOptions)
      list.add(commandOptions);

    return list.hashCode();
  }

  @Override
  public int compareTo(FileSystemCommand other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCommandType()).compareTo(other.isSetCommandType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommandType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commandType, other.commandType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommandOptions()).compareTo(other.isSetCommandOptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommandOptions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commandOptions, other.commandOptions);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FileSystemCommand(");
    boolean first = true;

    sb.append("commandType:");
    if (this.commandType == null) {
      sb.append("null");
    } else {
      sb.append(this.commandType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("commandOptions:");
    if (this.commandOptions == null) {
      sb.append("null");
    } else {
      sb.append(this.commandOptions);
    }
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FileSystemCommandStandardSchemeFactory implements SchemeFactory {
    public FileSystemCommandStandardScheme getScheme() {
      return new FileSystemCommandStandardScheme();
    }
  }

  private static class FileSystemCommandStandardScheme extends StandardScheme<FileSystemCommand> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FileSystemCommand struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMAND_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.commandType = tachyon.thrift.CommandType.findByValue(iprot.readI32());
              struct.setCommandTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMMAND_OPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.commandOptions = new FileSystemCommandOptions();
              struct.commandOptions.read(iprot);
              struct.setCommandOptionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FileSystemCommand struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.commandType != null) {
        oprot.writeFieldBegin(COMMAND_TYPE_FIELD_DESC);
        oprot.writeI32(struct.commandType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.commandOptions != null) {
        oprot.writeFieldBegin(COMMAND_OPTIONS_FIELD_DESC);
        struct.commandOptions.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FileSystemCommandTupleSchemeFactory implements SchemeFactory {
    public FileSystemCommandTupleScheme getScheme() {
      return new FileSystemCommandTupleScheme();
    }
  }

  private static class FileSystemCommandTupleScheme extends TupleScheme<FileSystemCommand> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FileSystemCommand struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCommandType()) {
        optionals.set(0);
      }
      if (struct.isSetCommandOptions()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCommandType()) {
        oprot.writeI32(struct.commandType.getValue());
      }
      if (struct.isSetCommandOptions()) {
        struct.commandOptions.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FileSystemCommand struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.commandType = tachyon.thrift.CommandType.findByValue(iprot.readI32());
        struct.setCommandTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.commandOptions = new FileSystemCommandOptions();
        struct.commandOptions.read(iprot);
        struct.setCommandOptionsIsSet(true);
      }
    }
  }

}

