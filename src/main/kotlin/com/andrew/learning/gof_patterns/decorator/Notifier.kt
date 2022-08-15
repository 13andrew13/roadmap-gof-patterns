package com.andrew.learning.gof_patterns.decorator

open class Notifier {
    open fun notify(message: String) {
        println("Send message: $message")
    }
}

abstract class NotifierDecorator(
    protected val notifierDecorator: Notifier
) : Notifier() {
    override fun notify(message: String) {
        notifierDecorator.notify(message)
    }
}

class SlackNotifierDecorator(
    notifierDecorator: Notifier,
    private val slackChannel: String,
) : NotifierDecorator(notifierDecorator) {

    override fun notify(message: String) {
        notifierDecorator.notify(message)
        println("Sent message $message to slack channel: $slackChannel")
    }
}

class SmsNotifierDecorator(
    notifierDecorator: Notifier,
    private val phoneNumber: String,
) : NotifierDecorator(notifierDecorator) {

    override fun notify(message: String) {
        notifierDecorator.notify(message)
        println("Sent message $message by SMS to number: $phoneNumber")
    }
}

class EmailNotifierDecorator(
    notifierDecorator: Notifier,
    private val email: String,
) : NotifierDecorator(notifierDecorator) {

    override fun notify(message: String) {
        notifierDecorator.notify(message)
        println("Sent message $message by email to: $email")
    }
}