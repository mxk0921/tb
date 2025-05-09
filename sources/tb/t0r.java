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
public class t0r implements cud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wnq f28392a;
    public final Context b;
    public final lch c;
    public final qal d;
    public final Map<String, String> e = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements aak.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrackManager f28393a;

        public a(TrackManager trackManager) {
            this.f28393a = trackManager;
        }

        @Override // tb.aak.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82685e6c", new Object[]{this});
            } else {
                this.f28393a.d(t0r.this);
            }
        }
    }

    public t0r(Context context, wnq wnqVar, TrackManager trackManager) {
        new HashMap();
        this.b = context;
        this.f28392a = wnqVar;
        aak aakVar = aak.b.helper;
        aakVar.g(context);
        aakVar.h(new a(trackManager));
        this.c = new lch(wnqVar, aakVar);
        this.d = new qal(wnqVar, aakVar);
        j();
    }

    @Override // tb.cud
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc49cdb5", new Object[]{this});
        }
        boolean n = TBRevisionSwitchManager.c().n();
        if (TBRevisionSwitchManager.c().o()) {
            boolean z = n ? 1 : 0;
            char c = n ? 1 : 0;
            n = z | true;
        }
        int i = n ? 1 : 0;
        int i2 = n ? 1 : 0;
        return String.valueOf(i);
    }

    @Override // tb.cud
    public qal b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qal) ipChange.ipc$dispatch("14726a33", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.cud
    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2143ab8", new Object[]{this, str});
        }
        if (!((ConcurrentHashMap) this.e).containsKey(str)) {
            return null;
        }
        Map<String, String> a2 = this.d.a();
        if (a2.containsKey(str)) {
            return a2.get(str);
        }
        return (String) ((ConcurrentHashMap) this.e).get(str);
    }

    @Override // tb.cud
    public ys7 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ys7) ipChange.ipc$dispatch("7da73cc9", new Object[]{this});
        }
        return null;
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8180e136", new Object[]{this, str});
        }
        return this.f28392a.m(str);
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c36a30b3", new Object[]{this, str});
        }
        return h(str, false);
    }

    @Override // tb.cud
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.b;
    }

    public String h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d1a0a99", new Object[]{this, str, new Boolean(z)});
        }
        if (z) {
            String f = f(str);
            TLog.loge("SwitchManager", "getSwitch inDisk: key: " + str + "; value: " + f);
            return f;
        }
        String d = d(str);
        TLog.loge("SwitchManager", "getSwitch not inDisk: key: " + str + "; value: " + d);
        return d;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.c.b(this.b);
        this.d.d(this.b);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff1bedf", new Object[]{this});
            return;
        }
        Map<String, ?> j = this.f28392a.j();
        for (String str : j.keySet()) {
            Object obj = j.get(str);
            if (obj instanceof String) {
                this.e.put(str, (String) obj);
            }
        }
    }

    @Override // tb.cud
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532db860", new Object[]{this})).booleanValue();
        }
        return this.c.a("location");
    }

    public void k(Map<String, String> map, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2117da7a", new Object[]{this, map, new Boolean(z), new Integer(i)});
            return;
        }
        if (z) {
            this.f28392a.a();
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            this.f28392a.i(str, map.get(str));
        }
        if (i == 0) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue not notify !");
        } else if (i == 1) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue immediately !");
            for (String str2 : keySet) {
                ((ConcurrentHashMap) this.e).put(str2, map.get(str2));
            }
            aak aakVar = aak.b.helper;
            aakVar.d();
            aakVar.c();
        } else if (i == 2) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue background !");
            for (String str3 : keySet) {
                ((ConcurrentHashMap) this.e).put(str3, map.get(str3));
            }
            aak.b.helper.f();
        }
    }
}
