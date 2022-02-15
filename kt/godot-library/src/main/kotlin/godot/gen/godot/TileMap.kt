// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Node for 2D tile-based maps.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/113](https://godotengine.org/asset-library/asset/113)
 *
 * Node for 2D tile-based maps. Tilemaps use a [godot.TileSet] which contain a list of tiles which are used to create grid-based maps. A TileMap may have several layers, layouting tiles on top of each other.
 */
@GodotBaseType
public open class TileMap : Node2D() {
  /**
   * Emitted when the [godot.TileSet] of this TileMap changes.
   */
  public val changed: Signal0 by signal()

  /**
   * The assigned [godot.TileSet].
   */
  public open var tileSet: TileSet?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_TILE_SET, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as TileSet?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_TILE_SET, NIL)
    }

  /**
   * The TileMap's quadrant size. Optimizes drawing by batching, using chunks of this size.
   */
  public open var cellQuadrantSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_QUADRANT_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL_QUADRANT_SIZE,
          NIL)
    }

  /**
   * If enabled, the TileMap will see its collisions synced to the physics tick and change its collision type from static to kinematic. This is required to create TileMap-based moving platform.
   *
   * **Note:** Enabling `collision_animatable` may have a small performance impact, only do it if the TileMap is moving and has colliding tiles.
   */
  public open var collisionAnimatable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_ANIMATABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_ANIMATABLE,
          NIL)
    }

  /**
   * Show or hide the TileMap's collision shapes. If set to `VISIBILITY_MODE_DEFAULT`, this depends on the show collision debug settings.
   */
  public open var collisionVisibilityMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COLLISION_VISIBILITY_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_COLLISION_VISIBILITY_MODE, NIL)
    }

  /**
   * Show or hide the TileMap's collision shapes. If set to `VISIBILITY_MODE_DEFAULT`, this depends on the show navigation debug settings.
   */
  public open var navigationVisibilityMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_NAVIGATION_VISIBILITY_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_NAVIGATION_VISIBILITY_MODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TILEMAP)
  }

  /**
   * Should return `true` if the tile at coordinates `coords[/coords] on layer `layer` requires a runtime update.
   *
   * **Warning:** Make sure this function only return `true` when needed. Any tile processed at runtime without a need for it will imply a significant performance penalty.
   */
  public open fun _useTileDataRuntimeUpdate(layer: Long, coords: Vector2i): Boolean {
    throw NotImplementedError("_use_tile_data_runtime_update is not implemented for TileMap")
  }

  /**
   * Called with a TileData object about to be used internally by the TileMap, allowing its modification at runtime.
   *
   * This method is only called if [_useTileDataRuntimeUpdate] is implemented and returns `true` for the given tile `coords[/coords] and `layer`.
   *
   * **Warning:** The `tile_data` object's sub-resources are the same as the one in the TileSet. Modifying them might impact the whole TileSet. Instead, make sure to duplicate those resources.
   *
   * **Note:** If the properties of `tile_data` object should change over time, use [forceUpdate] to trigger a TileMap update.
   */
  public open fun _tileDataRuntimeUpdate(
    layer: Long,
    coords: Vector2i,
    tileData: TileData
  ): Unit {
  }

  /**
   *
   */
  public open fun getLayersCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYERS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a layer at the given position `to_position` in the array. If `to_position` is -1, adds it at the end of the array.
   */
  public open fun addLayer(toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_ADD_LAYER, NIL)
  }

  /**
   * Moves the layer at index `layer_index` to the given position `to_position` in the array.
   */
  public open fun moveLayer(layer: Long, toPosition: Long): Unit {
    TransferContext.writeArguments(LONG to layer, LONG to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_MOVE_LAYER, NIL)
  }

  /**
   * Removes the layer at index `layer`.
   */
  public open fun removeLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_REMOVE_LAYER, NIL)
  }

  /**
   * Sets a layer's name. This is mostly useful in the editor.
   */
  public open fun setLayerName(layer: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to layer, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_NAME, NIL)
  }

  /**
   * Returns a TileMap layer's name.
   */
  public open fun getLayerName(layer: Long): String {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYER_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Enables or disables the layer `layer`. A disabled layer is not processed at all (no rendering, no physics, etc...).
   */
  public open fun setLayerEnabled(layer: Long, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_ENABLED, NIL)
  }

  /**
   * Returns if a layer is enabled.
   */
  public open fun isLayerEnabled(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_IS_LAYER_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets a layer's color. It will be multiplied by tile's color and TileMap's modulate.
   */
  public open fun setLayerModulate(layer: Long, enabled: Color): Unit {
    TransferContext.writeArguments(LONG to layer, COLOR to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_MODULATE, NIL)
  }

  /**
   * Returns a TileMap layer's modulate.
   */
  public open fun getLayerModulate(layer: Long): Color {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYER_MODULATE, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Enables or disables a layer's Y-sorting. If a layer is Y-sorted, the layer will behave as a CanvasItem node where each of its tile gets Y-sorted.
   *
   * Y-sorted layers should usually be on different Z-index values than not Y-sorted layers, otherwise, each of those layer will be Y-sorted as whole with the Y-sorted one. This is usually an undesired behvaior.
   */
  public open fun setLayerYSortEnabled(layer: Long, ySortEnabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to layer, BOOL to ySortEnabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_Y_SORT_ENABLED,
        NIL)
  }

  /**
   * Returns if a layer Y-sorts its tiles.
   */
  public open fun isLayerYSortEnabled(layer: Long): Boolean {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_IS_LAYER_Y_SORT_ENABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets a layer's Y-sort origin value. This Y-sort origin value is added to each tile's Y-sort origin value.
   *
   * This allows, for example, to fake a different height level on each layer. This can be useful for top-down view games.
   */
  public open fun setLayerYSortOrigin(layer: Long, ySortOrigin: Long): Unit {
    TransferContext.writeArguments(LONG to layer, LONG to ySortOrigin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_Y_SORT_ORIGIN,
        NIL)
  }

  /**
   * Returns a TileMap layer's Y sort origin.
   */
  public open fun getLayerYSortOrigin(layer: Long): Long {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYER_Y_SORT_ORIGIN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets a layers Z-index value. This Z-index is added to each tile's Z-index value.
   */
  public open fun setLayerZIndex(layer: Long, zIndex: Long): Unit {
    TransferContext.writeArguments(LONG to layer, LONG to zIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_LAYER_Z_INDEX, NIL)
  }

  /**
   * Returns a TileMap layer's Z-index value.
   */
  public open fun getLayerZIndex(layer: Long): Long {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_LAYER_Z_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the tile indentifiers for the cell on layer `layer` at coordinates `coords`. Each tile of the [godot.TileSet] is identified using three parts:
   *
   * - The source identifier `source_id` identifies a [godot.TileSetSource] identifier. See [godot.TileSet.setSourceId],
   *
   * - The atlas coordinates identifier `atlas_coords` identifies a tile coordinates in the atlas (if the source is a [godot.TileSetAtlasSource]. For [godot.TileSetScenesCollectionSource] it should be 0),
   *
   * - The alternative tile identifier `alternative_tile` identifies a tile alternative the source is a [godot.TileSetAtlasSource], and the scene for a [godot.TileSetScenesCollectionSource].
   */
  public open fun setCell(
    layer: Long,
    coords: Vector2i,
    sourceId: Long = -1,
    atlasCoords: Vector2i = Vector2iVector2i(-1.0, -1.0),
    alternativeTile: Long = -1
  ): Unit {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords, LONG to sourceId, VECTOR2I to
        atlasCoords, LONG to alternativeTile)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELL, NIL)
  }

  /**
   * Returns the tile source ID of the cell on layer `layer` at coordinates `coords`. If `use_proxies` is `false`, ignores the [godot.TileSet]'s tile proxies, returning the raw alternative identifier. See [godot.TileSet.mapTileProxy].
   */
  public open fun getCellSourceId(
    layer: Long,
    coords: Vector2i,
    useProxies: Boolean
  ): Long {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_SOURCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the tile atlas coordinates ID of the cell on layer `layer` at coordinates `coords`. If `use_proxies` is `false`, ignores the [godot.TileSet]'s tile proxies, returning the raw alternative identifier. See [godot.TileSet.mapTileProxy].
   */
  public open fun getCellAtlasCoords(
    layer: Long,
    coords: Vector2i,
    useProxies: Boolean
  ): Vector2i {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_ATLAS_COORDS,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the tile alternative ID of the cell on layer `layer` at `coords`. If `use_proxies` is `false`, ignores the [godot.TileSet]'s tile proxies, returning the raw alternative identifier. See [godot.TileSet.mapTileProxy].
   */
  public open fun getCellAlternativeTile(
    layer: Long,
    coords: Vector2i,
    useProxies: Boolean
  ): Long {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to coords, BOOL to useProxies)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_CELL_ALTERNATIVE_TILE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the coordinates of the tile for given physics body RID. Such RID can be retrieved from [godot.KinematicCollision2D.getColliderRid], when colliding with a tile.
   */
  public open fun getCoordsForBodyRid(body: RID): Vector2i {
    TransferContext.writeArguments(_RID to body)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_COORDS_FOR_BODY_RID,
        VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Creates a new [godot.TileMapPattern] from the given layer and set of cells.
   */
  public open fun getPattern(layer: Long, coordsArray: VariantArray<Any?>): TileMapPattern? {
    TransferContext.writeArguments(LONG to layer, ARRAY to coordsArray)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_PATTERN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TileMapPattern?
  }

  /**
   * Returns for the given coordinate `coords_in_pattern` in a [godot.TileMapPattern] the corresponding cell coordinates if the pattern was pasted at the `position_in_tilemap` coordinates (see [setPattern]). This mapping is required as in half-offset tile shapes, the mapping might not work by calculating `position_in_tile_map + coords_in_pattern`
   */
  public open fun mapPattern(
    positionInTilemap: Vector2i,
    coordsInPattern: Vector2i,
    pattern: TileMapPattern
  ): Vector2i {
    TransferContext.writeArguments(VECTOR2I to positionInTilemap, VECTOR2I to coordsInPattern,
        OBJECT to pattern)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_MAP_PATTERN, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Paste the given [godot.TileMapPattern] at the given `position` and `layer` in the tile map.
   */
  public open fun setPattern(
    layer: Long,
    position: Vector2i,
    pattern: TileMapPattern
  ): Unit {
    TransferContext.writeArguments(LONG to layer, VECTOR2I to position, OBJECT to pattern)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_PATTERN, NIL)
  }

  /**
   * Updates all the cells in the `cells` coordinates array and replace them by tiles that matches the surrounding cells terrains. Only cells form the given `terrain_set` are considered.
   *
   * If `ignore_empty_terrains` is true, zones with no terrain defined are ignored to select the tiles.
   */
  public open fun setCellsFromSurroundingTerrains(
    layer: Long,
    cells: VariantArray<Any?>,
    terrainSet: Long,
    ignoreEmptyTerrains: Boolean = true
  ): Unit {
    TransferContext.writeArguments(LONG to layer, ARRAY to cells, LONG to terrainSet, BOOL to
        ignoreEmptyTerrains)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TILEMAP_SET_CELLS_FROM_SURROUNDING_TERRAINS, NIL)
  }

  /**
   * Clears cells that do not exist in the tileset.
   */
  public open fun fixInvalidTiles(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_FIX_INVALID_TILES, NIL)
  }

  /**
   * Clears all cells on the given layer.
   */
  public open fun clearLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_CLEAR_LAYER, NIL)
  }

  /**
   * Clears all cells.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_CLEAR, NIL)
  }

  /**
   * Triggers an update of the TileMap. If `layer` is provided, only updates the given layer.
   *
   * **Note:** The TileMap node updates automatically when one of its properties is modified. A manual update is only needed if runtime modifications (implemented in [_tileDataRuntimeUpdate]) need to be applied.
   *
   * **Warning:** Updating the TileMap is a performance demanding task. Limit occurrences of those updates to the minimum and limit the amount tiles they impact (by segregating tiles updated often to a dedicated layer for example).
   */
  public open fun forceUpdate(layer: Long = -1): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_FORCE_UPDATE, NIL)
  }

  /**
   * Returns the list of all neighbourings cells to the one at `coords`
   */
  public open fun getSurroundingTiles(coords: Vector2i): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR2I to coords)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_SURROUNDING_TILES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a [godot.core.Vector2] array with the positions of all cells containing a tile in the given layer. A cell is considered empty if its source identifier equals -1, its atlas coordinates identifiers is `Vector2(-1, -1)` and its alternative identifier is -1.
   */
  public open fun getUsedCells(layer: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_USED_CELLS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a rectangle enclosing the used (non-empty) tiles of the map, including all layers.
   */
  public open fun getUsedRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_USED_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns a local position of the center of the cell at the given tilemap (grid-based) coordinates.
   *
   * **Note:** This doesn't correspond to the visual position of the tile, i.e. it ignores the [godot.TileData.textureOffset] property of individual tiles.
   */
  public open fun mapToWorld(mapPosition: Vector2i): Vector2 {
    TransferContext.writeArguments(VECTOR2I to mapPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_MAP_TO_WORLD, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the tilemap (grid-based) coordinates corresponding to the given local position.
   */
  public open fun worldToMap(worldPosition: Vector2): Vector2i {
    TransferContext.writeArguments(VECTOR2 to worldPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_WORLD_TO_MAP, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  /**
   * Returns the neighboring cell to the one at coordinates `coords`, identified by the `neighbor` direction. This method takes into account the different layouts a TileMap can take.
   */
  public open fun getNeighborCell(coords: Vector2i, neighbor: TileSet.CellNeighbor): Vector2i {
    TransferContext.writeArguments(VECTOR2I to coords, LONG to neighbor.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TILEMAP_GET_NEIGHBOR_CELL, VECTOR2I)
    return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
  }

  public enum class VisibilityMode(
    id: Long
  ) {
    /**
     * Use the debug settings to determine visibility.
     */
    VISIBILITY_MODE_DEFAULT(0),
    /**
     * Always hide.
     */
    VISIBILITY_MODE_FORCE_HIDE(2),
    /**
     * Always show.
     */
    VISIBILITY_MODE_FORCE_SHOW(1),
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
