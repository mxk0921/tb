package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f24376a;
    public final int b;

    static {
        t2o.a(468714649);
    }

    public mxw(int i, int i2) {
        this.f24376a = i;
        this.b = i2;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7ef7087", new Object[]{this})).intValue();
        }
        return this.f24376a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff6aafab", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
