package tb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.gathering.receiver.LocationChangedReceiver;
import com.taobao.passivelocation.gathering.receiver.PassiveLocationChangedReceiver;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tbj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FENCE_CHANNEL_GATHER_SOURCE = "fence";
    public static final int GATHERING_REQUEST_CODE = 2;
    public static final int PASSIVE_GATHERING_REQUEST_CODE = 3;
    public static final String PASSIVE_LOCATION_CHANNEL_GATHER_SOURCE = "passiveLocation";
    public static final String REQUEST_ALARM = "alarm";
    public static final String REQUEST_PASSIVE = "passive";
    public static final String REQUEST_UPDATES = "updates";

    /* renamed from: a  reason: collision with root package name */
    public Context f28616a;

    static {
        t2o.a(789577851);
    }

    public tbj(Context context, String str) {
        this.f28616a = context;
    }

    public final PendingIntent a(Context context, int i, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("e992a95f", new Object[]{this, context, new Integer(i), cls});
        }
        return ya.e(context, i, new Intent(context, cls), 134217728);
    }

    public void c(long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d59b501", new Object[]{this, new Long(j), new Float(f)});
            return;
        }
        try {
            if (this.f28616a == null) {
                this.f28616a = yah.f31937a;
            }
            mdh.a("lbs_passive.loc_MLR", "[startLocationSampling] last set minTime=" + String.valueOf(j / 60000));
            e();
            b(j);
        } catch (Exception e) {
            mdh.a("lbs_passive.loc_MLR", "[startLocationSampling] error: " + e.getMessage());
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaf3c65", new Object[]{this});
            return;
        }
        mdh.a("lbs_passive.loc_MLR", "[stopLocationSampling] begin source=passiveLocation");
        if (this.f28616a == null) {
            this.f28616a = yah.f31937a;
        }
        try {
            LocationManager locationManager = (LocationManager) this.f28616a.getSystemService("location");
            mdh.a("lbs_passive.loc_MLR", "[stopLocationSampling] stop activeIntent and passiveIntent source=passiveLocation");
            PendingIntent a2 = a(this.f28616a, 2, LocationChangedReceiver.class);
            PendingIntent a3 = a(this.f28616a, 3, PassiveLocationChangedReceiver.class);
            locationManager.removeUpdates(a2);
            locationManager.removeUpdates(a3);
            a2.cancel();
            a3.cancel();
            mdh.a("lbs_passive.loc_MLR", "[stopLocationSampling] stop cell tower listening source=passiveLocation");
            d();
            mdh.a("lbs_passive.loc_MLR", "[stopLocationSampling] cancel AlarmManager source=passiveLocation");
            ((AlarmManager) this.f28616a.getSystemService("alarm")).cancel(a(this.f28616a, 2, LocationChangedReceiver.class));
        } catch (Exception e) {
            mdh.c("lbs_passive.loc_MLR", "[stopLocationSampling] source=passiveLocation error: ", e);
        }
    }

    public final void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3681b465", new Object[]{this, new Long(j)});
            return;
        }
        if (this.f28616a == null) {
            this.f28616a = yah.f31937a;
        }
        AlarmManager alarmManager = (AlarmManager) this.f28616a.getSystemService("alarm");
        long j2 = yah.b + 2000;
        Intent intent = new Intent(this.f28616a, LocationChangedReceiver.class);
        intent.putExtra("alarm", "passiveLocation_alarm");
        PendingIntent e = ya.e(this.f28616a, 2, intent, 134217728);
        alarmManager.cancel(e);
        mdh.a("lbs_passive.loc_MLR", "[startAlarmGathering] start location gathering through alarms with params: [type=RTC_WAKEUP,triggerTime=" + j2 + ", minTime=" + (j / 1000) + "s] source=passiveLocation");
        alarmManager.setRepeating(1, j2 < 5000 ? 5000L : j2, j, e);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab1b135", new Object[]{this});
            return;
        }
        mdh.d("lbs_passive.loc_MLR", "[stopCellLocationGathering]");
        try {
            ((TelephonyManager) this.f28616a.getSystemService("phone")).listen(new bgj(this.f28616a), 0);
        } catch (Exception unused) {
        }
    }
}
