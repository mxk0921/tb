package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ltn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long ONE_DAY = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final aob f23559a = fz3.d();

    static {
        t2o.a(789577807);
    }

    public static aob a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aob) ipChange.ipc$dispatch("c6204dff", new Object[0]);
        }
        return f23559a;
    }
}
