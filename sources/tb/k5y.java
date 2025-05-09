package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UtilityImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class k5y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f22423a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k5y f22424a = new k5y();

        static {
            t2o.a(499122202);
        }
    }

    static {
        t2o.a(499122201);
    }

    public static void c(k5y k5yVar, String str, String str2) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db66995f", new Object[]{k5yVar, str, str2});
            return;
        }
        k5yVar.getClass();
        try {
            context = k5yVar.f22423a;
        } catch (Exception e) {
            pxx.f26392a.d("RemoteConfig", "saveConfigToSP fail:", e, "key", str, "value", str2);
        }
        if (context == null) {
            pxx.f26392a.c("RemoteConfig", "saveConfigToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("keepalive", 4).edit();
        edit.putString(str, str2);
        edit.apply();
        pxx.f26392a.c("RemoteConfig", "saveConfigToSP", "key", str, "value", str2);
    }

    public int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue();
        }
        int i = 20;
        try {
            i = Integer.parseInt(b(context, "prevent_rt_kill_receiver_delay", ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE));
            pxx.f26392a.c("RemoteConfig", "[getPreventRemoveTaskKillByReceiverDelayTimeInSecs]", "delaySecs", Integer.valueOf(i));
        } catch (Throwable th) {
            pxx.f26392a.d("RemoteConfig", "[getPreventRemoveTaskKillByReceiverDelayTimeInSecs] error.", th, new Object[0]);
        }
        return i;
    }

    public final String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{this, context, str, str2});
        }
        try {
            return context.getSharedPreferences("keepalive", 4).getString(str, str2);
        } catch (Exception e) {
            pxx.f26392a.d("RemoteConfig", "getConfigFromSP fail:", e, "key", str);
            return str2;
        }
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !UtilityImpl.isAppKeepAlive()) {
            return false;
        }
        try {
            String[] split = str.split("-");
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(o41.a());
            if (appKeepAliveBucketId < parseInt || appKeepAliveBucketId > parseInt2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean e(Context context) {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        try {
            z = d(b(context, "account_sync_range", "3-96"));
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        try {
            pxx.f26392a.c("RemoteConfig", "[optAccountSyncEnabled]", "enabled", Boolean.valueOf(z));
        } catch (Throwable th3) {
            th = th3;
            pxx.f26392a.d("RemoteConfig", "[optAccountSyncEnabled] error.", th, new Object[0]);
            return z;
        }
        return z;
    }

    public boolean f(Context context) {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue();
        }
        try {
            z = d(b(context, "adj_adjust_range", ""));
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        try {
            pxx.f26392a.c("RemoteConfig", "[optAdjustAdjEnabled]", "enabled", Boolean.valueOf(z));
        } catch (Throwable th3) {
            th = th3;
            pxx.f26392a.d("RemoteConfig", "[optAdjustAdjEnabled] error.", th, new Object[0]);
            return z;
        }
        return z;
    }

    public boolean g(Context context) {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{this, context})).booleanValue();
        }
        try {
            z = d(b(context, "prevent_rt_kill_receiver_range", ""));
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        try {
            pxx.f26392a.c("RemoteConfig", "[optPreventRemoveTaskKillByReceiver]", "enabled", Boolean.valueOf(z));
        } catch (Throwable th3) {
            th = th3;
            pxx.f26392a.d("RemoteConfig", "[optPreventRemoveTaskKillByReceiver] error.", th, new Object[0]);
            return z;
        }
        return z;
    }

    public boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{this, context})).booleanValue();
        }
        try {
            return d(b(context, "recent_entrance_range", "38-38"));
        } catch (Throwable th) {
            pxx.f26392a.d("RemoteConfig", "[optRecentEntranceEnabled] error.", th, new Object[0]);
            return false;
        }
    }

    public boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{this, context})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(b(context, "speed_switch", "true"));
        } catch (Throwable th) {
            pxx.f26392a.d("RemoteConfig", "[optSpeedSwitch] error.", th, new Object[0]);
            return true;
        }
    }
}
