package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ayo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f16078a;

    static {
        t2o.a(993001814);
    }

    public ayo(int i) {
        this.f16078a = i;
    }

    public static ayo a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayo) ipChange.ipc$dispatch("c819fe48", new Object[]{new Integer(i)});
        }
        return new ayo(i);
    }
}
