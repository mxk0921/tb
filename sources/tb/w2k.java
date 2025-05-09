package tb;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w2k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f30409a;

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
        synchronized (w2k.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
            }
            if (f30409a == null) {
                try {
                    if ((context.getApplicationInfo().flags & 2) != 0) {
                        z = true;
                    }
                } catch (Exception unused) {
                }
                f30409a = Boolean.valueOf(z);
            }
            return f30409a.booleanValue();
        }
    }
}
