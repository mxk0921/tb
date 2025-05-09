package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.uikit.api.TBLiveBaseComponentView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bjr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static bjr b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Object, djr> f16432a = new HashMap();

    static {
        t2o.a(779093679);
    }

    public static bjr d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjr) ipChange.ipc$dispatch("6d47fe2f", new Object[0]);
        }
        if (b == null) {
            b = new bjr();
        }
        return b;
    }

    public void a(Object obj, TBLiveBaseComponentView tBLiveBaseComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f28954f", new Object[]{this, obj, tBLiveBaseComponentView});
            return;
        }
        djr djrVar = (djr) ((HashMap) this.f16432a).get(obj);
        if (djrVar == null) {
            djrVar = new djr();
            ((HashMap) this.f16432a).put(obj, djrVar);
        }
        djrVar.a(tBLiveBaseComponentView);
    }

    public void b(Object obj, twg twgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e110a", new Object[]{this, obj, twgVar});
            return;
        }
        djr djrVar = (djr) ((HashMap) this.f16432a).get(obj);
        if (djrVar == null) {
            djrVar = new djr();
            ((HashMap) this.f16432a).put(obj, djrVar);
        }
        djrVar.b(twgVar);
    }

    public void c(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1b0808", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        djr djrVar = (djr) ((HashMap) this.f16432a).get(obj);
        if (djrVar != null) {
            djrVar.d(z);
        }
    }

    public void e(Object obj, TBLiveBaseComponentView tBLiveBaseComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e9adb2", new Object[]{this, obj, tBLiveBaseComponentView});
            return;
        }
        djr djrVar = (djr) ((HashMap) this.f16432a).get(obj);
        if (djrVar != null) {
            djrVar.e(tBLiveBaseComponentView);
        }
    }

    public void f(Object obj, twg twgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44546d47", new Object[]{this, obj, twgVar});
            return;
        }
        djr djrVar = (djr) ((HashMap) this.f16432a).get(obj);
        if (djrVar != null) {
            djrVar.f(twgVar);
        }
    }
}
