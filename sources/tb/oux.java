package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import tao.reactivex.b.a;
import tao.reactivex.b.c;
import tao.reactivex.b.d;
import tao.reactivex.b.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class oux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097500);
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
            return;
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!b(th)) {
            th = new f(th);
        }
        MsgLog.f("RxJavaPlugins", th, "exception happened");
        th.printStackTrace();
        c(th);
    }

    public static boolean b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd742bb0", new Object[]{th})).booleanValue();
        }
        if (!(th instanceof d) && !(th instanceof c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof a)) {
            return false;
        }
        return true;
    }

    public static void c(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4d7ecb", new Object[]{th});
            return;
        }
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
