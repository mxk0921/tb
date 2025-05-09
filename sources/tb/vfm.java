package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vfm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f29984a = cam.a("homePopOpenDebug");

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b1f7d2a", new Object[0])).booleanValue();
        }
        return f29984a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4852c9b", new Object[0])).booleanValue();
        }
        if (a() || cw6.b()) {
            return true;
        }
        return false;
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56467d7d", new Object[]{str, str2});
        } else {
            TLog.loge(PopConst.LOG_TAG_HOME_POP, str, str2);
        }
    }

    public static void d(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea52657", new Object[]{str, th});
            return;
        }
        TLog.loge(PopConst.LOG_TAG_HOME_POP, "exception " + str, th);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a93b140", new Object[]{str, str2});
        } else if (b()) {
            TLog.logi(PopConst.LOG_TAG_HOME_POP, str, str2);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7de4e", new Object[]{str, str2});
        } else {
            TLog.loge(PopConst.LOG_TAG_HOME_POP, str, str2);
        }
    }
}
