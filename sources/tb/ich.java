package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Criteria;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ich {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean e = false;
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public final u5a f21237a;
    public final Context b;
    public final og4 c;
    public boolean d;

    static {
        t2o.a(789577838);
    }

    public ich(Context context) {
        try {
            this.b = context;
            this.f21237a = new u5a();
            this.c = og4.b();
            this.d = c();
        } catch (Exception e2) {
            mdh.b("lbs_passive.loc_LPCF", "init LocationParamConfig error: " + e2.getMessage());
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac61e5f8", new Object[]{this, new Boolean(z)});
            return;
        }
        e(z);
        if (a()) {
            this.f21237a.a(this.b, false);
        } else {
            this.f21237a.b(this.b);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef739e6", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.b).edit();
        edit.putBoolean("lbs_location_user_control", z);
        edit.apply();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a54d279", new Object[]{this})).booleanValue();
        }
        boolean z = PreferenceManager.getDefaultSharedPreferences(this.b).getBoolean("lbs_location_user_control", false);
        this.d = z;
        return z;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e289a4e2", new Object[]{this})).booleanValue();
        }
        try {
            if (!d()) {
                return false;
            }
            Criteria criteria = new Criteria();
            criteria.setPowerRequirement(1);
            List<String> providers = ((LocationManager) this.b.getSystemService("location")).getProviders(criteria, true);
            if (providers == null || providers.size() <= 0) {
                WifiManager wifiManager = (WifiManager) this.b.getSystemService("wifi");
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                int ipAddress = connectionInfo == null ? 0 : connectionInfo.getIpAddress();
                if (!wifiManager.isWifiEnabled() || ipAddress == 0) {
                    return false;
                }
                mdh.a("lbs_passive.loc_LPCF", "[canSampling()] 高功耗状态但是有wifi可以采集位置信息~");
            } else {
                mdh.a("lbs_passive.loc_LPCF", "[canSampling()] providers:" + providers);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2183090f", new Object[]{this})).booleanValue();
        }
        String a2 = this.c.a();
        boolean parseBoolean = Boolean.parseBoolean(this.c.c());
        mdh.d("lbs_passive.loc_LPCF", "[isGatheringEnabled] reportSwitch=" + parseBoolean + ",clientSwitchStatus=" + a2);
        if (TextUtils.isEmpty(a2)) {
            return parseBoolean;
        }
        mdh.d("lbs_passive.loc_LPCF", "[isGatheringEnabled] clientSwitchStatus=" + a2);
        if ("FORCE_ON".equals(a2)) {
            return true;
        }
        if ("FORCE_OFF".equals(a2)) {
            return false;
        }
        if (this.d) {
            mdh.d("lbs_passive.loc_LPCF", "[isGatheringEnabled] userControlStatus=" + this.d + ",reportSwitch=" + parseBoolean);
            return parseBoolean;
        }
        mdh.d("lbs_passive.loc_LPCF", "[isGatheringEnabled] clientSwitchStatus=" + a2 + ",reportSwitch=" + parseBoolean);
        return parseBoolean && "DEFAULT_ON".equals(a2);
    }
}
