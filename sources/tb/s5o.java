package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ujd f27810a;

    static {
        t2o.a(589299734);
    }

    public static ujd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ujd) ipChange.ipc$dispatch("4234298e", new Object[0]);
        }
        return f27810a;
    }

    public static void b(ujd ujdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4854b05b", new Object[]{ujdVar});
        } else {
            f27810a = ujdVar;
        }
    }
}
