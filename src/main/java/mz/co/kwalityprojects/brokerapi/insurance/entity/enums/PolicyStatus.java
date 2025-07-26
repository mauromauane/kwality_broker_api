package mz.co.kwalityprojects.brokerapi.insurance.entity.enums;

public enum PolicyStatus {
    ACTIVE,             // Policy is valid and in effect
    EXPIRED,            // Policy has reached its end date
    CANCELLED,          // Manually cancelled before expiration
    SUSPENDED,          // Temporarily paused
    RENEWED,            // Renewed after expiry
    OVERDUE,            // Payment not made on time
    PENDING_PAYMENT     // Awaiting payment to become active
}
