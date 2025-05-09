package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.core.TrackManager;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.aak;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s0r implements cud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wnq f27732a;
    public final Context b;
    public final ys7 c;
    public final lch d;
    public final qal e;
    public final Map<String, f0r> f = new HashMap();
    public final Map<String, String> g = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements aak.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrackManager f27733a;

        public a(TrackManager trackManager) {
            this.f27733a = trackManager;
        }

        @Override // tb.aak.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82685e6c", new Object[]{this});
            } else {
                this.f27733a.d(s0r.this);
            }
        }
    }

    public s0r(Context context, wnq wnqVar, TrackManager trackManager) {
        this.c = null;
        this.b = context;
        this.f27732a = wnqVar;
        aak aakVar = aak.b.helper;
        aakVar.g(context);
        aakVar.h(new a(trackManager));
        this.c = new ys7(wnqVar, aakVar);
        this.d = new lch(wnqVar, aakVar);
        this.e = new qal(wnqVar, aakVar);
        j();
        k();
    }

    @Override // tb.cud
    public qal b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qal) ipChange.ipc$dispatch("14726a33", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.cud
    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2143ab8", new Object[]{this, str});
        }
        if (!((ConcurrentHashMap) this.g).containsKey(str)) {
            return null;
        }
        Map<String, String> a2 = this.e.a();
        if (a2.containsKey(str)) {
            return a2.get(str);
        }
        return (String) ((ConcurrentHashMap) this.g).get(str);
    }

    @Override // tb.cud
    public ys7 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ys7) ipChange.ipc$dispatch("7da73cc9", new Object[]{this});
        }
        return this.c;
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8180e136", new Object[]{this, str});
        }
        return this.f27732a.m(str);
    }

    public lch g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lch) ipChange.ipc$dispatch("34aba781", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.cud
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.b;
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d957b4bc", new Object[]{this, str})).booleanValue();
        }
        if (!((HashMap) this.f).containsKey(str)) {
            return new b77(this, str).isOpen();
        }
        return ((f0r) ((HashMap) this.f).get(str)).isOpen();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c.f(this.b);
        this.d.b(this.b);
        this.e.d(this.b);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e85f8dd", new Object[]{this});
            return;
        }
        ((HashMap) this.f).put(bud.KEY_NEW_FACE_ENABLE, new szj(this));
        ((HashMap) this.f).put(bud.KEY_NEW_CONTENT_ENABLE, new swj(this));
        ((HashMap) this.f).put("new2021UIEnable", new iwj(this));
        ((HashMap) this.f).put(bud.KEY_SUBSCRIBE_ENABLE, new u1k(this));
        ((HashMap) this.f).put(bud.KEY_NEW_FACE_OVERSEAS_ENABLE, new ezj(this));
        ((HashMap) this.f).put(bud.KEY_NEW_DISCOVERY_ENABLE, new tyj(this));
        ((HashMap) this.f).put(bud.KEY_MAIN_ARCH_UPGRADE, new y1k(this));
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff1bedf", new Object[]{this});
            return;
        }
        Map<String, ?> j = this.f27732a.j();
        for (String str : j.keySet()) {
            Object obj = j.get(str);
            if (obj instanceof String) {
                this.g.put(str, (String) obj);
            }
        }
    }

    @Override // tb.cud
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc49cdb5", new Object[]{this});
        }
        boolean n = TBRevisionSwitchManager.c().n();
        if (this.c.c().c().b(bud.KEY_NEW_FACE_ENABLE) && this.e.b().c().c(bud.KEY_NEW_FACE_ENABLE, true)) {
            boolean z = n ? 1 : 0;
            char c = n ? 1 : 0;
            n = z | true;
        }
        int i = n ? 1 : 0;
        int i2 = n ? 1 : 0;
        return String.valueOf(i);
    }

    @Override // tb.cud
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532db860", new Object[]{this})).booleanValue();
        }
        return (!this.d.a("location") || this.c.c() == null || this.c.c().f() == null) ? false : true;
    }

    public void l(Map<String, String> map, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2117da7a", new Object[]{this, map, new Boolean(z), new Integer(i)});
            return;
        }
        if (z) {
            this.f27732a.a();
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            this.f27732a.i(str, map.get(str));
        }
        if (i == 0) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue not notify !");
        } else if (i == 1) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue immediately !");
            for (String str2 : keySet) {
                ((ConcurrentHashMap) this.g).put(str2, map.get(str2));
            }
            aak aakVar = aak.b.helper;
            aakVar.d();
            aakVar.c();
        } else if (i == 2) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue background !");
            for (String str3 : keySet) {
                ((ConcurrentHashMap) this.g).put(str3, map.get(str3));
            }
            aak.b.helper.f();
        }
    }
}
