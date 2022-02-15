// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Plays positional sound in 2D space.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_streams.html]($DOCS_URL/tutorials/audio/audio_streams.html)
 *
 * Plays audio that dampens with distance from screen center.
 *
 * See also [godot.AudioStreamPlayer] to play a sound non-positionally.
 *
 * **Note:** Hiding an [godot.AudioStreamPlayer2D] node does not disable its audio output. To temporarily disable an [godot.AudioStreamPlayer2D]'s audio output, set [volumeDb] to a very low value like `-100` (which isn't audible to human hearing).
 */
@GodotBaseType
public open class AudioStreamPlayer2D : Node2D() {
  /**
   * Emitted when the audio stops playing.
   */
  public val finished: Signal0 by signal()

  /**
   * The [godot.AudioStream] object to be played.
   */
  public open var stream: AudioStream?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as AudioStream?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_STREAM,
          NIL)
    }

  /**
   * Base volume without dampening.
   */
  public open var volumeDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_VOLUME_DB,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_VOLUME_DB,
          NIL)
    }

  /**
   * The pitch and the tempo of the audio, as a multiplier of the audio sample's sample rate.
   */
  public open var pitchScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_PITCH_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_PITCH_SCALE, NIL)
    }

  /**
   * If `true`, audio is playing.
   */
  public open val playing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_PLAYING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }

  /**
   * If `true`, audio plays when added to scene tree.
   */
  public open var autoplay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_AUTOPLAY,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_AUTOPLAY,
          NIL)
    }

  /**
   * If `true`, the playback is paused. You can resume it by setting `stream_paused` to `false`.
   */
  public open var streamPaused: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM_PAUSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_STREAM_PAUSED, NIL)
    }

  /**
   * Maximum distance from which audio is still hearable.
   */
  public open var maxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_MAX_DISTANCE, NIL)
    }

  /**
   * Dampens audio over distance with this as an exponent.
   */
  public open var attenuation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_ATTENUATION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_ATTENUATION, NIL)
    }

  /**
   * The maximum number of sounds this node can play at the same time. Playing additional sounds after this value is reached will cut off the oldest sounds.
   */
  public open var maxPolyphony: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_MAX_POLYPHONY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_MAX_POLYPHONY, NIL)
    }

  /**
   * Bus on which this audio is playing.
   */
  public open var bus: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_BUS,
          STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_BUS, NIL)
    }

  /**
   * Areas in which this sound plays.
   */
  public open var areaMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_AREA_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SET_AREA_MASK,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYER2D)
  }

  /**
   * Plays the audio from the given position `from_position`, in seconds.
   */
  public open fun play(fromPosition: Double = 0.0): Unit {
    TransferContext.writeArguments(DOUBLE to fromPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_PLAY, NIL)
  }

  /**
   * Sets the position from which audio will be played, in seconds.
   */
  public open fun seek(toPosition: Double): Unit {
    TransferContext.writeArguments(DOUBLE to toPosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_SEEK, NIL)
  }

  /**
   * Stops the audio.
   */
  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_STOP, NIL)
  }

  /**
   * Returns the position in the [godot.AudioStream].
   */
  public open fun getPlaybackPosition(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_PLAYBACK_POSITION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the [godot.AudioStreamPlayback] object associated with this [godot.AudioStreamPlayer2D].
   */
  public open fun getStreamPlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYER2D_GET_STREAM_PLAYBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?
  }

  public companion object
}
