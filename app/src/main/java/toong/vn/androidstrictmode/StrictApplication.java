package toong.vn.androidstrictmode;

import android.app.Application;
import android.os.StrictMode;

/**
 * Created by PhanVanLinh on 13/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class StrictApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build());
    }
}
