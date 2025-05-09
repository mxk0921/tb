package tb;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f24562a;

    static {
        t2o.a(83886320);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context == null) {
            return false;
        }
        return b(context);
    }

    public static synchronized boolean b(Context context) {
        boolean z = false;
        synchronized (n7v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
            }
            if (f24562a == null) {
                try {
                    if ((context.getApplicationInfo().flags & 2) != 0) {
                        z = true;
                    }
                } catch (Exception unused) {
                }
                f24562a = Boolean.valueOf(z);
            }
            return f24562a.booleanValue();
        }
    }
}
