package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31074a;

    static {
        t2o.a(815793224);
    }

    public x1p(String str) {
        this.f31074a = str;
    }

    public static x1p a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x1p) ipChange.ipc$dispatch("2348d6a0", new Object[]{str});
        }
        return new x1p(str);
    }
}
