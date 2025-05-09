package tb;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f23829a;

    static {
        t2o.a(794820634);
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
        synchronized (m7v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
            }
            if (f23829a == null) {
                try {
                    if ((context.getApplicationInfo().flags & 2) != 0) {
                        z = true;
                    }
                } catch (Exception unused) {
                }
                f23829a = Boolean.valueOf(z);
            }
            return f23829a.booleanValue();
        }
    }
}
