package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yak {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static yko f31939a;
    public static zko b;
    public static zko c;

    static {
        t2o.a(815793365);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c3b04b", new Object[0]);
        } else if (f31939a == null && c == null) {
            zko zkoVar = new zko();
            zkoVar.q(new xvr());
            c = zkoVar;
        }
    }
}
