package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32994a;
    public final v3o b;

    static {
        t2o.a(481296616);
    }

    public zso() {
        this(null, null, 3, null);
    }

    public final v3o a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v3o) ipChange.ipc$dispatch("1fcd7d6d", new Object[]{this});
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return this.f32994a;
    }

    public zso(String str, v3o v3oVar) {
        this.f32994a = str;
        this.b = v3oVar;
    }

    public /* synthetic */ zso(String str, v3o v3oVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : v3oVar);
    }
}
