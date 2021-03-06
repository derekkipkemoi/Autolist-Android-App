package org.carlistingapp.autolist.ui.home.listCar.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.formats.MediaView
import com.google.android.gms.ads.formats.UnifiedNativeAdView
import org.carlistingapp.autolist.R


class UnifiedNativeAdViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
    val adView: UnifiedNativeAdView = view.findViewById<UnifiedNativeAdView>(R.id.ad_view)

    init {
        // The MediaView will display a video asset if one is present in the ad, and the
        // first image asset otherwise.
        adView.mediaView = adView.findViewById<View>(R.id.ad_media) as MediaView
        adView.headlineView = adView.findViewById(R.id.ad_headline)
        adView.bodyView = adView.findViewById(R.id.ad_body)
        adView.callToActionView = adView.findViewById(R.id.ad_call_to_action)
        adView.iconView = adView.findViewById(R.id.ad_icon)
        adView.priceView = adView.findViewById(R.id.ad_price)
        adView.starRatingView = adView.findViewById(R.id.ad_stars)
        adView.storeView = adView.findViewById(R.id.ad_store)
        adView.advertiserView = adView.findViewById(R.id.ad_advertiser)
    }
}