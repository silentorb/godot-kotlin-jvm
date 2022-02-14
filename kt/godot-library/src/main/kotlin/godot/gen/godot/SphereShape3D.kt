// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Sphere shape for 3D collisions.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/675](https://godotengine.org/asset-library/asset/675)
 *
 * Sphere shape for 3D collisions, which can be set into a [godot.PhysicsBody3D] or [godot.Area3D]. This shape is useful for modeling sphere-like 3D objects.
 */
@GodotBaseType
public open class SphereShape3D : Shape3D() {
  /**
   * The sphere's radius. The shape's diameter is double the radius.
   */
  public open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPHERESHAPE3D_GET_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPHERESHAPE3D_SET_RADIUS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPHERESHAPE3D)
  }

  public companion object
}
