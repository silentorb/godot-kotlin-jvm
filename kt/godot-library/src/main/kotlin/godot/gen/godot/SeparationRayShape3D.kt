// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Separation ray shape for 3D collisions.
 *
 * Separation ray shape for 3D collisions, which can be set into a [godot.PhysicsBody3D] or [godot.Area3D]. A ray is not really a collision body; instead, it tries to separate itself from whatever is touching its far endpoint. It's often useful for characters.
 */
@GodotBaseType
public open class SeparationRayShape3D : Shape3D() {
  /**
   * The ray's length.
   */
  public open var length: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEPARATIONRAYSHAPE3D_GET_LENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEPARATIONRAYSHAPE3D_SET_LENGTH,
          NIL)
    }

  /**
   * If `false` (default), the shape always separates and returns a normal along its own direction.
   *
   * If `true`, the shape can return the correct normal and separate in any direction, allowing sliding motion on slopes.
   */
  public open var slideOnSlope: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SEPARATIONRAYSHAPE3D_GET_SLIDE_ON_SLOPE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SEPARATIONRAYSHAPE3D_SET_SLIDE_ON_SLOPE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SEPARATIONRAYSHAPE3D)
  }

  public companion object
}
