package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.stat.ChannelFlowStatistic;
import com.taobao.analysis.stat.SingleFlowStatistic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bzp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_MONITOR_SWITCH_KEY = "channel_flow_monitor";
    public static volatile bzp c;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f16742a;
    public final SharedPreferences b;

    public bzp() {
        this.f16742a = true;
        AppMonitor.getInstance().register(SingleFlowStatistic.class);
        AppMonitor.getInstance().register(ChannelFlowStatistic.class);
        Context c2 = srj.c();
        if (c2 != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(c2);
            this.b = defaultSharedPreferences;
            this.f16742a = defaultSharedPreferences.getBoolean(CHANNEL_MONITOR_SWITCH_KEY, true);
        }
    }

    public static bzp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzp) ipChange.ipc$dispatch("a34cc358", new Object[0]);
        }
        if (c == null) {
            synchronized (bzp.class) {
                try {
                    if (c == null) {
                        c = new bzp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97aab3f", new Object[]{this, new Boolean(z)});
        } else if (this.f16742a != z) {
            this.f16742a = z;
            SharedPreferences sharedPreferences = this.b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean(CHANNEL_MONITOR_SWITCH_KEY, this.f16742a).apply();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r17, boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, long r25) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bzp.a(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }
}
