// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Detects approximately when the node is visible on screen.
 *
 * The VisibleOnScreenNotifier3D detects when it is visible on the screen. It also notifies when its bounding rectangle enters or exits the screen or a [godot.Camera3D]'s view.
 *
 * If you want nodes to be disabled automatically when they exit the screen, use [godot.VisibleOnScreenEnabler3D] instead.
 *
 * **Note:** VisibleOnScreenNotifier3D uses an approximate heuristic for performance reasons. It doesn't take walls and other occlusion into account. The heuristic is an implementation detail and may change in future versions. If you need precise visibility checking, use another method such as adding an [godot.Area3D] node as a child of a [godot.Camera3D] node and/or [godot.Vector3.dot].
 */
@GodotBaseType
public open class VisibleOnScreenNotifier3D : VisualInstance3D() {
  /**
   * Emitted when the VisibleOnScreenNotifier3D enters the screen.
   */
  public val screenEntered: Signal0 by signal()

  /**
   * Emitted when the VisibleOnScreenNotifier3D exits the screen.
   */
  public val screenExited: Signal0 by signal()

  /**
   * The VisibleOnScreenNotifier3D's bounding box.
   */
  public open var aabb: AABB
    @JvmName("getAabb_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getAabb()
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENNOTIFIER3D_SET_AABB, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISIBLEONSCREENNOTIFIER3D)
  }

  /**
   * If `true`, the bounding box is on the screen.
   *
   * **Note:** It takes one frame for the node's visibility to be assessed once added to the scene tree, so this method will return `false` right after it is instantiated, even if it will be on screen in the draw pass.
   */
  public open fun isOnScreen(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENNOTIFIER3D_IS_ON_SCREEN, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}