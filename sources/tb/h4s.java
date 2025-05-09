package tb;

import android.os.Build;
import android.os.Trace;
import androidx.core.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356496);
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7879ee40", new Object[]{str, new Integer(i)});
        } else if (d4s.d(d4s.SWITCH_ENABLE_T_LIVE_TRACE)) {
            o3s.b("TLiveTrace", "beginAsyncSection " + str + " cookie = " + i);
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.beginAsyncSection("TLiveTrace/" + str, i);
            }
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else if (d4s.d(d4s.SWITCH_ENABLE_T_LIVE_TRACE)) {
            TraceCompat.beginSection("TLiveTrace/" + str);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb3d417", new Object[]{str, str2});
        } else if (d4s.d(d4s.SWITCH_ENABLE_T_LIVE_TRACE)) {
            TraceCompat.beginSection("TLiveTrace/" + (str + "/" + str2));
        }
    }

    public static void d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cbe0ce", new Object[]{str, new Integer(i)});
        } else if (d4s.d(d4s.SWITCH_ENABLE_T_LIVE_TRACE)) {
            o3s.b("TLiveTrace", "endAsyncSection " + str + " cookie = " + i);
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection("TLiveTrace/" + str, i);
            }
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else if (d4s.d(d4s.SWITCH_ENABLE_T_LIVE_TRACE)) {
            TraceCompat.endSection();
        }
    }
}
