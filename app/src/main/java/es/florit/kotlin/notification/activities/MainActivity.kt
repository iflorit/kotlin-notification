package es.florit.kotlin.notification.activities

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.app.AppCompatActivity
import es.florit.kotlin.notification.R

/**
 * Created by ismael on 28/6/17.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
