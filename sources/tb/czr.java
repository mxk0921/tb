package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fbe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class czr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static fbe f17472a = new dzr();

    static {
        t2o.a(773849128);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8838b25", new Object[]{context})).booleanValue();
        }
        return ((dzr) f17472a).b(context);
    }

    public static void b(String str, String str2, Context context, boolean z, fbe.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3cc413", new Object[]{str, str2, context, new Boolean(z), aVar});
        } else {
            ((dzr) f17472a).c(str, str2, context, z, aVar);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[0])).booleanValue();
        }
        return ((dzr) f17472a).d();
    }

    public static void d(fbe fbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a8dd4a", new Object[]{fbeVar});
        } else {
            f17472a = fbeVar;
        }
    }
}
