package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.c;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w8x implements p6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeexInstanceImpl f30523a;
    public final c b;
    public final MUSMonitor c;
    public View d;
    public ppc e;
    public final Map<String, String> f = new HashMap();
    public final Map<String, Set<a.AbstractC0518a>> g = new HashMap();
    public final Map<String, Set<a.b>> h = new HashMap();

    static {
        t2o.a(982515887);
        t2o.a(982515879);
    }

    public w8x(WeexInstanceImpl weexInstanceImpl) {
        c cVar = new c();
        this.b = cVar;
        this.c = new MUSMonitor(cVar);
        this.f30523a = weexInstanceImpl;
    }

    @Override // tb.p6x
    public void a(String str, a.AbstractC0518a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebf5644", new Object[]{this, str, aVar});
        } else if (hxh.a()) {
            Set set = (Set) ((HashMap) this.g).get(str);
            if (set != null && !set.isEmpty()) {
                set.remove(aVar);
            }
        } else {
            throw new RuntimeException("please unregister native state listener in main thread");
        }
    }

    @Override // tb.p6x
    public void b(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a201246", new Object[]{this, str, bVar});
        } else if (hxh.a()) {
            Set set = (Set) ((HashMap) this.h).get(str);
            if (set == null) {
                set = new HashSet();
                ((HashMap) this.h).put(str, set);
            }
            set.add(bVar);
        } else {
            throw new RuntimeException("please register native state listener in main thread");
        }
    }

    @Override // tb.p6x
    public void c(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838ec55f", new Object[]{this, str, bVar});
        } else if (hxh.a()) {
            Set set = (Set) ((HashMap) this.h).get(str);
            if (set != null && !set.isEmpty()) {
                set.remove(bVar);
            }
        } else {
            throw new RuntimeException("please unregister native state listener in main thread");
        }
    }

    @Override // tb.p6x
    public MUSMonitor d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSMonitor) ipChange.ipc$dispatch("80fd497a", new Object[]{this});
        }
        return this.c;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e322dc8", new Object[]{this});
        } else {
            this.d = lxh.b().a(this.f30523a.getAdapterMUSInstance());
        }
    }

    public ppc f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppc) ipChange.ipc$dispatch("5863c127", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.p6x
    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
        } else if (hxh.a()) {
            Set<a.AbstractC0518a> set = (Set) ((HashMap) this.g).get(str);
            if (!(set == null || set.isEmpty())) {
                for (a.AbstractC0518a aVar : set) {
                    aVar.onNativeEvent(str, str2);
                }
            }
        } else {
            throw new RuntimeException("please fireNativeEvent on mainThread");
        }
    }

    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.p6x
    public c getMonitorInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("aab03e93", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.p6x
    public String getNativeState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d706e02b", new Object[]{this, str});
        }
        return (String) ((HashMap) this.f).get(str);
    }

    public void h(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc52e4fc", new Object[]{this, new Integer(i), str, new Long(j)});
        } else {
            this.c.b(i, str, j);
        }
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3af53e0", new Object[]{this, str, str2});
        } else {
            this.c.a(str, str2);
        }
    }

    public final void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a337dc", new Object[]{this, str, str2});
            return;
        }
        Set<a.b> set = (Set) ((HashMap) this.h).get(str);
        if (!(set == null || set.isEmpty())) {
            for (a.b bVar : set) {
                bVar.onNativeStateChange(str, str2);
            }
        }
    }

    public void k(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e21fa22", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.c.f(z, z2);
        }
    }

    public void l(ppc ppcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a305f555", new Object[]{this, ppcVar});
        } else {
            this.e = ppcVar;
        }
    }

    @Override // tb.p6x
    public void registerNativeEventCallback(String str, a.AbstractC0518a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a2a1e3", new Object[]{this, str, aVar});
        } else if (hxh.a()) {
            Set set = (Set) ((HashMap) this.g).get(str);
            if (set == null) {
                set = new HashSet();
                ((HashMap) this.g).put(str, set);
            }
            set.add(aVar);
        } else {
            throw new RuntimeException("please register native state listener in main thread");
        }
    }

    @Override // tb.p6x
    public void setMonitorDetailDims(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6eebaf", new Object[]{this, str, str2});
        } else {
            this.c.j(str, str2);
        }
    }

    @Override // tb.p6x
    public void setMonitorDetailTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1117f61d", new Object[]{this, str, new Long(j)});
        } else {
            this.c.k(str, j);
        }
    }

    @Override // tb.p6x
    public void updateNativeState(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820dbf4c", new Object[]{this, str, str2});
            return;
        }
        ((HashMap) this.f).put(str, str2);
        j(str, str2);
    }
}
