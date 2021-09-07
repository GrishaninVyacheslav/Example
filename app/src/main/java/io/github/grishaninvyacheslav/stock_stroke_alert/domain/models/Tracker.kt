package io.github.grishaninvyacheslav.stock_stroke_alert.domain.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Tracker(
    @PrimaryKey(autoGenerate = true) var hash: Int? = null,
    var trackedTicker: String? = null,
    var lastTriggerProximity: Byte? = null,
    var triggerThreshold: String? = null,
    var differenceValue: String? = null,
    var differenceDirection: Byte? = null,
    var differenceUnitType: String? = null,
    var days: String? = null,
    var hours: String? = null,
    var minutes: String? = null,
    var notifications: String = "" // TODO: ForeignKey
) : Parcelable

enum class UnitType(val value: String) {
    CURRENCY("$"),
    PERCENTAGE("%")
}

enum class NotificationType(val value: String) {
    PUSH("push"),
    ALARM("alarm"),
    MESSENGER("messenger")
}