package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class wtl implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private yjv f30915a;

    static {
        t2o.a(950009866);
    }

    public wtl(yjv yjvVar) {
        this.f30915a = yjvVar;
    }

    public yjv getUpdateListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yjv) ipChange.ipc$dispatch("83d0ab17", new Object[]{this});
        }
        return this.f30915a;
    }
}
