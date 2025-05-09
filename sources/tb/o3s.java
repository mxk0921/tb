package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356493);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (v2s.o().A() == null) {
            TLog.logd("TBLive", str, str2);
        } else {
            v2s.o().A().b(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (v2s.o().A() == null) {
            TLog.loge("TBLive", str, str2);
        } else {
            v2s.o().A().c(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else if (v2s.o().A() == null) {
            TLog.loge("TBLive", str, str2, th);
        } else {
            v2s.o().A().f(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else if (v2s.o().A() == null) {
            TLog.logi("TBLive", str, str2);
        } else {
            v2s.o().A().a(str, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
        } else if (v2s.o().A() == null) {
            TLog.logv("TBLive", str, str2);
        } else {
            v2s.o().A().e(str, str2);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else if (v2s.o().A() == null) {
            TLog.logw("TBLive", str, str2);
        } else {
            v2s.o().A().d(str, str2);
        }
    }
}
