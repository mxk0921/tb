package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ng3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f24711a;
    public final int b;
    public final boolean c;

    static {
        t2o.a(993001798);
    }

    public ng3(int i, int i2, boolean z) {
        this.f24711a = i;
        this.b = i2;
        this.c = z;
    }

    public static ng3 a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ng3) ipChange.ipc$dispatch("e3110b5c", new Object[]{new Integer(i), new Integer(i2)});
        }
        return new ng3(i, i2, true);
    }

    public static ng3 b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ng3) ipChange.ipc$dispatch("8c527c46", new Object[]{new Integer(i), new Integer(i2)});
        }
        return new ng3(i, i2, false);
    }
}
