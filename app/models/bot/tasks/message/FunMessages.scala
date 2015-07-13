package models.bot.tasks.message

/**
 * A list of fun, pre-defined message trees.
 */

 // defaults:

 /**
object FunMessages {

  def messages = List(
    MessageTree(
      value = "{name} are you a fan of avocados?",
      right = Some(MessageTree(
        value = "So if I asked you to have a guacamole party with me you'd do it?",
        right = None,
        left = None
      ))
    ),
    MessageTree(
      value = "I can't wait to introduce you to my mom!",
      right = Some(MessageTree(
        value = "Since mom showed everyone my naked baby pictures, I've been looking for ways to get her back.",
        right = None,
        left = None
      )),
      left = None
    )
  )
}
*//

object FunMessages {
  def messages = List(
        MessageTree(
      value = "So.... tell me {name}, how's life?"
    ),
    MessageTree(
      value = "Just landed in Berlin, kicking off couple years working in Europe... where's fun on weekdays?"
    )
  )
}
