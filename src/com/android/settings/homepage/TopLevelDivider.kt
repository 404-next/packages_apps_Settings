package com.android.settings.homepage;

import com.android.settings.R;
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder

class TopLevelDivider : Preference {
    private val inflater: LayoutInflater? = null
    private var mContext: Context? = null

    constructor(context: Context) : super(context) {
        initViews(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initViews(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        initViews(context)
    }

    private fun initViews(context: Context) {
        mContext = context
        layoutResource = R.layout.top_level_divider
        isEnabled = false
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        holder.isDividerAllowedBelow = false
        holder.isDividerAllowedAbove = false
    }
}
