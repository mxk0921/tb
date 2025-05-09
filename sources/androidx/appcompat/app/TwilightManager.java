package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.PermissionChecker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;
import tb.p78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TwilightManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final String TAG = "TwilightManager";
    private static TwilightManager sInstance;
    private final Context mContext;
    private final LocationManager mLocationManager;
    private final TwilightState mTwilightState = new TwilightState();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TwilightState {
        public boolean isNight;
        public long nextUpdate;
    }

    public TwilightManager(Context context, LocationManager locationManager) {
        this.mContext = context;
        this.mLocationManager = locationManager;
    }

    public static TwilightManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TwilightManager) ipChange.ipc$dispatch("7ce66b52", new Object[]{context});
        }
        if (sInstance == null) {
            Context applicationContext = context.getApplicationContext();
            sInstance = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return sInstance;
    }

    private Location getLastKnownLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Location) ipChange.ipc$dispatch("9f50b675", new Object[]{this});
        }
        Location location = null;
        Location lastKnownLocationForProvider = PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? getLastKnownLocationForProvider("network") : null;
        if (PermissionChecker.checkSelfPermission(this.mContext, p78.ACCESS_FINE_LOCATION) == 0) {
            location = getLastKnownLocationForProvider("gps");
        }
        return (location == null || lastKnownLocationForProvider == null) ? location != null ? location : lastKnownLocationForProvider : location.getTime() > lastKnownLocationForProvider.getTime() ? location : lastKnownLocationForProvider;
    }

    private Location getLastKnownLocationForProvider(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Location) ipChange.ipc$dispatch("aba6d661", new Object[]{this, str});
        }
        try {
            if (this.mLocationManager.isProviderEnabled(str)) {
                return this.mLocationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean isStateValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28ca2cc0", new Object[]{this})).booleanValue();
        }
        if (this.mTwilightState.nextUpdate > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public static void setInstance(TwilightManager twilightManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4830490", new Object[]{twilightManager});
        } else {
            sInstance = twilightManager;
        }
    }

    private void updateState(Location location) {
        long j;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324f37a3", new Object[]{this, location});
            return;
        }
        TwilightState twilightState = this.mTwilightState;
        long currentTimeMillis = System.currentTimeMillis();
        TwilightCalculator instance = TwilightCalculator.getInstance();
        instance.calculateTwilight(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        instance.calculateTwilight(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (instance.state != 1) {
            z = false;
        }
        long j2 = instance.sunrise;
        long j3 = instance.sunset;
        instance.calculateTwilight(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = instance.sunrise;
        if (j2 == -1 || j3 == -1) {
            j = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j3) {
                if (currentTimeMillis > j2) {
                    j4 = j3;
                } else {
                    j4 = j2;
                }
            }
            j = j4 + 60000;
        }
        twilightState.isNight = z;
        twilightState.nextUpdate = j;
    }

    public boolean isNight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97925e99", new Object[]{this})).booleanValue();
        }
        TwilightState twilightState = this.mTwilightState;
        if (isStateValid()) {
            return twilightState.isNight;
        }
        Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            updateState(lastKnownLocation);
            return twilightState.isNight;
        }
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }
}
