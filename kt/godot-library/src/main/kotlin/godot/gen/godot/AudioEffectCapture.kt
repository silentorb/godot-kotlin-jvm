// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Captures audio from an audio bus in real-time.
 *
 * AudioEffectCapture is an AudioEffect which copies all audio frames from the attached audio effect bus into its internal ring buffer.
 *
 * Application code should consume these audio frames from this ring buffer using [getBuffer] and process it as needed, for example to capture data from a microphone, implement application defined effects, or to transmit audio over the network.
 */
@GodotBaseType
public open class AudioEffectCapture : AudioEffect() {
  /**
   * Length of the internal ring buffer, in seconds. Setting the buffer length will have no effect if already initialized.
   */
  public open var bufferLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_GET_BUFFER_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_SET_BUFFER_LENGTH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTCAPTURE)
  }

  /**
   * Returns `true` if at least `frames` audio frames are available to read in the internal ring buffer.
   */
  public open fun canGetBuffer(frames: Long): Boolean {
    TransferContext.writeArguments(LONG to frames)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_CAN_GET_BUFFER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Gets the next `frames` audio samples from the internal ring buffer.
   *
   * Returns a [godot.PackedVector2Array] containing exactly `frames` audio samples if available, or an empty [godot.PackedVector2Array] if insufficient data was available.
   */
  public open fun getBuffer(frames: Long): PackedVector2Array {
    TransferContext.writeArguments(LONG to frames)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_GET_BUFFER,
        PACKED_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
  }

  /**
   * Clears the internal ring buffer.
   */
  public open fun clearBuffer(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_CLEAR_BUFFER,
        NIL)
  }

  /**
   * Returns the number of frames available to read using [getBuffer].
   */
  public open fun getFramesAvailable(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_GET_FRAMES_AVAILABLE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of audio frames discarded from the audio bus due to full buffer.
   */
  public open fun getDiscardedFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_GET_DISCARDED_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total size of the internal ring buffer in frames.
   */
  public open fun getBufferLengthFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_GET_BUFFER_LENGTH_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of audio frames inserted from the audio bus.
   */
  public open fun getPushedFrames(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCAPTURE_GET_PUSHED_FRAMES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
