package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zzy implements ofz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final can f33133a = can.Companion.h();

    static {
        t2o.a(598737116);
        t2o.a(598737400);
    }

    public final can a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (can) ipChange.ipc$dispatch("647f26fa", new Object[]{this});
        }
        return this.f33133a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ba624c5", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
