// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Provides a base class for different kinds of light nodes.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Light3D is the *abstract* base class for light nodes. As it can't be instantiated, it shouldn't be used directly. Other types of light nodes inherit from it. Light3D contains the common variables and parameters used for lighting.
 */
@GodotBaseType
public open class Light3D : VisualInstance3D() {
  /**
   * The light's color. An *overbright* color can be used to achieve a result equivalent to increasing the light's [lightEnergy].
   */
  public open var lightColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_LIGHT_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_LIGHT_COLOR, NIL)
    }

  /**
   * [godot.Texture2D] projected by light. [shadowEnabled] must be on for the projector to work. Light projectors make the light appear as if it is shining through a colored but transparent object, almost like light shining through stained-glass.
   */
  public open var lightProjector: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_LIGHT_PROJECTOR,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_LIGHT_PROJECTOR, NIL)
    }

  /**
   * If `true`, the light's effect is reversed, darkening areas and casting bright shadows.
   */
  public open var lightNegative: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_LIGHT_NEGATIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_LIGHT_NEGATIVE, NIL)
    }

  /**
   * The light's bake mode. This will affect the global illumination techniques that have an effect on the light's rendering. See [enum BakeMode].
   *
   * **Note:** Meshes' global illumination mode will also affect the global illumination rendering. See [godot.GeometryInstance3D.giMode].
   */
  public open var lightBakeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_LIGHT_BAKE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_LIGHT_BAKE_MODE, NIL)
    }

  /**
   * The light will affect objects in the selected layers.
   */
  public open var lightCullMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_LIGHT_CULL_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_LIGHT_CULL_MASK, NIL)
    }

  /**
   * If `true`, the light will cast shadows.
   */
  public open var shadowEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_SHADOW_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_SHADOW_ENABLED, NIL)
    }

  /**
   * The color of shadows cast by this light.
   */
  public open var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_SHADOW_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_SHADOW_COLOR, NIL)
    }

  /**
   * If `true`, reverses the backface culling of the mesh. This can be useful when you have a flat mesh that has a light behind it. If you need to cast a shadow on both sides of the mesh, set the mesh to use double-sided shadows with [godot.GeometryInstance3D.SHADOW_CASTING_SETTING_DOUBLE_SIDED].
   */
  public open var shadowReverseCullFace: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_SHADOW_REVERSE_CULL_FACE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_SHADOW_REVERSE_CULL_FACE, NIL)
    }

  /**
   * If `true`, the light only appears in the editor and will not be visible at runtime.
   */
  public open var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_EDITOR_ONLY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_EDITOR_ONLY, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LIGHT3D)
  }

  /**
   * Sets the value of the specified [enum Light3D.Param] parameter.
   */
  public open fun setParam(`param`: Light3D.Param, `value`: Double): Unit {
    TransferContext.writeArguments(LONG to param.id, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_SET_PARAM, NIL)
  }

  /**
   * Returns the value of the specified [enum Light3D.Param] parameter.
   */
  public open fun getParam(`param`: Light3D.Param): Double {
    TransferContext.writeArguments(LONG to param.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LIGHT3D_GET_PARAM, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public enum class BakeMode(
    id: Long
  ) {
    /**
     * Light is ignored when baking. This is the fastest mode, but the light will be taken into account when baking global illumination. This mode should generally be used for dynamic lights that change quickly, as the effect of global illumination is less noticeable on those lights.
     *
     * **Note:** Hiding a light does *not* affect baking [godot.LightmapGI]. Hiding a light will still affect baking [godot.VoxelGI] and SDFGI (see [member Environment.sdfgi_enabled).
     */
    BAKE_DISABLED(0),
    /**
     * Light is taken into account in static baking ([godot.VoxelGI], [godot.LightmapGI], SDFGI ([godot.Environment.sdfgiEnabled])). The light can be moved around or modified, but its global illumination will not update in real-time. This is suitable for subtle changes (such as flickering torches), but generally not large changes such as toggling a light on and off.
     */
    BAKE_STATIC(1),
    /**
     * Light is taken into account in dynamic baking ([godot.VoxelGI] and SDFGI ([godot.Environment.sdfgiEnabled]) only). The light can be moved around or modified with global illumination updating in real-time. The light's global illumination appearance will be slightly different compared to [BAKE_STATIC]. This has a greater performance cost compared to [BAKE_STATIC].
     */
    BAKE_DYNAMIC(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Param(
    id: Long
  ) {
    /**
     * Constant for accessing [lightEnergy].
     */
    PARAM_ENERGY(0),
    /**
     * Constant for accessing [lightIndirectEnergy].
     */
    PARAM_INDIRECT_ENERGY(1),
    /**
     * Constant for accessing [lightSpecular].
     */
    PARAM_SPECULAR(2),
    /**
     * Constant for accessing [godot.OmniLight3D.omniRange] or [godot.SpotLight3D.spotRange].
     */
    PARAM_RANGE(3),
    /**
     * Constant for accessing [lightSize].
     */
    PARAM_SIZE(4),
    /**
     * Constant for accessing [godot.OmniLight3D.omniAttenuation] or [godot.SpotLight3D.spotAttenuation].
     */
    PARAM_ATTENUATION(5),
    /**
     * Constant for accessing [godot.SpotLight3D.spotAngle].
     */
    PARAM_SPOT_ANGLE(6),
    /**
     * Constant for accessing [godot.SpotLight3D.spotAngleAttenuation].
     */
    PARAM_SPOT_ATTENUATION(7),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowMaxDistance].
     */
    PARAM_SHADOW_MAX_DISTANCE(8),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowSplit1].
     */
    PARAM_SHADOW_SPLIT_1_OFFSET(9),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowSplit2].
     */
    PARAM_SHADOW_SPLIT_2_OFFSET(10),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowSplit3].
     */
    PARAM_SHADOW_SPLIT_3_OFFSET(11),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowFadeStart].
     */
    PARAM_SHADOW_FADE_START(12),
    /**
     * Constant for accessing [shadowNormalBias].
     */
    PARAM_SHADOW_NORMAL_BIAS(13),
    /**
     * Constant for accessing [shadowBias].
     */
    PARAM_SHADOW_BIAS(14),
    /**
     * Constant for accessing [godot.DirectionalLight3D.directionalShadowPancakeSize].
     */
    PARAM_SHADOW_PANCAKE_SIZE(15),
    /**
     * Constant for accessing [shadowBlur].
     */
    PARAM_SHADOW_BLUR(16),
    /**
     *
     */
    PARAM_SHADOW_VOLUMETRIC_FOG_FADE(17),
    /**
     * Constant for accessing [shadowTransmittanceBias].
     */
    PARAM_TRANSMITTANCE_BIAS(18),
    /**
     * Represents the size of the [enum Param] enum.
     */
    PARAM_MAX(19),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
