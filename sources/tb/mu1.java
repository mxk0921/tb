package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Delta;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UltronDeltaProtocol f24305a;
    public final Delta b;
    public final boolean c;

    static {
        t2o.a(80740718);
    }

    public mu1(Delta delta, UltronDeltaProtocol ultronDeltaProtocol, boolean z) {
        this.b = delta;
        this.f24305a = ultronDeltaProtocol;
        this.c = z;
    }

    public Delta a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Delta) ipChange.ipc$dispatch("f995b4c", new Object[]{this});
        }
        return this.b;
    }

    public UltronDeltaProtocol b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDeltaProtocol) ipChange.ipc$dispatch("7f44a16c", new Object[]{this});
        }
        return this.f24305a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c069a7c1", new Object[]{this})).booleanValue();
        }
        return this.c;
    }
}
