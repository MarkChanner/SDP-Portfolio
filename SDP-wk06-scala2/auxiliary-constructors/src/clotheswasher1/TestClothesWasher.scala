package clotheswasher1

import atomicscala.AtomicTest._

/**
  * SDP Scala Exercises Week 6
  * Auxiliary Constructors Q.12 - 14
  * Mark Channer
  *
  * Auxiliary Constructor = Overloaded Constructor
  */
class ClothesWasher(val modelName: String, val capacity: Double) {

  def this(modelName: String) {
    this(modelName, 3.0)
  }

  def this(capacity: Double) {
    this("Generic Brand", capacity)
  }
}

object TestClothesWasher extends App {
  val defaultWasher = new ClothesWasher("Hitachi", 5.0)
  defaultWasher.modelName is "Hitachi"
  defaultWasher.capacity is 5.0

  val auxWasher1 = new ClothesWasher("Bosch")
  auxWasher1.modelName is "Bosch"
  auxWasher1.capacity is 3.0

  val auxWasher2 = new ClothesWasher(4.5)
  auxWasher2.modelName is "Generic Brand"
  auxWasher2.capacity is 4.5
}

