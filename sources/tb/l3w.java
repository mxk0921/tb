package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l3w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f23099a;
    public final float b;
    public final float c;

    static {
        t2o.a(297795630);
    }

    public l3w(float f, float f2, float f3) {
        this.f23099a = f;
        this.b = f2;
        this.c = f3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f23099a + "," + this.b + "," + this.c;
    }
}
