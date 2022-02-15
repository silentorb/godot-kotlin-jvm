// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class GLTFDocument : Resource() {
  public open var extensions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_GET_EXTENSIONS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_SET_EXTENSIONS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GLTFDOCUMENT)
  }

  public open fun appendFromFile(
    path: String,
    state: GLTFState,
    flags: Long = 0,
    bakeFps: Long = 30
  ): GodotError {
    TransferContext.writeArguments(STRING to path, OBJECT to state, LONG to flags, LONG to bakeFps)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_APPEND_FROM_FILE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun appendFromBuffer(
    bytes: PackedByteArray,
    basePath: String,
    state: GLTFState,
    flags: Long = 0,
    bakeFps: Long = 30
  ): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to bytes, STRING to basePath, OBJECT to state,
        LONG to flags, LONG to bakeFps)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_APPEND_FROM_BUFFER,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun appendFromScene(
    node: Node,
    state: GLTFState,
    flags: Long = 0,
    bakeFps: Long = 30
  ): GodotError {
    TransferContext.writeArguments(OBJECT to node, OBJECT to state, LONG to flags, LONG to bakeFps)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_APPEND_FROM_SCENE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun generateScene(state: GLTFState, bakeFps: Long = 30): Node? {
    TransferContext.writeArguments(OBJECT to state, LONG to bakeFps)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_GENERATE_SCENE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  public open fun generateBuffer(state: GLTFState): PackedByteArray {
    TransferContext.writeArguments(OBJECT to state)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_GENERATE_BUFFER,
        PACKED_BYTE_ARRAY)
    return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
  }

  public open fun writeToFilesystem(state: GLTFState, path: String): GodotError {
    TransferContext.writeArguments(OBJECT to state, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GLTFDOCUMENT_WRITE_TO_FILESYSTEM,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
