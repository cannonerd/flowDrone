package cannonerd.com.flowDrone;

import org.apache.cordova.*;
import android.os.Bundle;
import android.view.View;

public class gruntBasics extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("loadUrlTimeoutValue", 10000);
        super.loadUrl("file:///android_asset/www/app/index.html", 1000);
        super.appView.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                return true;
            }
        });

    }
}
