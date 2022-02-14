// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat64Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_FLOAT_64_ARRAY
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFAccessor : Resource() {
  public open var bufferView: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_BUFFER_VIEW,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_BUFFER_VIEW, NIL)
    }

  public open var byteOffset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_BYTE_OFFSET,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_BYTE_OFFSET, NIL)
    }

  public open var componentType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_COMPONENT_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_COMPONENT_TYPE,
          NIL)
    }

  public open var normalized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_NORMALIZED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_NORMALIZED, NIL)
    }

  public open var count: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_COUNT, NIL)
    }

  public open var type: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_TYPE, NIL)
    }

  public open var min: PackedFloat64Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_MIN,
          PACKED_FLOAT_64_ARRAY)
      return TransferContext.readReturnValue(PACKED_FLOAT_64_ARRAY, false) as PackedFloat64Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_64_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_MIN, NIL)
    }

  public open var max: PackedFloat64Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_MAX,
          PACKED_FLOAT_64_ARRAY)
      return TransferContext.readReturnValue(PACKED_FLOAT_64_ARRAY, false) as PackedFloat64Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_64_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_MAX, NIL)
    }

  public open var sparseCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_SPARSE_COUNT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_SPARSE_COUNT,
          NIL)
    }

  public open var sparseIndicesBufferView: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_SPARSE_INDICES_BUFFER_VIEW, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_SPARSE_INDICES_BUFFER_VIEW, NIL)
    }

  public open var sparseIndicesByteOffset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_SPARSE_INDICES_BYTE_OFFSET, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_SPARSE_INDICES_BYTE_OFFSET, NIL)
    }

  public open var sparseIndicesComponentType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_SPARSE_INDICES_COMPONENT_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_SPARSE_INDICES_COMPONENT_TYPE, NIL)
    }

  public open var sparseValuesBufferView: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_SPARSE_VALUES_BUFFER_VIEW, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_SPARSE_VALUES_BUFFER_VIEW, NIL)
    }

  public open var sparseValuesByteOffset: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_GET_SPARSE_VALUES_BYTE_OFFSET, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_GLTFACCESSOR_SET_SPARSE_VALUES_BYTE_OFFSET, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFACCESSOR)
  }

  public companion object
}
