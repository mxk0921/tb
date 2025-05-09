package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, bsp> f32270a = new LinkedHashMap();
    public final Map<String, a> b = new LinkedHashMap();
    public final Map<String, a.f> c = new LinkedHashMap();

    static {
        t2o.a(689963242);
    }

    public final void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad41c06", new Object[]{this, str, aVar});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(aVar, "liveRoomComponent");
        this.b.put(str, aVar);
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47cac90", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "tabFluidInstanceId");
        this.f32270a.put(str, new bsp(str2));
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f1788b", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        this.f32270a.remove(str);
        this.b.remove(str);
        this.c.remove(str);
    }

    public final a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a2ca2ec4", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        return (a) ((LinkedHashMap) this.b).get(str);
    }

    public final a.f e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.f) ipChange.ipc$dispatch("a261c691", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        return (a.f) ((LinkedHashMap) this.c).get(str);
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfab75a5", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        bsp bspVar = (bsp) ((LinkedHashMap) this.f32270a).get(str);
        if (bspVar != null) {
            return bspVar.a();
        }
        return null;
    }

    public final lr9 g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lr9) ipChange.ipc$dispatch("c84ec44a", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        bsp bspVar = (bsp) ((LinkedHashMap) this.f32270a).get(str);
        if (bspVar != null) {
            return bspVar.b();
        }
        return null;
    }

    public final void h(String str, a.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1066b9d", new Object[]{this, str, fVar});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(fVar, "interactiveMsgHandler");
        this.c.put(str, fVar);
    }

    public final void i(String str, lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07ea2c4", new Object[]{this, str, lr9Var});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        bsp bspVar = (bsp) ((LinkedHashMap) this.f32270a).get(str);
        if (bspVar != null) {
            bspVar.c(lr9Var);
        }
    }
}
