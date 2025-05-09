package tb;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f18248a = false;

    static {
        t2o.a(962593178);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a48500f", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("BootTime");
        uTHitBuilders$UTCustomHitBuilder.setProperty("bootTime", String.valueOf(currentTimeMillis));
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void sendBootTime(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f01f9fa", new Object[]{context});
        } else if (!f18248a) {
            f18248a = true;
            a();
        }
    }
}
