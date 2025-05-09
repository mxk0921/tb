package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class x1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f31075a = new Object();

    static {
        t2o.a(343933177);
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9da17462", new Object[]{this, str});
        }
        return null;
    }

    public abstract void b(String str, String str2, int i, int i2);

    public abstract void c(f2r f2rVar);

    public String d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d93d8b7d", new Object[]{this, obj});
        }
        return null;
    }
}
