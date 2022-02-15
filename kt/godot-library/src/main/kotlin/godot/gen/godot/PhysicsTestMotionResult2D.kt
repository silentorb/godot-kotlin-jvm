// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Result from a 2D body motion test.
 *
 * This class contains the motion and collision result from [godot.PhysicsServer2D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionResult2D : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONRESULT2D)
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public open fun getTravel(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_TRAVEL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public open fun getRemainder(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_REMAINDER, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the point of collision in global coordinates, if a collision occurred.
   */
  public open fun getCollisionPoint(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLISION_POINT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision, if a collision occurred.
   */
  public open fun getCollisionNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLISION_NORMAL, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the colliding body's velocity, if a collision occurred.
   */
  public open fun getColliderVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLIDER_VELOCITY, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [godot.Object], if a collision occurred. See [godot.Object.getInstanceId].
   */
  public open fun getColliderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLIDER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the colliding body's [RID] used by the [godot.PhysicsServer2D], if a collision occurred.
   */
  public open fun getColliderRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLIDER_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the colliding body's attached [godot.Object], if a collision occurred.
   */
  public open fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLIDER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the colliding body's shape index, if a collision occurred. See [godot.CollisionObject2D].
   */
  public open fun getColliderShape(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLIDER_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the moving object's colliding shape, if a collision occurred.
   */
  public open fun getCollisionLocalShape(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLISION_LOCAL_SHAPE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the length of overlap along the collision normal, if a collision occurred.
   */
  public open fun getCollisionDepth(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLISION_DEPTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the maximum fraction of the motion that can occur without a collision, between `0` and `1`.
   */
  public open fun getCollisionSafeFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLISION_SAFE_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the minimum fraction of the motion needed to collide, if a collision occurred, between `0` and `1`.
   */
  public open fun getCollisionUnsafeFraction(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSTESTMOTIONRESULT2D_GET_COLLISION_UNSAFE_FRACTION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}