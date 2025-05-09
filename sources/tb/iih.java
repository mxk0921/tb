package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class iih {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final iih INSTANCE = new iih();

    static {
        t2o.a(144703604);
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1486b29c", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(str2, "msg");
        boc f = cjf.INSTANCE.f();
        if (f != null) {
            f.c("Megability/Internal", str, str2);
        }
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47075ea0", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(str2, "msg");
        boc f = cjf.INSTANCE.f();
        if (f != null) {
            f.b("Megability/Internal", str, str2);
        }
    }
}
