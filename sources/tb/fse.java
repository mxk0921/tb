package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.controller.SubRewardNiubilityEnterEventController;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fse implements oec, r3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19502a;
    public final t54 b;
    public ArrayList<w3c> c;
    public iuq d;
    public vtq e;
    public stq f;
    public buq g;
    public SubRewardNiubilityEnterEventController h;
    public d i;
    public volatile boolean j;
    public final FrameLayout k;
    public final FrameLayout l;
    public final ConcurrentHashMap<Object, Long> m = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> n = new ConcurrentHashMap<>();
    public final IInteractiveProxy.f o;
    public IInteractiveProxy.h p;
    public final e q;
    public boolean r;
    public final boolean s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Comparator<w3c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(fse fseVar) {
        }

        /* renamed from: a */
        public int compare(w3c w3cVar, w3c w3cVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("23089765", new Object[]{this, w3cVar, w3cVar2})).intValue();
            }
            return w3cVar2.getPriority() - w3cVar.getPriority();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fse.i(fse.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fse.j(fse.this, false);
            q0h.b("ImportantEventController", "endConsumeMessage mIsConsuming false");
            fse.this.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295698720);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/ImportantEventController$ImportantEventHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends sxp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (fse.l(fse.this) != null) {
                    fse.l(fse.this).x();
                }
            }
        }

        static {
            t2o.a(295698721);
        }

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/ImportantEventController$ImportantEventInteractiveLife");
        }

        @Override // tb.cgc
        public void m(IInteractiveProxy.e eVar, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e043eb2", new Object[]{this, eVar, map});
                return;
            }
            fse.k(fse.this).put(eVar.getName(), eVar);
            q0h.b("ImportantEventController", "receive component name:" + eVar.getName());
            if (Looper.getMainLooper() != Looper.myLooper()) {
                fse.m(fse.this).post(new a());
            } else if (fse.l(fse.this) != null) {
                fse.l(fse.this).x();
            }
        }

        public /* synthetic */ e(fse fseVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(295698716);
        t2o.a(295698714);
        t2o.a(295698712);
    }

    public fse(Context context, t54 t54Var, FrameLayout frameLayout, FrameLayout frameLayout2, boolean z) {
        this.f19502a = context;
        this.b = t54Var;
        this.k = frameLayout;
        this.l = frameLayout2;
        this.s = z;
        if (t54Var != null) {
            this.p = t54Var.z0();
        }
        e eVar = new e(this, null);
        this.q = eVar;
        IInteractiveProxy.h hVar = this.p;
        if (hVar != null) {
            this.o = hVar.d();
        }
        if (!this.r) {
            this.r = true;
            IInteractiveProxy.h hVar2 = this.p;
            if (!(hVar2 == null || hVar2.q() == null)) {
                this.p.q().h(eVar);
            }
        }
        q();
    }

    public static /* synthetic */ void i(fse fseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8deebc", new Object[]{fseVar});
        } else {
            fseVar.p();
        }
    }

    public static /* synthetic */ boolean j(fse fseVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d637779", new Object[]{fseVar, new Boolean(z)})).booleanValue();
        }
        fseVar.j = z;
        return z;
    }

    public static /* synthetic */ ConcurrentHashMap k(fse fseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("90459f68", new Object[]{fseVar});
        }
        return fseVar.n;
    }

    public static /* synthetic */ vtq l(fse fseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vtq) ipChange.ipc$dispatch("4155603", new Object[]{fseVar});
        }
        return fseVar.e;
    }

    public static /* synthetic */ d m(fse fseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b473f74c", new Object[]{fseVar});
        }
        return fseVar.i;
    }

    @Override // tb.r3c
    public void a(boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c684c7", new Object[]{this, new Boolean(z)});
        } else if (this.j) {
            d dVar = this.i;
            c cVar = new c();
            if (z) {
                j = k0r.G().longValue();
            } else {
                j = 0;
            }
            dVar.postDelayed(cVar, j);
        }
    }

    @Override // tb.r3c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb8ab74", new Object[]{this});
        } else if (!this.j) {
            t54 t54Var = this.b;
            if (t54Var != null && t54Var.j() != null && this.b.j().d()) {
                return;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                p();
            } else {
                this.i.post(new b());
            }
        }
    }

    @Override // tb.r3c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0ea3ad", new Object[]{this});
        } else {
            a(true);
        }
    }

    @Override // tb.r3c
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8b551", new Object[]{this, obj});
        } else {
            this.m.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    @Override // tb.r3c
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de67efac", new Object[]{this, str})).booleanValue();
        }
        IInteractiveProxy.f fVar = this.o;
        if (fVar == null || fVar.c(str) == null || !this.o.c(str).isInitComponentComplete()) {
            return this.n.containsKey(str);
        }
        return true;
    }

    @Override // tb.r3c
    public ViewGroup f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("32b993dd", new Object[]{this});
        }
        return this.l;
    }

    @Override // tb.r3c
    public ux9 getFrameContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("59d375df", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.r3c
    public Handler getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.i;
    }

    @Override // tb.r3c
    public ViewGroup getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.k;
    }

    @Override // tb.r3c
    public boolean h(w3c w3cVar) {
        w3c w3cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6dfe67", new Object[]{this, w3cVar})).booleanValue();
        }
        boolean z = false;
        for (int i = 0; i < this.c.size() && (w3cVar2 = this.c.get(i)) != w3cVar; i++) {
            if (w3cVar2.c()) {
                z = true;
            }
        }
        return z;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.r = false;
        IInteractiveProxy.h hVar = this.p;
        if (!(hVar == null || hVar.q() == null)) {
            this.p.q().f(this.q);
        }
        d dVar = this.i;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
        if (this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                w3c w3cVar = this.c.get(i);
                if (w3cVar != null) {
                    w3cVar.destroy();
                }
            }
        }
        this.n.clear();
        this.m.clear();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        t54 t54Var = this.b;
        if (t54Var != null) {
            this.p = t54Var.z0();
        }
        if (!this.r) {
            this.r = true;
            IInteractiveProxy.h hVar = this.p;
            if (!(hVar == null || hVar.q() == null)) {
                this.p.q().h(this.q);
            }
        }
        this.j = false;
        ArrayList<w3c> arrayList = new ArrayList<>();
        this.c = arrayList;
        arrayList.add(this.e);
        this.c.add(this.d);
        this.c.add(this.g);
        this.c.add(this.f);
        this.c.add(this.h);
        Collections.sort(this.c, new a(this));
        for (int i = 0; i < this.c.size(); i++) {
            w3c w3cVar = this.c.get(i);
            if (w3cVar != null) {
                w3cVar.init();
            }
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc12200", new Object[]{this});
            return;
        }
        this.i = new d();
        this.d = new iuq(this, this.b, this.s);
        this.e = new vtq(this, this.f19502a, this.b, this.s);
        this.h = new SubRewardNiubilityEnterEventController(this, this.b);
        this.f = new stq(this, this.b);
        this.g = new buq(this, this.b);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768e5159", new Object[]{this});
        } else {
            b();
        }
    }

    public void s(VideoInfo.AccountTag accountTag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633fb8f9", new Object[]{this, accountTag});
            return;
        }
        iuq iuqVar = this.d;
        if (iuqVar != null) {
            iuqVar.h(accountTag);
        }
    }

    public void t(List<ImportantEventItem> list) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b7649b", new Object[]{this, list});
            return;
        }
        vtq vtqVar = this.e;
        if (vtqVar != null) {
            vtqVar.y(list);
        }
        if (!this.s) {
            b();
        }
        StringBuilder sb = new StringBuilder("updateImportantData");
        if (list == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(list.size());
        }
        sb.append(obj);
        q0h.b("ImportantEventController", sb.toString());
    }

    @Override // tb.r3c
    public boolean g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aabcf4cb", new Object[]{this, obj})).booleanValue();
        }
        if (this.m.isEmpty() || !this.m.containsKey(obj)) {
            return true;
        }
        Long l = this.m.get(obj);
        if (l == null) {
            l = 0L;
        }
        if (SystemClock.elapsedRealtime() - l.longValue() > k0r.H().longValue()) {
            try {
                if (obj instanceof ImportantEventItem) {
                    q0h.b("ImportantEventController", "type:" + ((ImportantEventItem) obj).type + "utParams:" + ((ImportantEventItem) obj).utParams.showParams);
                }
                return true;
            } catch (Exception e2) {
                q0h.a("ImportantEventController", "isMessageTimeout Exception:" + e2.getMessage());
                return true;
            }
        } else {
            this.m.remove(obj);
            return false;
        }
    }

    public final void p() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb6e9b0", new Object[]{this});
            return;
        }
        if (this.s) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                w3c w3cVar = this.c.get(i2);
                if (w3cVar.a()) {
                    this.j = true;
                    w3cVar.b();
                    break;
                }
            }
        }
        while (true) {
            if (i >= this.c.size()) {
                break;
            }
            w3c w3cVar2 = this.c.get(i);
            if (w3cVar2.c()) {
                this.j = true;
                w3cVar2.b();
                break;
            }
            i++;
        }
        t54 t54Var = this.b;
        String C = t54Var == null ? null : t54Var.C();
        if (!this.j) {
            getFrameContext().h().c(uyg.EVENT_RESUME_GIFT_MESSAGE, "start", C);
            q0h.b("ImportantEventController", "notify gift message start resume");
            return;
        }
        getFrameContext().h().c(uyg.EVENT_RESUME_GIFT_MESSAGE, "stop", C);
        q0h.b("ImportantEventController", "notify gift message stop resume");
    }
}
