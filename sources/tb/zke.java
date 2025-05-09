package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class zke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705376);
    }

    public static void a(yke ykeVar, fyp fypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ac8bb7", new Object[]{ykeVar, fypVar});
        } else {
            ykeVar.e = fypVar;
        }
    }
}
