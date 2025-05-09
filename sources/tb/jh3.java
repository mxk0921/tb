package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jh3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXRuntimeContext f21991a;
    public Map<String, Object> b;

    static {
        t2o.a(350224389);
    }

    public DXRuntimeContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("75816a9f", new Object[]{this});
        }
        return this.f21991a;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1d70d2a", new Object[]{this});
        }
        return this.b;
    }

    public void c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7df5765", new Object[]{this, dXRuntimeContext});
        } else {
            this.f21991a = dXRuntimeContext;
        }
    }

    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e90f3c", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }
}
