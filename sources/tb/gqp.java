package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gqp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean mInit = true;

    static {
        t2o.a(668991543);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec5ff65", new Object[0])).booleanValue();
        }
        return jts.b().c();
    }

    public static void b(Application application, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ae5629", new Object[]{application, str, str2, new Integer(i)});
        } else {
            jts.b().d(application, str, str2, i);
        }
    }
}
