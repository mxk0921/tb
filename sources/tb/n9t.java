package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n9t implements efc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809288);
        t2o.a(486539304);
    }

    @Override // tb.efc
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12b9171", new Object[]{this, str, str2});
        } else {
            phg.c(str, str2);
        }
    }

    @Override // tb.efc
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38b0738", new Object[]{this, str, str2});
        } else {
            phg.n(str, str2);
        }
    }
}
