package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29185a;
    public final boolean b;

    static {
        t2o.a(153092127);
    }

    public u6v(boolean z, boolean z2) {
        this.f29185a = z;
        this.b = z2;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a2a6690", new Object[]{this})).booleanValue();
        }
        return this.f29185a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8980c6aa", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
