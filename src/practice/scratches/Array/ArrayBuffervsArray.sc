import scala.collection.mutable.ArrayBuffer

/**
 * Array vs ArrayBuffer
 * Both are mutable
 * ArrayBuffer is resizable - Array is not resizable
 * Appending works for ArrayBuffer; For Array, an new array will be created.
 *
 */

import scala.collection.mutable.ArrayBuffer
val a = ArrayBuffer(1,2,3,4)
a.append(5)
a += 7



