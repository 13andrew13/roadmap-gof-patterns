package com.andrew.learning.gof_patterns.decorator

fun main() {
    val phoneNumber = "+380998882233"
    val email = "test@gmail.com"
    val slackChannel = "prod_alert"

    val notifier = Notifier()

    // Send with SMS
    val smsNotifierDecorator = SmsNotifierDecorator(notifier, phoneNumber)
    smsNotifierDecorator.notify("Hello world")

    // Send with SMS and Email
    val emailNotifierDecorator = EmailNotifierDecorator(smsNotifierDecorator, email)
    emailNotifierDecorator.notify("Hello world")

    // Send with SMS and Slack
    val slackNotifierDecorator = SlackNotifierDecorator(smsNotifierDecorator, slackChannel)
    slackNotifierDecorator.notify("Prod is down :alarm:")
}