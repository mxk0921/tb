package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class by5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXEvent f16709a;

    static {
        t2o.a(444596837);
    }

    public DXEvent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("b550ed8d", new Object[]{this});
        }
        return this.f16709a;
    }

    public void b(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef484761", new Object[]{this, dXEvent});
        } else {
            this.f16709a = dXEvent;
        }
    }
}
