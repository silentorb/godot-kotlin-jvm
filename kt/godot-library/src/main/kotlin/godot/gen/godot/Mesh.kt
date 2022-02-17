// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR2I
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.Resource] that contains vertex array-based geometry.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Mesh is a type of [godot.Resource] that contains vertex array-based geometry, divided in *surfaces*. Each surface contains a completely separate array and a material used to draw it. Design wise, a mesh with multiple surfaces is preferred to a single surface, because objects created in 3D editing software commonly contain multiple materials.
 */
@GodotBaseType
public open abstract class Mesh : Resource() {
  /**
   * Sets a hint to be used for lightmap resolution.
   */
  public open var lightmapSizeHint: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_LIGHTMAP_SIZE_HINT,
          VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SET_LIGHTMAP_SIZE_HINT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_MESH)
  }

  /**
   * Returns the smallest [AABB] enclosing this mesh in local space. Not affected by `custom_aabb`. See also [godot.VisualInstance3D.getTransformedAabb].
   *
   * **Note:** This is only implemented for [godot.ArrayMesh] and [godot.PrimitiveMesh].
   */
  public open fun getAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns the amount of surfaces that the [godot.Mesh] holds.
   */
  public open fun getSurfaceCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_SURFACE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the arrays for the vertices, normals, uvs, etc. that make up the requested surface (see [godot.ArrayMesh.addSurfaceFromArrays]).
   */
  public open fun surfaceGetArrays(surfIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the blend shape arrays for the requested surface.
   */
  public open fun surfaceGetBlendShapeArrays(surfIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_BLEND_SHAPE_ARRAYS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets a [godot.Material] for a given surface. Surface will be rendered using this material.
   */
  public open fun surfaceSetMaterial(surfIdx: Long, material: Material): Unit {
    TransferContext.writeArguments(LONG to surfIdx, OBJECT to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_SET_MATERIAL, NIL)
  }

  /**
   * Returns a [godot.Material] in a given surface. Surface is rendered using this material.
   */
  public open fun surfaceGetMaterial(surfIdx: Long): Material? {
    TransferContext.writeArguments(LONG to surfIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_SURFACE_GET_MATERIAL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Material?
  }

  /**
   * Calculate a [godot.ConcavePolygonShape3D] from the mesh.
   */
  public open fun createTrimeshShape(): Shape3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_TRIMESH_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape3D?
  }

  /**
   * Calculate a [godot.ConvexPolygonShape3D] from the mesh.
   *
   * If `clean` is `true` (default), duplicate and interior vertices are removed automatically. You can set it to `false` to make the process faster if not needed.
   *
   * If `simplify` is `true`, the geometry can be further simplified to reduce the amount of vertices. Disabled by default.
   */
  public open fun createConvexShape(clean: Boolean = true, simplify: Boolean = false): Shape3D? {
    TransferContext.writeArguments(BOOL to clean, BOOL to simplify)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_CONVEX_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape3D?
  }

  /**
   * Calculate an outline mesh at a defined offset (margin) from the original mesh.
   *
   * **Note:** This method typically returns the vertices in reverse order (e.g. clockwise to counterclockwise).
   */
  public open fun createOutline(margin: Double): Mesh? {
    TransferContext.writeArguments(DOUBLE to margin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_CREATE_OUTLINE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  /**
   * Returns all the vertices that make up the faces of the mesh. Each three vertices represent one triangle.
   */
  public open fun getFaces(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GET_FACES,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Generate a [godot.TriangleMesh] from the mesh.
   */
  public open fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_MESH_GENERATE_TRIANGLE_MESH, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?
  }

  public enum class BlendShapeMode(
    id: Long
  ) {
    /**
     * Blend shapes are normalized.
     */
    BLEND_SHAPE_MODE_NORMALIZED(0),
    /**
     * Blend shapes are relative to base weight.
     */
    BLEND_SHAPE_MODE_RELATIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayCustomFormat(
    id: Long
  ) {
    /**
     *
     */
    ARRAY_CUSTOM_RGBA8_UNORM(0),
    /**
     *
     */
    ARRAY_CUSTOM_RGBA8_SNORM(1),
    /**
     *
     */
    ARRAY_CUSTOM_RG_HALF(2),
    /**
     *
     */
    ARRAY_CUSTOM_RGBA_HALF(3),
    /**
     *
     */
    ARRAY_CUSTOM_R_FLOAT(4),
    /**
     *
     */
    ARRAY_CUSTOM_RG_FLOAT(5),
    /**
     *
     */
    ARRAY_CUSTOM_RGB_FLOAT(6),
    /**
     *
     */
    ARRAY_CUSTOM_RGBA_FLOAT(7),
    /**
     * Represents the size of the [enum ArrayCustomFormat] enum.
     */
    ARRAY_CUSTOM_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PrimitiveType(
    id: Long
  ) {
    /**
     * Render array as points (one vertex equals one point).
     */
    PRIMITIVE_POINTS(0),
    /**
     * Render array as lines (every two vertices a line is created).
     */
    PRIMITIVE_LINES(1),
    /**
     * Render array as line strip.
     */
    PRIMITIVE_LINE_STRIP(2),
    /**
     * Render array as triangles (every three vertices a triangle is created).
     */
    PRIMITIVE_TRIANGLES(3),
    /**
     * Render array as triangle strips.
     */
    PRIMITIVE_TRIANGLE_STRIP(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayFormat(
    id: Long
  ) {
    /**
     * Mesh array contains vertices. All meshes require a vertex array so this should always be present.
     */
    ARRAY_FORMAT_VERTEX(1),
    /**
     * Mesh array contains normals.
     */
    ARRAY_FORMAT_NORMAL(2),
    /**
     * Mesh array contains tangents.
     */
    ARRAY_FORMAT_TANGENT(4),
    /**
     * Mesh array contains colors.
     */
    ARRAY_FORMAT_COLOR(8),
    /**
     * Mesh array contains UVs.
     */
    ARRAY_FORMAT_TEX_UV(16),
    /**
     * Mesh array contains second UV.
     */
    ARRAY_FORMAT_TEX_UV2(32),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM0(64),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM1(128),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM2(256),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM3(512),
    /**
     * Mesh array contains bones.
     */
    ARRAY_FORMAT_BONES(1024),
    /**
     * Mesh array contains bone weights.
     */
    ARRAY_FORMAT_WEIGHTS(2048),
    /**
     * Mesh array uses indices.
     */
    ARRAY_FORMAT_INDEX(4096),
    /**
     *
     */
    ARRAY_FORMAT_BLEND_SHAPE_MASK(7),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM_BASE(13),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM_BITS(3),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM0_SHIFT(13),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM1_SHIFT(16),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM2_SHIFT(19),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM3_SHIFT(22),
    /**
     *
     */
    ARRAY_FORMAT_CUSTOM_MASK(7),
    /**
     *
     */
    ARRAY_COMPRESS_FLAGS_BASE(25),
    /**
     * Flag used to mark that the array contains 2D vertices.
     */
    ARRAY_FLAG_USE_2D_VERTICES(33554432),
    /**
     *
     */
    ARRAY_FLAG_USE_DYNAMIC_UPDATE(67108864),
    /**
     *
     */
    ARRAY_FLAG_USE_8_BONE_WEIGHTS(134217728),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayType(
    id: Long
  ) {
    /**
     * [godot.PackedVector3Array], [godot.PackedVector2Array], or [godot.Array] of vertex positions.
     */
    ARRAY_VERTEX(0),
    /**
     * [godot.PackedVector3Array] of vertex normals.
     */
    ARRAY_NORMAL(1),
    /**
     * [godot.PackedFloat32Array] of vertex tangents. Each element in groups of 4 floats, first 3 floats determine the tangent, and the last the binormal direction as -1 or 1.
     */
    ARRAY_TANGENT(2),
    /**
     * [godot.PackedColorArray] of vertex colors.
     */
    ARRAY_COLOR(3),
    /**
     * [godot.PackedVector2Array] for UV coordinates.
     */
    ARRAY_TEX_UV(4),
    /**
     * [godot.PackedVector2Array] for second UV coordinates.
     */
    ARRAY_TEX_UV2(5),
    /**
     *
     */
    ARRAY_CUSTOM0(6),
    /**
     *
     */
    ARRAY_CUSTOM1(7),
    /**
     *
     */
    ARRAY_CUSTOM2(8),
    /**
     *
     */
    ARRAY_CUSTOM3(9),
    /**
     * [godot.PackedFloat32Array] or [godot.PackedInt32Array] of bone indices. Each element is a group of 4 numbers.
     */
    ARRAY_BONES(10),
    /**
     * [godot.PackedFloat32Array] of bone weights. Each element in groups of 4 floats.
     */
    ARRAY_WEIGHTS(11),
    /**
     * [godot.PackedInt32Array] of integers used as indices referencing vertices, colors, normals, tangents, and textures. All of those arrays must have the same number of elements as the vertex array. No index can be beyond the vertex array size. When this index array is present, it puts the function into "index mode," where the index selects the *i*'th vertex, normal, tangent, color, UV, etc. This means if you want to have different normals or colors along an edge, you have to duplicate the vertices.
     *
     * For triangles, the index array is interpreted as triples, referring to the vertices of each triangle. For lines, the index array is in pairs indicating the start and end of each line.
     */
    ARRAY_INDEX(12),
    /**
     * Represents the size of the [enum ArrayType] enum.
     */
    ARRAY_MAX(13),
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
