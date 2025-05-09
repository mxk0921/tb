package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nc8 implements cfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final arb f24636a = new g1b();

    static {
        t2o.a(729810120);
        t2o.a(488636419);
    }

    @Override // tb.cfc
    public <T extends ISubService> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISubService) ipChange.ipc$dispatch("3e2437be", new Object[]{this, cls}));
        }
        return null;
    }

    @Override // tb.cfc
    public arb getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arb) ipChange.ipc$dispatch("6e3f0e14", new Object[]{this});
        }
        return this.f24636a;
    }
}
