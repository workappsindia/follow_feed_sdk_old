package com.workapps.sbipoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.workapps.feedmsgs.FollowFeedSdk
import com.workapps.feedmsgs.utils.FollowFeedConfig

class MainActivity : AppCompatActivity() {
    private lateinit var feedMsgLibHelper: FollowFeedSdk

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = FollowFeedConfig(3675649,"4221df11-66da-4927-85bc-c8")
        input.feedUserName="f00001"
        feedMsgLibHelper = FollowFeedSdk.getInstance(input, applicationContext)
        val fragment = feedMsgLibHelper.feedFragment
        fragment.arguments = intent.extras
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .add(R.id.fragment_container_view, fragment, null)
            .commit()

    }
}