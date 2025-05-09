package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.i;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ptj implements a0d, hwc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public i f26293a = null;

    public ptj() {
        d();
    }

    @Override // tb.a0d
    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c969558", new Object[]{this, str, str2, map});
        }
    }

    @Override // tb.hwc
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27fb3a9b", new Object[]{this, str, map});
        }
    }

    @Override // tb.a0d
    public void c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a02c03", new Object[]{this, str, map});
        } else if (!yq7.c(this.f26293a)) {
            this.f26293a.e(1);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        zzb<?> b = yq7.b(ic.NETWORK_STAGE_DISPATCHER);
        if (b instanceof i) {
            this.f26293a = (i) b;
        }
    }

    @Override // tb.a0d
    public void onEvent(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b3d9af", new Object[]{this, str, str2, map});
        }
    }

    @Override // tb.a0d
    public void onRequest(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f665a", new Object[]{this, str, str2, map});
        } else if (!yq7.c(this.f26293a)) {
            this.f26293a.e(0);
        }
    }
}
