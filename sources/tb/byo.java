package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class byo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final byo f16722a = new byo();

    static {
        t2o.a(993001815);
    }

    public static byo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byo) ipChange.ipc$dispatch("6a094d8e", new Object[0]);
        }
        return f16722a;
    }
}
