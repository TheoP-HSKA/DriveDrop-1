package com.example.drivedrop

sealed interface UserEvent {
    object SaveUser : UserEvent
    data class SetFirstName(val firstName: String): UserEvent
    data class SetLastName(val lastName: String): UserEvent
    data class SetEmail(val email: String): UserEvent
    data class SetPassword(val password: String): UserEvent
    data class SetUserName(val userName: String): UserEvent
    data class SetPaymentInfo(val paymentInfo: String): UserEvent
    data class SetBio(val bio: String): UserEvent

    object ShowDialog: UserEvent
    object HideDialog: UserEvent
    data class SortUSer(val SortType: SortType): UserEvent
    data class DeleteContact(val user:User): UserEvent
}