package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class mth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24294a;

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("101aef7b", new Object[]{this})).booleanValue();
        }
        return this.f24294a;
    }

    public abstract void b(cuh cuhVar);

    public abstract void c(iuh iuhVar);

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b629dbf", new Object[]{this, new Boolean(z)});
        } else {
            this.f24294a = z;
        }
    }
}
