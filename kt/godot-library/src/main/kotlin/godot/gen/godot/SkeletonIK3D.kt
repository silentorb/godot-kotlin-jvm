// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/523](https://godotengine.org/asset-library/asset/523)
 */
@GodotBaseType
public open class SkeletonIK3D : Node() {
  /**
   *
   */
  public open var rootBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_ROOT_BONE,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_ROOT_BONE, NIL)
    }

  /**
   *
   */
  public open var tipBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TIP_BONE,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TIP_BONE, NIL)
    }

  /**
   *
   */
  public open var interpolation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_INTERPOLATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_INTERPOLATION,
          NIL)
    }

  /**
   *
   */
  public open var target: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TARGET,
          TRANSFORM3D)
      return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TARGET, NIL)
    }

  /**
   *
   */
  public open var overrideTipBasis: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_OVERRIDE_TIP_BASIS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_OVERRIDE_TIP_BASIS, NIL)
    }

  /**
   *
   */
  public open var useMagnet: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_USE_MAGNET, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_USE_MAGNET, NIL)
    }

  /**
   *
   */
  public open var magnet: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MAGNET, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MAGNET, NIL)
    }

  /**
   *
   */
  public open var targetNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_TARGET_NODE,
          NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_TARGET_NODE, NIL)
    }

  /**
   *
   */
  public open var minDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MIN_DISTANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MIN_DISTANCE,
          NIL)
    }

  /**
   *
   */
  public open var maxIterations: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_MAX_ITERATIONS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_SET_MAX_ITERATIONS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONIK3D)
  }

  /**
   *
   */
  public open fun getParentSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_GET_PARENT_SKELETON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Skeleton3D?
  }

  /**
   *
   */
  public open fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_IS_RUNNING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun start(oneTime: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to oneTime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_START, NIL)
  }

  /**
   *
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONIK3D_STOP, NIL)
  }

  public companion object
}
