package com.adapty.flutter.models

import com.adapty.api.entity.paywalls.PaywallModel
import com.google.gson.annotations.SerializedName

class PaywallFlutterModel {
    @SerializedName("developerId")
    var developerId: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("abTestName")
    var abTestName: String? = null

    @SerializedName("revision")
    var revision: Int? = null

    @SerializedName("isPromo")
    var isPromo: Boolean? = null

    @SerializedName("variationId")
    var variationId: String? = null

    @SerializedName("products")
    var products: ArrayList<ProductFlutterModel>? = null

    @SerializedName("customPayloadString")
    var customPayloadString: String? = null

    companion object {
        fun from(paywall: PaywallModel) = PaywallFlutterModel().apply {
            developerId = paywall.developerId
            name = paywall.name
            abTestName = paywall.abTestName
            revision = paywall.revision
            isPromo = paywall.isPromo
            variationId = paywall.variationId
            customPayloadString = paywall.customPayloadString
            products = paywall.products?.mapTo(ArrayList(), ProductFlutterModel.Companion::from)
        }
    }
}