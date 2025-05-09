package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u6t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHINA_UNICOM_NETFLOW_LASTDATE = "ChinaUnicomNetFlowLastDate";
    public static final String NON_CHINA_UNICOM_NETFLOW_LASTDATE = "NonChinaUnicomNetFlowLastDate";
    public static final String SHOW_TIME_PLAY_BOTTOM_TOAST = "showTimePlayBottomToast";
    public static final String SHOW_TIME_RIGHT_SCROLL_TIPS = "showTimeRightScrollTips";

    static {
        t2o.a(806355863);
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcc7b33", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences("TaoLiveTimeMove", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{str});
        }
        return v2s.o().f().getApplication().getSharedPreferences("taolive", 0).getString(str, "");
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return (v2s.o().f() == null || v2s.o().f().getApplication() == null) ? z : v2s.o().f().getApplication().getSharedPreferences("taolive", 0).getBoolean(str, z);
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7149c7f7", new Object[]{str})).longValue();
        }
        return v2s.o().f().getApplication().getSharedPreferences("taolive", 0).getLong(str, 0L);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306d747d", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences("taolive", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ae223d", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences("taolive", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c007ba95", new Object[]{str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences("taolive", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }
}
