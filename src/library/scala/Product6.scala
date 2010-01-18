/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2010, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Sun Jan 17 19:38:09 PST 2010

package scala


object Product6 {
  def unapply[T1, T2, T3, T4, T5, T6](x: Product6[T1, T2, T3, T4, T5, T6]): Option[Product6[T1, T2, T3, T4, T5, T6]] =
    Some(x)
}

/** Product6 is a cartesian product of 6 components.
 *
 *  @since 2.3
 */
trait Product6[+T1, +T2, +T3, +T4, +T5, +T6] extends Product {
  /**
   *  The arity of this product.
   *  @return 6
   */
  override def productArity = 6

  /**
   *  Returns the n-th projection of this product if 0&lt;=n&lt;arity,
   *  otherwise null.
   *
   *  @param n number of the projection to be returned
   *  @return  same as _(n+1)
   *  @throws  IndexOutOfBoundsException
   */
  @throws(classOf[IndexOutOfBoundsException])
  override def productElement(n: Int) = n match {
    case 0 => _1
    case 1 => _2
    case 2 => _3
    case 3 => _4
    case 4 => _5
    case 5 => _6
    case _ => throw new IndexOutOfBoundsException(n.toString())
 }

  /** projection of this product */
  def _1: T1

  /** projection of this product */
  def _2: T2

  /** projection of this product */
  def _3: T3

  /** projection of this product */
  def _4: T4

  /** projection of this product */
  def _5: T5

  /** projection of this product */
  def _6: T6



}
